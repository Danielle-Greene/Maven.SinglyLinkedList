package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface {

    private Node<T> head = null;

    public SinglyLinkedList(){}

    public Boolean isEmpty () {
        return head == null;
    }

    @Override
    public void add(Object data) {
        Node newnode = new Node(data);
        if (this.head == null) {
            this.head = newnode;
        } else {
            Node<T> temp = head;
            while (temp.hasNext()) { // walk to end
                temp = temp.getNext();
            }
            temp.setNext(newnode);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("head ->");

        if (head != null) {
            Node<T> temp = head;
            do {
                sb.append("[" + temp.getData() + "] ->");
                temp = temp.getNext();

            } while ((temp != null));
        }

        sb.append("NULL");
        return sb.toString();

    }

    @java.lang.Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @java.lang.Override
    public java.lang.Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @java.lang.Override
    public boolean contains(java.lang.Object data) {
        return false;
    }

    @java.lang.Override
    public int find(java.lang.Object data) {
        return 0;
    }

    @java.lang.Override
    public int size() {

        if (this.isEmpty()) return 0;
        int n = 0;
        Node<T> temp = head;

        do {
            n++;
           temp = temp.getNext();
        } while (temp != null);
        return n;
    }

    @java.lang.Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }


}