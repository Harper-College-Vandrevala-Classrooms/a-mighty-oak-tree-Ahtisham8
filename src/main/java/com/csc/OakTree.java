package com.csc;

public class OakTree {

  
  public static void main(String[] args) {
    Squirrel cheeks = new Squirrel("Cheeks");
    Node nodeOne = new Node(cheeks);
    
    Squirrel squeaks = new Squirrel("Squeaks");
    Node nodeTwo = new Node(squeaks);
    
    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Node nodeThree = new Node(fluffybutt);

    Squirrel longTail = new Squirrel("Long tail");
    Node nodeFour = new Node(longTail);
    
    nodeOne.set_left(nodeTwo);
    nodeOne.set_right(nodeThree);
    nodeTwo.set_left(nodeFour);
    
    Node retrievedLeft = nodeOne.left(); // This should retrieve the left node
    Node retrievedRight = nodeOne.right(); // This should retrieve the right node
    Node retrievedLeftOfNodeTwo = nodeOne.left().left(); //Traverse through the binary tree 

    System.out.println(retrievedLeft.key.getName());
    System.out.println(retrievedRight.key.getName());
    System.out.println(retrievedLeftOfNodeTwo.key.getName());
  }
}
