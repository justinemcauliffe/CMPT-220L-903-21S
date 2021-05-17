package base;

public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    public void setNextNode(Node nextNode){
        this.left = nextNode;
    }

    public int getValue(){
        return value;
    }
    public Node getNext(){
        return left;
    }
    public void setValue(int value){
        this.value = value;
    }
}
