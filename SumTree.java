/*

perm_identity
Check if a given Binary Tree is SumTree

Write a function that returns true if the given Binary Tree is SumTree else false. A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /   \
      10     3
    /    \     \
  4      6      3

*/





class SumTree
{
	boolean isSumTree(Node node)
	{   int ls,rs;
         if(node==null || (node.left==node.right) && (node.left==null)){
             return true;
         }
        ls = sum(node.left);
        rs = sum(node.right);
        
        if(node.data==ls+rs && (isSumTree(node.left)) && (isSumTree(node.left))){
            return true;
        }
        else {
            return false;
        }
        
	}
	
	
	
	int sum(Node node){
	    if (node == null){
	        return 0;
	    }
	    else{
	        return sum(node.left)+node.data +sum(node.right);
	    }
	}
}

