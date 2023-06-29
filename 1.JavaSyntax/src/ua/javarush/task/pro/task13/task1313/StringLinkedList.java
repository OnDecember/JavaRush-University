package ua.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        if (first.next == null && last.prev == null) {
            first.next = newNode;
            last.prev = newNode;
        } else {
            Node lastPrev = last.prev;
            lastPrev.next = newNode;
            last.prev = newNode;
            newNode.prev = lastPrev;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
