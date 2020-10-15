package generic;

public class linkedListG<E> {

node<E> head;
 
 //adding a node
 void add(E data){
   node<E> toAdd=new node<>(data);
   if(isEmpty()){
     head=toAdd;
     return;
   }
   node<E> temp=head;
   while(temp.next!=null){
     temp=temp.next;
   }
   temp.next=toAdd;
 }
 
 //display linked list
 void display(){
 if(isEmpty()){
     System.out.println("cannot remove from empty linked list");
   }
   node<E> temp=head;
   while(temp!=null){
     System.out.print(temp.data+" ");
     temp=temp.next;
   }
   System.out.println();
   System.out.println();
 }
 
 //delete a node in linked list
 void delete(E data){
   if(isEmpty()){
     System.out.println("cannot remove from empty linked list");
   }
   node<E> temp=head;
   node<E> prev=null;
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
 void insert(int index,E data){
   node<E> new_node=new node<>(data);
   int i=0;
   node<E> temp=head;
   if(isEmpty()){
     System.out.println("cannot insert in empty linked list");
   }
   if(index==0){
     new_node.next=temp;
     return;
   }
   node<E> prev=null;
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
 boolean search(E data){
   node<E> temp=head;
   if(isEmpty()){
     System.out.println("cannot search from empty linked list");
   }
   while(temp!=null){
     if(temp.data==data){
       return true;
     }
     temp=temp.next;
   }
   return false;
 }
 
 //concat two linked list
 void concat(node<E> node1,node<E> node2){
   node<E> temp=node1;
   node<E> dummy=new node<>();
   node<E> Node=dummy;
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
 
 static class node<E>{
   E data;
   node<E> next;
   public node(E data){
     this.data=data;
     next=null;
   }
   public node(){}
 }
}