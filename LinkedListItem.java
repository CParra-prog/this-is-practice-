import java.lang.String;

public class LinkedListItem {
  String itemData;
  LinkedListItem leftLink;
  LinkedListItem() {
    
  }
  LinkedListItem(String data){
    this.itemData = data;
  }
  public void addListItem(LinkedListItem item) {
    leftLink = item;
  }
  public void printList () {
    boolean moreList = true;
    while(moreList) {
      if (leftLink != null ) {
        System.out.println("This is one of the linked List items and its data.");
        System.out.println(leftLink.itemData);
        leftLink = leftLink.leftLink;
      }
      else {
        moreList = false;
      }
    }
  }
}