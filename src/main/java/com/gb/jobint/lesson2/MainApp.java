package com.gb.jobint.lesson2;

public class MainApp {
    public static void main(String[] args) {
        tryHomeArrayList();
        tryHomeLinkedList();
    }

    private static void tryHomeLinkedList() {
        HomeLinkedList<String> homeLinkedList = new HomeLinkedList<>();
        homeLinkedList.addFirst("First");
        homeLinkedList.addFirst("Second");
        homeLinkedList.addFirst("Third");
        homeLinkedList.addFirst("Fourth");
        homeLinkedList.addFirst("Fifth");
        System.out.println(homeLinkedList);
        System.out.println(homeLinkedList.removeFirst());
        System.out.println(homeLinkedList.indexOf("Second"));
        System.out.println(homeLinkedList.contains("Third"));
        System.out.println(homeLinkedList);
        System.out.println(homeLinkedList.get(3));
        homeLinkedList.set(3, "NewValue");
        System.out.println(homeLinkedList);
    }

    private static void tryHomeArrayList() {
        HomeArrayList<String> homeArrayList = new HomeArrayList<>();
        homeArrayList.add("First");
        homeArrayList.add("Second");
        homeArrayList.add("Third");
        homeArrayList.add("Fourth");
        homeArrayList.add("Fifth");
        System.out.println(homeArrayList);
        homeArrayList.remove(1);
        System.out.println(homeArrayList);
        System.out.println(homeArrayList.contains("Third"));
        homeArrayList.set(2, "NewItem");
        System.out.println(homeArrayList);
    }
}
