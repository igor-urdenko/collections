package com.urdenko.igor.learn.model;

public class LinkedList {
  private Node head;

  public void add(Node node) {
    if (node == null) {
      return;
    }

    if (head == null) {
      head = node;
      return;
    }
    Node current = head;

    while (current.next() != null) {
      current = current.next();
    }
    current.next(node);
  }

  public void add(int data) {
    this.add(new Node(data));
  }

  @Override
  public String toString() {
    if (head == null) {
      return "{ }";
    }

    StringBuilder sb = new StringBuilder("{ ");
    Node current = head;

    sb.append(current);
    while (current.next() != null) {
      sb.append(", ").append(current.next());
      current = current.next();
    }
    sb.append(" }");

    return sb.toString();
  }
}
