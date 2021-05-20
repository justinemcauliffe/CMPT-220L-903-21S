package base;

public class Binary_Search_Tree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value <= current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;

    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private void findRecursive(Node current, int value) {
        if (current == null){
            System.out.println("Not in Binary Search Tree ");
        } else {
            if (value < current.value){
                findRecursive(current.left, value);
            }
            else if (value > current.value){
                findRecursive(current.right, value);
            } else if (value == current.value){
                System.out.println("In Binary Search Tree ");
            }
        }

    }

    public void find (int value) {
        findRecursive(root,value);
    }

    // Finding the height of the tree
    public int Height(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            int lheight = Height(node.left);
            int rheight = Height(node.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    // Finding the smallest element in the tree
    public int smallest(Node node){
        Node current = node;


        while (current.left != null) {
            current = current.left;
        }
        return (current.value);
    }
    // Finding the largest element in the tree
    public int largest(Node node){
        Node current = node;

        while (current.right != null) {
            current = current.right;
        }
        return (current.value);
    }
    // Finding the Nth largest element in the tree
    public Node Nth(Node root, int n)
    {
        Node current = root;
        Node Nlargest = null;

        int count = 0;

        while (current != null)
        {
            if (current.right == null)
            {

                if (++count == n)
                    Nlargest = current;

                current = current.left;
            }

            else
            {

                Node successor = current.right;

                while (successor.left != null && successor.left != current)
                    successor = successor.left;

                if (successor.left == null)
                {

                    successor.left = current;

                    current = current.right;
                }

                else
                {

                    successor.left = null;

                    if (++count == n)
                        Nlargest = current;

                    current = current.left;
                }
            }
        }
        return Nlargest;
    }

    // Deleting a node
    public static Node DeleteElements(Node root, int value) {

        if (root == null)
            return root;

        if (value < (int) root.value) {
            root.left = DeleteElements(root.left, value);
        } else if (value > (int) root.value) {
            root.right = DeleteElements(root.right, value);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null)
                return root.left;

            root.value = TreeReorganization(root.right);
            root.right = DeleteElements(root.right, (int) root.value);
        }

        return root;

    }
    // Tree Reorganization
    public static int TreeReorganization(Node root) {
        int minimum = (int) root.value;
        while (root.left != null) {
            minimum = (int) root.left.value;
            root = root.left;
        }
        return minimum;
    }

    // In order
    public static void InorderTraversal(Node root) {
        if (root != null) {
            InorderTraversal(root.left);
            System.out.print(root.value + " ");
            InorderTraversal(root.right);
        }
    }
    // Pre order
    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }
    // Post order
    public void postOrderTraversal(Node root) {
        if(root !=  null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Breadth first search
    public void BreathFirstSearch(){
        int height = Height(root);
        for(int i = 0; i < height; i++){
            BreathFirstSearchTraversal(root, i);
        }
    }

    public void BreathFirstSearchTraversal(Node node, int level){
        if(node == null){
            return;
        }
        if(level == 0){
            System.out.print(node.value + " ");
        }else{
            BreathFirstSearchTraversal(node.left, level-1);
            BreathFirstSearchTraversal(node.right, level-1);
        }
    }


}
