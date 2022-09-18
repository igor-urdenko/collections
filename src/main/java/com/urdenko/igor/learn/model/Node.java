package com.urdenko.igor.learn.model;

public class Node {
  private final int data;
  private Node next;

  public Node(int data) {
    this.data = data;
  }

  public int data() {
    return this.data;
  }

  public Node next() {
    return this.next;
  }

  public void next(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "" + data;
  }
}
