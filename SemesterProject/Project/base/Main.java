package base;

public class Main {

    public static void main(String[] args) {
        Binary_Search_Tree bt = new Binary_Search_Tree();

        // making my binary search tree
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.find(10);
        bt.find(6);

        System.out.println("This prints the root value");
        System.out.println(bt.root.value);

        System.out.println("This prints the height of the tree");
        System.out.println(bt.Height(bt.root));


        System.out.println("This prints the smallest element");
        System.out.println(bt.smallest(bt.root));

        System.out.println("This prints the largest element");
        System.out.println(bt.largest(bt.root));

        System.out.println("This prints the nth largest element, 3");
        System.out.println(bt.Nth(bt.root,3).value);

        // In order Traversal
        System.out.println("This prints in order traversal");
        Binary_Search_Tree.InorderTraversal(bt.root);
        System.out.println();
        System.out.println();

        //Pre Order Traversal
        System.out.println("This prints pre order traversal");
        bt.preOrderTraversal(bt.root);
        System.out.println();
        System.out.println();

        //Post Order Traversal
        System.out.println("This prints post order traversal");
        bt.postOrderTraversal(bt.root);
        System.out.println();
        System.out.println();

        // Depth First Search
        System.out.println("This is repeated again for Depth First Search");
        Binary_Search_Tree.InorderTraversal(bt.root);
        System.out.println();
        bt.preOrderTraversal(bt.root);
        System.out.println();
        bt.postOrderTraversal(bt.root);
        System.out.println();
        System.out.println();

        // Breadth First Search
        System.out.println("This prints the breath first search");
        bt.BreathFirstSearch();
        System.out.println();
        System.out.println();

        // Deleting Elements
        System.out.println("This will delete an element, 9");
        bt.root=Binary_Search_Tree.DeleteElements(bt.root, 9);
        Binary_Search_Tree.InorderTraversal(bt.root);
    }

}

