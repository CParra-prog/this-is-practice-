/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfsimplement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Carlos
 */
public class BFSImplement {
    
    // static so i can use globally
    static ArrayDeque<Node> notvisited = new ArrayDeque<>();
    static ArrayDeque<Node> visited    = new ArrayDeque<>();
    static LinkedList[] adj = null;
    
    public static void main(String[] args) {
        
        // declare another queue for string parsing
        ArrayDeque <String> graphlines = new ArrayDeque<>(); 
        try{
            File readgraph = new File("graph.txt");
            Scanner scanit = new Scanner(readgraph);
            int count =0;
            while(scanit.hasNextLine()) {
                // here, as we discover new lines we are adding 
                // nodes to our notvisited queue based on 
                // matrix of size m X m
                count += 1;
                notvisited.add(new Node(count));
                graphlines.add(scanit.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // NOW we know how big the queues have to be
        // so we create the array of linked lists
        adj = new LinkedList[notvisited.size()];
        Iterator graphit = graphlines.iterator();
        
        int count = 0;
        while(graphit.hasNext()) {
            // we read the binaries of each string
            // place into array so that elments are spaced according the correct edge
            String[] edges =((String)graphit.next()).split(" ");
            // initialize each linked list in the array
            // update the visited and not visited arrays
            adj[count] = new LinkedList();
            for(int i =0; i <edges.length;i++) {
                if(edges[i].equals("1")) {
                    // then a connection has occurred
                    // add it to the adj list
                    adj[count].AddToTheList(new Node(i+1));
                }
            }
            count+=1;
        }
        // the code below displays the graph using adjacency list
//        for(int i=0; i< adj.length;i++) {
//            System.out.print("The nodes connected to "+(i+1)+" are: ");
//            adj[i].PrintNodes();
//            System.out.println("");
//        }


// 
//
//              CALL BFS BELOW
        BFS(5);
    }
    
    public static void BFS(int s) {
                
//      below is the BFS tree display  
        int count = 0;
        ArrayDeque<Node> que = new ArrayDeque<>();
        que.add(notvisited.remove());
        while(!que.isEmpty()) {
            if(que.peek().returnData()==s) {
                System.out.println("We found the vaulue in the tree!");
                break;
            }
            // add all the children of the node to the que
            // if we been to this node before then we skip it
            if(visited.contains(que.peek())) {
                // do nothing
            }
            else {
                // add all the children 
                if(count < 5) {
                    que.addAll(adj[count].getChildren());
                    count+=1;    
                }
                System.out.println(que.size());
                visited.add(que.remove());
            }
        }
    }
}
