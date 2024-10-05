package collection.list;

import collection.list.MyLinkedList;

public class MyLinkedList<E> implements MyList<E> {

    private MyLinkedList.Node<E> first;
    private int size = 0;

    public void add(E e) {
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            MyLinkedList.Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private MyLinkedList.Node<E> getLastNode() {
        MyLinkedList.Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E e) {
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            MyLinkedList.Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public E set(int index, E element) {
        MyLinkedList.Node<E> x = getNode(index);
        E oldValue = x.item;
        return oldValue;
    }

    public E remove(int index) {
        MyLinkedList.Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            MyLinkedList.Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public E get(int index) {
        MyLinkedList.Node<E> node = getNode(index);
        return node.item;
    }

    private MyLinkedList.Node<E> getNode(int index) {
        MyLinkedList.Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (MyLinkedList.Node<E> x = first; x != null; x = x.next, index++) {
            if (o.equals(x.item)) {
                return index;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            MyLinkedList.Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
