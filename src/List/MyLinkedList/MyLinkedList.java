package List.MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    //если это первое добавление в список
    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
            //то здесь будет какая-то логика
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if ((currentIndex + 1) == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            result[idx] = temp.getValue();
            temp = temp.getNext();
            idx++;
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
