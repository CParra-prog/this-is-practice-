/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfsimplement;

import java.util.ArrayDeque;
/**
 *
 * @author Carlos
 */
public class LinkedList {
    LinkedList() {
        
    }
    LinkedList(Node startingNode) {
        // sentinel node tells us where the lsit starts
        sentinel.ChangeNextNode(startingNode);
        // i use the starting node from the sentinel's next value
        currentNode = sentinel.returnNode();
    }
    private Node sentinel = new Node();
    private Node currentNode = null;
    
    public void AddToTheList(Node newNode) {
        if(currentNode == null) {
            currentNode = newNode;
            sentinel.ChangeNextNode(currentNode);
        }
        else {
            currentNode.ChangeNextNode(newNode);
        // we return the current Node's next node value to move
        // along the list
            currentNode = currentNode.returnNode();
        }
        
    }
    public ArrayDeque<Node> getChildren() {
        ArrayDeque<Node> children = new ArrayDeque<>();
        Node temp = sentinel;
        while(temp.returnNode() != null) {
            children.add(temp.returnNode());
            temp = temp.returnNode();
        }
        return children;
    }
    
    public void PrintNodes() {
        Node temp = sentinel;
        while(temp.returnNode() != null) {
            System.out.print(temp.returnNode().returnData()+" ");
            // this moves the list to the next node
            temp = temp.returnNode();
        }
    }
    
}
