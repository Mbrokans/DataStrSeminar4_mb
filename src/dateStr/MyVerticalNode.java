package dateStr;

public class MyVerticalNode<Ttype> {
		
	private Ttype element;
	private MyEdgeNode firstEdgeNode = null;
	
	
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	
	public Ttype getElement() {
		return element;
	}
	public void setElement(Ttype element) {
		if(element!=null) {
		this.element = element;
		}
		else {
			this.element=(Ttype) new Object();
		}
	}

	public void setFirstEdgeNode(MyEdgeNode firstEdgeNode) {
		this.firstEdgeNode = firstEdgeNode;
	}
	
	public MyVerticalNode(Ttype element) {
		setElement(element);
	}

	public String toString() {
		String result = element + ": ";
		MyEdgeNode currentEdgeNode = firstEdgeNode;
		
		while(currentEdgeNode!=null) {
			result+= "-> [" + currentEdgeNode.getIndexOfVerticalTo()+ "] "
					+ currentEdgeNode.getWeight() + " ";
			currentEdgeNode = currentEdgeNode.getNextEdgeNode();
		}
		
		return result;
		}
	}
