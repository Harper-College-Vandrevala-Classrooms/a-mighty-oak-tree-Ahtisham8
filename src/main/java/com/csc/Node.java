package com.csc;

public class Node {
    Squirrel key;
    Node left, right;
      
    public Node(Squirrel item) {
        key = item;
        left = right = null;
    }

    public void set_left(Node nodeTwo) {
        left = nodeTwo;
    }

    public void set_right(Node nodeThree) {
        right = nodeThree;
    }

    public Node left() {
        return this.left;
    }

    public Node right() {
        return this.right;
    }
      
}
