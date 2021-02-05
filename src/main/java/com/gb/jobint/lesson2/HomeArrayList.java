package com.gb.jobint.lesson2;

public class HomeArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 16;
    private final float FULFILLMENT_FACTOR = 0.75f;

    public HomeArrayList() {
        list = (T[])new Object[DEFAULT_CAPACITY];
    }

    public HomeArrayList(int capacity) {
        list = (T[])new Object[capacity];
    }

    public int size() {
        return list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T item) {
        return indexOf(item) > -1;
    }

    public int indexOf(T item) {
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void add(T item) {
        list[size] = item;
        size++;
        checkCapacity();
    }

    public void set(int index, T item) {
        checkBounds(index);
        list[index] = item;
    }

    public T remove(int index) {
        checkBounds(index);
        T item = list[index];
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
        return item;
    }

    private void checkCapacity() {
        if (1.0f * size / list.length > FULFILLMENT_FACTOR) {
            System.out.println("recapacity on size: " + size);
            T[] tempList = (T[])new Object[list.length * 2];
            System.arraycopy(list, 0, tempList, 0, size);
            list = tempList;
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
