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
 
    public static void main(String[] args) {
        ArrayDeque notvisited = new ArrayDeque();
        ArrayDeque visited    = new ArrayDeque();
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
        LinkedList[] adj = new LinkedList[notvisited.size()];
        Iterator graphit = graphlines.iterator();
        
        int count = 0;
        while(graphit.hasNext()) {
            // we read the binaries of each string
            // place into array so that elments are spaced according the correct edge
            String[] edges =((String)graphit.next()).split(" ");
            // initialize each linked list in the array
            // update the visited and not visited arrays
            visited.add(notvisited.remove());
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
        for(int i=0; i< adj.length;i++) {
            System.out.print("The nodes connected to "+(i+1)+" are: ");
            adj[i].PrintNodes();
            System.out.println("");
        }
//        
//        Node[] visited = new []Node;
//        Node[] notvisited = new []Node;
    }
    
}
