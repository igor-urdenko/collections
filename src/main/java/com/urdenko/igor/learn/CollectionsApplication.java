package com.urdenko.igor.learn;

import com.urdenko.igor.learn.model.LinkedList;

public class CollectionsApplication {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);
  }
}
