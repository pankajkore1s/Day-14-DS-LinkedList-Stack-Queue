package com.LinkedList;

public class MyStack {
    private final MyLinkedList myLinkedList;

    /**
     * constructor Created
     */
    public MyStack() {
        this.myLinkedList=new MyLinkedList();
    }

    /**
     * Adding node in stack using LinkedList
     * @param myNode
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);

    }

    /**
     * Displaying Stack using printStack method
     */
    public void printStack() {
        myLinkedList.printMyNode();
    }

    /**
     * Returning the First element in stack without deleting.
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }
    /**
     * pop method will delete the the last added node
     * @return
     */
    public INode pop() {
        return myLinkedList.pop();
    }
}
