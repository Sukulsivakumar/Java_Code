package basics;
public class avl {
	public static void main(String[] args) {
		AVL o = new AVL();
		o.insert(15);
	     o.insert(12);
	     o.insert(10);
	     o.insert(19);
	     o.insert(27);
	     o.insert(17);
		
	}
}
class AVL{
	node Root;
	class node{
		int data;
		node left, right;
		node(int data){
			 this.data = data;
			 left=right=null;
			 }
		}
	void insert(int key) {
		Root = insertValue(Root,key);
	}
	node insertValue(node dupRoot,int value) {
		
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
		return dupRoot;
		
	}
}