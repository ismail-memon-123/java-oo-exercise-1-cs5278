package edu.vanderbilt.cs.oo;

import java.util.List;

/**
 * @ToDo
 *
 * This is an interface for nodes in a binary tree implemented
 * using the Composite pattern.
 *
 * For this assignment, you are going to implement some classes
 * that you will later use to create a working binary tree to
 * perform proximity searches on geohashes.
 *
 * Steps:
 *
 * 1. Create a class called CompositeNode in THIS package
 * 2. Make CompositeNode implement the Node interface
 * 3. Create a class called NullNode in THIS package
 * 4. Make NullNode implement the Node interface
 * 5. CompositeNode should have member variables for leftChild
 *    and rightChild that are initialized to instances of
 *    NullNode
 * 6. getLeftChild() and getRightChild() in NullNode should
 *    always return null
 * 7. replace() in NullNode should do nothing
 * 8. setValue() in NullNode should throw a java.lang.UnsupportedOperationException
 *    if it is invoked and getValue() should always return 0.0
 * 9. NullNode should have a member variable for parent of type Node that can
 *    be update with a call to setParent()
 * 10. CompositeNode's getLeftChild(), getRightChild(), and getParent()
 *     methods should return the corresponding member variables and setParent()
 *     should update the corresponding member variable
 * 11. The NullNode's getValue() method should always return 0.0.
 * 12. The CompositeNode should contain a value member variable that is
 *     read/written by the getValue() / setValue() methods
 * 13. Implement the replace() method in CompositeNode as described in the
 *     method documentation below
 * 14. Update the NodeFactory so that the newCompositeNode() and newNullNode()
 *     methods return instances of the classes that you created.
 * 15. Run the NodeTest to make sure that your code works!
 */
public interface Node {

    /**
     * Sets the value that is stored in the current node
     *
     * @param d
     */
    public void setValue(Double d);

    /**
     * Returns the value that is stored in the current node
     *
     * @return
     */
    public Double getValue();

    /**
     * Sets the parent of the current node
     *
     * @param n
     */
    public void setParent(Node n);

    /**
     * Returns the parent of the current node
     *
     */
    public Node getParent();

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
    public void replace(Node child, Node replacement);

    /**
     * Returns the left child of the current node
     *
     * @return
     */
    public Node getLeftChild();

    /**
     * Returns the right child of the current node
     *
     * @return
     */
    public Node getRightChild();

}
