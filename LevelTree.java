
public class LevelTree {

	Node root;
	
boolean	checkbalance(Node node){
	
	int  lh = height(node.left);
	System.out.println(lh);
	int lr = height(node.right);
	System.out.println(lr);
	
	if(lh-lr<=1 &&lh-lr>=-1){
		
		return true;
		
	}
	
	return false;

}
	
	
	
	int height(Node node){
		
		if(node==null){
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
		
	}
	public static void main(String args[])  
    { 
        LevelTree tree = new LevelTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(8); 
        tree.root.left.left.left.left=new Node(9);
        if(tree.checkbalance(tree.root)) 
            System.out.println("Tree is balanced"); 
        else
            System.out.println("Tree is not balanced"); 
    } 
} 



class Node  
{ 
    int data; 
    Node left, right; 
    Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 




} 




