package linkedList;

public class mainClass {

  public static void main(String[] args) {
   linkedList myll=new linkedList();
   linkedList myll2=new linkedList();
  
  System.out.print("my 1st linked list:-");
  myll.add(2);
  myll.add(3);
  myll.add(5); 
  myll.add(1);
  myll.add(7);
  myll.add(8);
  myll.display();
  
  System.out.print("my 2nd linked list:-");
  for(int i=1;i<6;i++){
    myll2.add(i);
  }
  myll2.display();
  
  System.out.print("insertion in 1st linked list:-");
  myll.insert(2,8);
  myll.display();
  
  System.out.print("deletion in 2nd  linked list:-");
  myll.delete(7);
  myll.display();
  
  System.out.print("element found in 1st linked list? ");
  if(myll.search(1)==true)
     System.out.println("found");
  else
     System.out.println("not found");
     System.out.println();
     
    System.out.print("concatenation of 1st and 2nd linked list:-");
     myll.concat(myll.head,myll2.head);
     myll.display();
  }
}
