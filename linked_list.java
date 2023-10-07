package basics;

import java.util.*;
 class Node
 {
     int data;
     Node next;
 }
 class linked_list
 {
 static Node head;
 
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();//3
         create(n);
         display();
     }
     static void create(int n)
     {
         Node temp,newnode;
         int data;
         Scanner sc=new Scanner(System.in);
         head=new Node();
         temp=head;
         data =sc.nextInt();
         head.data=data;
         head.next=null;
         for(int i=2;i<=n;i++)
         {
             newnode=new Node();
             data=sc.nextInt();
             newnode.data=data;
             newnode.next=null;
             temp.next=newnode;
             temp=temp.next;
             
         }
     }
     static void display()
     {
         Node temp=head;
         if(temp==null)
         {
             System.out.println("Memory wasn't create");
         }
         else{
             while(temp!=null)
             {
                 System.out.println(temp.data);
                 temp=temp.next;
             }
         }
     }
     
 }