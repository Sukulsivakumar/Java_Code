package basics;

import java.util.*;
public class bstt {
    public static void main(String[] args) {
     BST o=new BST();
     o.insert(15);
     o.insert(12);
     o.insert(10);
     o.insert(19);
     o.insert(27);
     o.insert(17);
  }
}
class BST{
  node Root;
  class node{
     int data;
     node left,right;
     node(int data){
       this.data=data;
       left=right=null;
     }
  }
  //insert method
  void insert(int key){
   //calling recursive insert method which is going to insert values
   Root=insertValue(Root,key); 
    }
    
    
    
    //recursive insert method
    node insertValue(node dupRoot,int value){
    //condition to check whether given root null or NOT
      if(dupRoot==null){
        dupRoot=new node(value);
        return dupRoot;
      }
      //inserting data in the left side
      if(value<dupRoot.data){
        dupRoot.left=insertValue(dupRoot.left,value);
      }
      else if(value>dupRoot.data){
        dupRoot.right=insertValue(dupRoot.right,value);
      }
          //return original root value
      return dupRoot;
    }
  }