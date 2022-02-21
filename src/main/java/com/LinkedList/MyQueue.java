package com.LinkedList;

public class MyQueue {
    private MyLinkedList myLinkedList;
    /**
     * Constructor initialization to create new LinkedList
     */
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    /**
     *insert an element at thr end of the queue
     * @param myNode
     */
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }
    /**
     * Print Queue internally calling to printMyNode to Display content of Queue
     * Here I am following dry principle
     */
    public void printQueue() {
        myLinkedList.printMyNode();
    }
    /**
     * It will return the peak element
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }
    /**
     * dequeue method will delete front element in Queue
     * @return
     */
    public INode dequeue() {
        return myLinkedList.pop();
    }
}
