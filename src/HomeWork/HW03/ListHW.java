package HomeWork.HW03;

public class ListHW {
    Node head;

    public void revers() {
        if (head != null && head.next != null) {
            revers(head, head.next);
        }
    }

    private void revers(Node current, Node next) {
        if (next.next != null) {
            revers(next, next.next);
        } else {
            head = next;
        }
        next.next = current;
        current.next = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = node;
        }

    }

    public void printListHW(ListHW list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();

    }


    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
