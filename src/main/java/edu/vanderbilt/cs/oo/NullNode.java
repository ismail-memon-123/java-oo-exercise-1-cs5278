package edu.vanderbilt.cs.oo;


public class NullNode implements Node {
    private Node parent; 
 
    public NullNode() {
        parent = null;
    }
    public void setValue(Double d) {
        throw new UnsupportedOperationException();
    }
     public Double getValue() {
         return 0.0;
     }
     public void setParent(Node n) {
         this.parent = n;
     }
     public Node getParent() {
         return this.parent;
     }
     public void replace(Node child, Node replacement) {
         int i = 1;
     }
     public Node getLeftChild() {
         return null;
     }
     public Node getRightChild() {
         return null;
     }
 }