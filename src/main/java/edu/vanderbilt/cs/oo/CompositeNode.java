package edu.vanderbilt.cs.oo;

public class CompositeNode implements Node {
     
    private Double value;
    private Node parent;
    private Node left;
    private Node right;
    
    public CompositeNode() {
        this.value = 0.0;
        this.parent = null;
        this.left = new NullNode();
        this.right = new NullNode();
    }
    
    public void setValue(Double d) {
        this.value = d;
    }

    /**
     * Returns the value that is stored in the current node
     *
     * @return
     */
    public Double getValue() {
        return this.value;
    }
    /**
     * Sets the parent of the current node
     *
     * @param n
     */
    public void setParent(Node n) {
        this.parent = n;
    }

    /**
     * Returns the parent of the current node
     *
     */
    public Node getParent() {
        return this.parent;
    }

    /**
     * This method takes one of the current children of the node
     * as the `child` parameter and replaces the corresponding
     * child with the provided `replacement`. The method will
     * call setParent() on the replacement node to update its
     * current parent to this node.
     *
     * For example, the following code would update the rightChild
     * of a Node:
     *
     * Node parent = new CompositeNode();
     * Node newRightChild = new CompositeNode();
     * Node existingRightChild = parent.getRightChild();
     * parent.replace( existingRightChild, newRightChild);
     *
     * assertTrue( parent == newRightChild.getParent() );
     *
     * Similarly, these lines would update the leftChild:
     *
     * Node existingLeftChild = parent.getLeftChild();
     * parent.replace( existingLeftChild, new CompositeNode());
     *
     * Note: if your CompositeNode has a different constructor, this
     * code may not work, but it shows the basic idea...
     *
     * @param child
     * @param replacement
     */
    public void replace(Node child, Node replacement) {
        // compare should work since they should have same address
        if (child == this.left) {
            this.left = replacement;
            // Break parent link too
            if (replacement != null)
            replacement.setParent(this);
        } else if (child == this.right) {
            this.right = replacement;
            replacement.setParent(this);
        }
    }
    public Node getLeftChild() {
        return this.left;
    }
    public Node getRightChild() {
        return this.right;
    }

}

