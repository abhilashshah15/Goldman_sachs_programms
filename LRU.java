
import java.util.*;


class LRU{


static Deque<Integer> dq;
static HashMap<Integer,Integer> map;
static int size;

public LRU(int n){

dq = new LinkedList<Integer>();
map = new HashMap<Integer,Integer>();
size = n;

}

static int get(int x){

	if(map.containsKey(x))
	{
		return map.get(x);
	}

	else{
		return -1;
	}

}

static void set(int x, int y){

	if(!map.containsKey(x)){
		if(dq.size()== size){
				int last = dq.removeLast();
				map.remove(last);			
				}
				map.put(x,y);
				dq.addFirst(x);	
	}
	else{
		dq.remove(x);
		map.put(x,y);
		dq.addFirst(x);
	}	


}
}



class Mainclass11 {
	
	public static void main(String args []){
		
		LRU l = new LRU(5);
		LRU.set(1, 1);
		LRU.set(2, 2);
		LRU.set(3, 3);
		LRU.set(4, 4);
		LRU.set(4, 3);
		LRU.set(5, 5);
		LRU.set(6, 6);
		System.out.println(LRU.get(6));
		System.out.println(LRU.get(3));System.out.println(LRU.get(1));
		System.out.println(LRU.get(4));
	}
	
	
	
	
}
