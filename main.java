import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.String;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int count = 0;
    BufferedReader inpt = new BufferedReader(new InputStreamReader(System.in));
    String usrInpt;
    Create new1 = new Create();
    LinkedListItem refer = new LinkedListItem();
    refer = new1.snakeHead;
    if(new1.listLoop == true) {
      while(new1.listLoop) {
        System.out.println("Type \"Exit\" to stop building the list; otherwise, type the data for the list object.");
        try {
           usrInpt = inpt.readLine();
           if(usrInpt.toLowerCase().equals("exit")) {
             new1.listLoop = false;
             continue;
          }
          else {
            LinkedListItem t = new LinkedListItem(usrInpt);
            refer.addListItem(t);
            System.out.println(refer.leftLink);
            refer = t;
            System.out.println(refer.leftLink);
          }
        }
        catch(IOException e) {
          System.out.println("Do as you're told an' input some data");
          e.printStackTrace();
        }
        
      }
      new1.snakeHead.printList();
    }
    
  }
  
}