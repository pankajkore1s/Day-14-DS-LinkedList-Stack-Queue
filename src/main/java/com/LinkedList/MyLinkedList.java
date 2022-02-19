package com.LinkedList;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;
    public Object INode;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    /**
     * Adding New node to existing node logic
     * @param newNode
     */
    public void add(INode newNode) {

        if (this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    /**
     * Ability to create Linked List by appending 30 and 70 to 56
     * Node with data 56 is First Created
     * - Next Append 30 to 56
     * - Finally Append 70 to 30
     * - LinkedList Sequence: 56->30->70
     * @param newNode
     */

    public void append(INode newNode) {
        if (this.head==null){
            this.head=newNode;
        }
        if (this.tail==null){
            this.tail=newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }

    /**
     * Ability to insert 30 between 56 and 70
     * - Final Sequence: 56->30->70
     * @param myNode
     * @param newNode
     */

    public void insert(INode myNode,INode newNode){
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop(){
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }

    public INode popLast(){
        INode tempNode= head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    /**
     * Print my node when I appending the node
     * then it will be adding to front node
     */
    public void printMyNode(){
        StringBuffer myNodes=new StringBuffer("My Nodes");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append(" ->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
