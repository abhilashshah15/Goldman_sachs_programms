
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

