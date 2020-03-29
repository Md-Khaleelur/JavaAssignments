package com.company;

class Node<T>
{
    T data ;
    Node<T> next;

    public Node(T data) {
        this.data=data;
        this.next=null;
    }
}

class SListIterator<T> {
    private Node<T> start;
    int len = 0;

    public SListIterator() {
        this.start = null;
    }

    public Node<T> getStart() {
        return start;
    }

    public void add(T data) {

        Node<T> temp = start;
        Node<T> node = new Node<T>(data);

        if (temp == null) {
            start = node;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        len++;
    }

    public T remove(int pos) {

        Node<T> prev = null;
        Node<T> temp = start;

        if (pos > len) {
            System.out.println("Position should be within the length");
            return null;
        }

        else if (len==1) {
            start=null;
        }

        else {
            for (int i = 0; i < pos - 1; i++) {
                prev = temp;
                temp = temp.next;
            }
         prev.next = temp.next;
        }
        len--;
        return temp.data;
    }
}

class SList<T>
{
    SListIterator<T> sListIterator;
    public String toString() {
        Node<T> temp = sListIterator.getStart();
        String s="";

        while(temp!=null) {
            s+=temp.data+" ";
            temp=temp.next;
        }

        return s;
    }

    public SListIterator<T> iterator() {
        sListIterator = new SListIterator<T>();
        return sListIterator;
    }


}