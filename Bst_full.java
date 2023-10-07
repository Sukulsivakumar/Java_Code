package basics;
import java.util.*;

public class Bst_full {
    public static void main(String[] args) {
      BST b=new BST();
      Scanner sc=new Scanner(System.in);
      int choice,con;
      do{
        System.out.println("1.Add\n2.inorder\n3.preorder\n4.postorder\n5.search\n6.delete\n7.depth\n8.Exit");
      System.out.print("Enter Your choice :");
       choice=sc.nextInt();
       switch(choice){
         case 1:
           System.out.print("enter the number of data You want to Add :");
           int n=sc.nextInt();
           System.out.print("enter The elements :");
           for(int i=0;i<n;i++)
           b.insert(sc.nextInt());
           break;
        case 2:
           System.out.print("Inorder Traversal :");
           b.inOrder(b.Root);
           System.out.println();
           break;
       case 5:
         System.out.println("enter the key value for searching :");
         int key=sc.nextInt();
         System.out.println(b.search(b.Root,key));
           break;
    case 6:
        System.out.println("Enter the data needed to delete :");
        int keyToKill=sc.nextInt();
        b.delete(b.Root,keyToKill);
        break;
        case 7:
          System.out.print("enter the data to find depth :");
          int dep=sc.nextInt();
          int c=0;
          System.out.println(b.depth(b.Root,dep,c));
          break;
       case 8:
         return;
       }
       System.out.println("To Continue Press 1 :");
       con=sc.nextInt();
  }while(con==1);
}
}
class node{
  int data;
  node left,right;
  node(int key){
    data=key;
    left=right=null;
  }
}
class BST{
  node Root;
void insert(int value){
  Root=insertValue(Root,value);
}  
node insertValue(node newRoot,int value)
  {
    if(newRoot==null)
    {
      newRoot=new node(value);
    return newRoot;
     
    }
   if(value>newRoot.data){
      newRoot.right=insertValue(newRoot.right,value);
    }
    else if(value<newRoot.data){
      newRoot.left=insertValue(newRoot.left,value);
    }
    return newRoot;
  }
void inOrder(node temp){
    if(temp!=null){
    inOrder(temp.left);
    System.out.print(temp.data+" ");
    inOrder(temp.right);}
  }
  boolean search(node temp,int key){
      //condition check whether tree empty or data not found
      if(temp==null)  return false;
      //Equal condition
      else if(temp.data==key)   return true;
      //right search condition
      else if(key>temp.data)    return search(temp.right,key);
      //left search condition
      else if(key<temp.data)    return search(temp.left,key); 
      //if data not found return false defaultly
       return false;
     }
     node delete(node finder,int victim){
         //condition to check data not found or tree empty
         if(finder==null)
         return finder;
//if data greater than root sending right refernce         
         if(victim>finder.data)
         finder.right=delete(finder.right,victim);
//if data lesser than root sending left refernce         
         else if(victim<finder.data)
         finder.left=delete(finder.left,victim);
         //data found
         else{
              //condition for single child             
             if(finder.left==null)
             return finder.right;
              //condition for single child             
             else if(finder.right==null)
             return finder.left;
             //condion for more than one child
             finder.data=min(finder.right);//-->min value in right side
             finder.right=delete(finder.right,finder.data);//-->deleting the founded min  value from right side
             
         }
         return finder;
     }
     //min value finding method
     int min(node temp){
         int minValue=temp.data;
         //traversing till the bottom left of Root
         while(temp.left!=null)
         {
             minValue=temp.data;
             temp=temp.left;
         }//returning the minimum value
         return minValue;
     }
     int depth(node temp,int key,int c){
       if(temp==null){
         System.out.println("Not Found");
       return c;}
       else if(key>temp.data)
        return c=c+depth(temp.right,key,1);
       else if(key<temp.data)
        return c=c+depth(temp.left,key,1);
        else
        return c;
     }

}