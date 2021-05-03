package base;

public class Main {

    public static void main(String[] args) {
        base.Node first = new base.Node (5);
       List x = new List(first);
        x.add(new base.Node(1));
        x.add(new base.Node(3));
        x.sortList();
        x.display();
    }

}
