package com.LinkedList;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;

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
     * Print my node when I appending the node
     * then it will be adding to front node
     */
    public void printMyNode(){
        StringBuffer myNodes=new StringBuffer("My Nodes");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
