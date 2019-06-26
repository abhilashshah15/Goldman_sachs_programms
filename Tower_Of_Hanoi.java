import java.util.*;

class TOH{

public static void main (String Args[]){

	Scanner s = new Scanner(System.in);
	int test = s.nextInt();
	while(test!=0){
	
	int n = s.nextInt();
	towerOfHanoi(n,'A','B','C');
	test--;
	
	}


	}

static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){

	if(n==1){
		System.out.println("move Disk 1 from "+ from_rod + " to "+ to_rod);
		}

	towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
	System.out.println("move Diskk "+n+" from " +from_rod+ " to " + to_rod);
	towerOfHanoi(n-1,aux_rod,to_rod,from_rod);

}


}

