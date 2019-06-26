import java.util.*;

class Wave_Array{

public static void main(String args[]){

Scanner s = new Scanner(System.in);

int test = s.nextInt();

while(test!=0){
	int size = s.nextInt();
	int ar [] = new int [size];
	for(int i=0; i<ar.length;i++){
		ar[i] = s.nextInt();	
		}
	
	for(int i=0; i<ar.length; i =i+2){
		
		if(i>0 && ar[i-1]>ar[i]){
			swap(ar,i-1,i);
		}
		
		if(i<ar.length-1 && ar[i+1]>ar[i]){
                       swap(ar,i+1,i);
                } 
		
	}
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
	}

	System.out.println("");
	test --;
}


}

private static void swap(int[] ar, int i, int i2) {
	
	int temp = ar[i];
	ar[i] = ar[i2];
	ar[i2] = temp;
	
	
}


}

