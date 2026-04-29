package dateStr;

public class MyGraph<Ttype>{
	private MyVerticalNode<Ttype>[] vertices;
	private final int DEFAULT_SIZE = 5;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;
	
	public int getHowManyElements()
	{
		return howManyElements;
	}
	
	public MyGraph() {
		vertices = new MyVerticalNode[size];
	}
	
	public MyGraph(int inputSize) {
		if(inputSize > 0 && inputSize < 1000) {
			size = inputSize;
		}
		
		vertices = new MyVerticalNode[size];
	}
	public boolean isEmpty() {
		return (howManyElements==0);
	}
	public boolean isFull() {
		return (howManyElements==size);
	}
	public void resize() {
		int newSize=(size<=100)? (size*2) : ((int)(size*1.5));
		
		MyVerticalNode<Ttype>[] newVertice= new MyVerticalNode[newSize];
		
		for(int i=0; i<howManyElements;i++) {
			newVertice[i]= vertices[i];
		}
		size=newSize;
		vertices=newVertice;
		System.gc();
	}
	public void addVertice(Ttype element) throws Exception {
		if(element==null) {
			throw new Exception("Elements nevaru but bez references");
		}
		for(int i=0;i<howManyElements;i++) {
			if(vertices[i].getElement().equals(element)) {
				throw new Exception("Tads elements jau eksiste grafa");
			}
		}
		if(isFull()) {
			resize();
		}
		MyVerticalNode newVerticeNode =  new MyVerticalNode();
		vertices[howManyElements]=newVerticeNode;
		howManyElements++;
		
	}
	public void addEdge(Ttype elementFrom, Ttype elementTo, int weight) throws Exception{
		if(elementFrom==null || elementTo==null || weight<=0) {
			throw new Exception("kads no ievades parametriem nav atbilstos");
		}
		int indexOfElementfrom= findVertice(elementFrom);
		int indexOfelementTo= findVertice(elementTo);
		MyEdgeNode newEdge = new MyEdgeNode(indexOfelementTo, weight);
		MyVerticalNode verticeNodeFrom = vertices[indexOfElementfrom];
		if(verticeNodeFrom.getFirstEdgeNode()==null) {
			verticeNodeFrom.setFirstEdgeNode(newEdge);
		}
		else {
			MyEdgeNode currentNode = verticeNodeFrom.getFirstEdgeNode();
			while(currentNode.getNextEdgeNode()!=null) {
				currentNode= currentNode.getNextEdgeNode();
			}
			currentNode.setNextEdgeNode(newEdge);
		}
		
	}
	private int findVertice(Ttype element) throws Exception{
		if(element==null) {
			throw new Exception("Elements nevaru but bez references");
		}
		for(int i=0;i<howManyElements;i++) {
			if(vertices[i].getElement().equals(element)) {
				return i;
			}
		}
		throw new Exception("Mekle virsotne nav atrasta");
	}

	public void print() throws Exception{
		if(isEmpty()) {
			throw new Exception("Grafs ir tukšs un to nevar izprintēt");
		}
		
		for(int i = 0; i < howManyElements; i++) {
			System.out.println(vertices[i].toString());//toString no MyVerticeNode
		}
	}	
}