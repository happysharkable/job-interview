package com.gb.jobint.lesson2;

public class HomeLinkedList<T> {

    private class Item {
        private Item next;
        private T value;

        public Item(T value, Item next) {
            this.value = value;
            this.next = next;
        }
    }

    private Item first;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T value) {
        Item newItem = new Item(value, first);
        first = newItem;
        size++;
    }

    public T getFirst() {
        checkEmpty();
        return first.value;
    }

    public T get(int index) {
        checkEmpty();
        checkIndexOutBounds(index);
        Item item = getItem(index);
        return item.value;
    }

    public void set(int index, T value) {
        checkEmpty();
        checkIndexOutBounds(index);
        Item item = getItem(index);
        item.value = value;
    }

    public T removeFirst() {
        checkEmpty();
        T toRemoveItemValue = first.value;
        first = first.next;
        size--;
        return toRemoveItemValue;
    }

    public int indexOf(T value) {
        if (isEmpty()) {
            return -1;
        }
        Item current = first;
        int index = 0;
        while(current != null) {
            if (current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) > -1;
    }

    private Item getItem(int index) {
        int currentIndex = 0;
        Item current = first;
        while (currentIndex != index) {
            current = current.next;
            currentIndex++;
        }
        return current;
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
    }

    private void checkIndexOutBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Item current = first;
        while(current != null) {
            sb.append(current.value).append(", ");
            current = current.next;
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
