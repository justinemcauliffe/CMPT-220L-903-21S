package base;

public class List {
    private base.Node head;

    public List() {
        head = null;
    }

    public List(base.Node head) {
        this.head = head;
    }

    public void add(base.Node value) {
        if (head == null) {
            head = value;
        } else {
            base.Node it = head;
            while (it.getNext() != null) {
                it = it.getNext();
            }
            it.setNextNode(value);
        }

    }

    public void delete() {
        base.Node it = head;
        while (it.getNext().getNext() != null) {
            it = it.getNext();
        }
        it.setNextNode(null); // deletes last value in list
    }

    public void sortList() {

        base.Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.getNext();

                while (index != null) {
                    if (current.getValue() > index.getValue()) {
                        temp = current.getValue();
                        current.setValue(index.getValue());
                        index.setValue(temp);
                    }

                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }
    public void display()
    {
        base.Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }

        System.out.println();
    }
}


