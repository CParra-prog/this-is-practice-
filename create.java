
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Integer;
import java.io.IOException;


public class Create {
  Create() {
    System.out.println("Want to create a linked List?\n"+"Type Y for \"yes\"");
    // create a way to keep prompting until for input
    try {
      switch(inpt.readLine()) {
        case "y":
          System.out.println("Remember that a linked list generates from left to right");
          listLoop = true;
          break;
        case "Y":
          System.out.println("Remember that a linked list generates from left to right");
          listLoop = true;
          break;
        case "n":
          System.out.println("Well why did you try to instantiate the object?");
          listLoop = false;
          break;
        case "N":
          System.out.println("Well why did you try to instantiate the object?");
          listLoop = false;
          break;
      }
    }
    catch (IOException e){
        System.out.println("We really only looking for a single letter Y\\N.");
      e.printStackTrace();
    }
  }
  BufferedReader inpt = new BufferedReader(new InputStreamReader(System.in));
  LinkedListItem snakeHead = new LinkedListItem();
  boolean listLoop;
}