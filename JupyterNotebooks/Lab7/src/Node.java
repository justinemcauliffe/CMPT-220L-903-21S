package base;

public class Node {
    private int value;
    private Node nextNode;

    public Node(int value){
        this.value = value;
        this.nextNode = null;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public int getValue(){
        return value;
    }
    public Node getNext(){
        return nextNode;
    }
    public void setValue(int value){
        this.value = value;
    }

}