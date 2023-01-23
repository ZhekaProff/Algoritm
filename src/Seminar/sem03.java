package Seminar;
/*
ахо хопкрофт ульман структуры данных и алгоритмы
 */
public class sem03 {

    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.add("Раз"); // head
        ml.add("Два");
        ml.add("Три"); // псоледний

        Node temp = ml.head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        ml.remove();
        System.out.println();

        temp = ml.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }


    }
}

class MyList {
    Node head;

    public void remove() {
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }
    void add(String val) {
        Node n = new Node(val);
        if (head == null)
            head = n;
        else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
    }
}

class Node {
    String value;
    Node next;
    public Node(String value) {
        this.value = value;
    }
}

