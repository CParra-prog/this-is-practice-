/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfsimplement;

/**
 *
 * @author Carlos
 */
public class Node {
    Node() {
    
    }
    Node(int val) {
        data = val;
    }
    private int data;
    private Node nextNode = null;
    public void ChangeNextNode(Node next) {
        nextNode = next;
    }
    public Node returnNode() {
        return nextNode;
    }
    public void ChangeData(int newData) {
        data = newData;
    }
    public int returnData() {
        return data;
    }
}
