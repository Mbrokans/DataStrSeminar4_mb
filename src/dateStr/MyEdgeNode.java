package dateStr;

public class MyEdgeNode {
	private int indexOfVerticalTo;
	private int weight;
	private MyEdgeNode nextEdgeNode = null;
	
	public MyEdgeNode getNextEdgeNode() {
		return nextEdgeNode;
	}
	public int getWeight() {
		return weight;
	}
	public int getIndexOfVerticalTo() {
		return indexOfVerticalTo;
	}
	public void setIndexOfVerticalTo(int indexOfVerticalTo) {
		if(indexOfVerticalTo>0) {
		this.indexOfVerticalTo = indexOfVerticalTo;
		}
		else {
			this.indexOfVerticalTo=0;
		}
	}
	
	public void setWeight(int weight) {
		if(weight>0) {
		this.weight = weight;
		}
		else {
			this.weight=0;
		}
	}
	
	public void setNextEdgeNode(MyEdgeNode nextEdgeNode) {
		this.nextEdgeNode = nextEdgeNode;
	}
	public MyEdgeNode(int indexOfVerticalTo, int weight) {
		setIndexOfVerticalTo(indexOfVerticalTo);
		setWeight(weight);
	}
	public String toString() {
		return "Index: " +indexOfVerticalTo+ " ["+weight+" km]";
	}
	
	
}
