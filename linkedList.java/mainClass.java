package linkedList;

public class linkedList {
 
 node head;
 
 //adding a node
 void add(int data){
   node toAdd=new node(data);
   if(isEmpty()){
     head=toAdd;
     return;
   }
   node temp=head;
   while(temp.next!=null){
     temp=temp.next;
   }
   temp.next=toAdd;
 }
 
 //display linked list
 void display(){
   node temp=head;
   while(temp!=null){
     System.out.print(temp.data+" ");
     temp=temp.next;
   }
   System.out.println();
   System.out.println();
 }
 
 //delete a node in linked list
 void delete(int data){
   if(head==null){
     return;
   }
   node temp=head;
   node prev=null;
   if(temp!=null && temp.data==data){
     head=temp.next;
     return;
   }
   while(temp!=null && temp.data!=data){
     prev=temp;
     temp=temp.next;
   }
   if(temp==null) return;
   prev.next=temp.next;
 }
 
 //insert a node in linked list
 void insert(int index,int data){
   node new_node=new node(data);
   int i=0;
   node temp=head;
   if(head==null) return;
   if(index==0){
     new_node.next=temp;
     return;
   }
   node prev=null;
   while(temp!=null && i!=index){
     prev=temp;
     temp=temp.next;
     i++;
   }
   if(i==index){
     prev.next=new_node;
     new_node.next=temp;
     System.out.println();
     return;
   }
  return;  
 }
 
 //Search a node in linked list
 boolean search(int data){
   node temp=head;
   while(temp!=null){
     if(temp.data==data){
       return true;
     }
     temp=temp.next;
   }
   return false;
 }
 
 //concat two linked list
 void concat(node node1,node node2){
   node temp=node1;
   node dummy=new node();
   node Node=dummy;
   if(node1==null){
     Node.next=node2;
     return;
   }
   else if(node2==null){
     Node.next=node1;
     return;
   }
   while(temp.next!=null){
     temp=temp.next;
   }
   temp.next=node2;
   return;
 }
 
 boolean isEmpty(){
   return head==null;
 }
 
 static class node{
   int data;
   node next;
   public node(int data){
     this.data=data;
     next=null;
   }
   public node(){}
 }
}
