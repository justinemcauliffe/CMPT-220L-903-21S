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
            // value already exists
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

    public int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    public int smallest(Node node){
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.value);
    }
    public int largest(Node node){
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.right != null) {
            current = current.right;
        }
        return (current.value);
    }
    public Node Nth(Node root, int k)
    {
        Node curr = root;
        Node Klargest = null;

        // count variable to keep count of visited Nodes
        int count = 0;

        while (curr != null)
        {
            // if right child is NULL
            if (curr.right == null)
            {

                // first increment count and check if count = k
                if (++count == k)
                    Klargest = curr;

                // otherwise move to the left child
                curr = curr.left;
            }

            else
            {

                // find inorder successor of current Node
                Node succ = curr.right;

                while (succ.left != null && succ.left != curr)
                    succ = succ.left;

                if (succ.left == null)
                {

                    // set left child of successor to the
                    // current Node
                    succ.left = curr;

                    // move current to its right
                    curr = curr.right;
                }

                // restoring the tree back to original binary
                // search tree removing threaded links
                else
                {

                    succ.left = null;

                    if (++count == k)
                        Klargest = curr;

                    // move current to its left child
                    curr = curr.left;
                }
            }
        }
        return Klargest;
    }

    // This is for deleting a node in the binary search tree
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
    // Puts the Binary Search Tree inOrder
    public static void InorderTraversal(Node root) {
        if (root != null) {
            InorderTraversal(root.left);
            System.out.print(root.value + " ");
            InorderTraversal(root.right);
        }
    }
    // Puts the Binary Search Tree in preOrder
    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }
    // Puts the Binary Search Tree in postOrder
    public void postOrderTraversal(Node root) {
        if(root !=  null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
    // Helps with calculating the height of the Binary Search Tree so we can figure out the levels in Breath First Search.
    public void BreathFirstSearch(){
        int height = maxDepth(root);
        for(int i = 0; i < height; i++){
            BreathFirstSearchTraversal(root, i);
        }
    }

    // Method for breadth first search
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
