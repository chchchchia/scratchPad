import java.util.Arrays;


public class Deviation {

	public static int diff(int[] v, int d){
		//assumes v.length>=3;
		int diff=0;
	for(int i=0;i<=v.length-d;i++){
		int[] temp=Arrays.copyOfRange(v,i,i+d);
		int tempDiff=findMax(temp)-findMin(temp);
		if(tempDiff>diff){diff=tempDiff;}
	}
		return diff;
	}
	private static int findMin(int[] x){
		int c=x[0];
		for(int k:x){
			if(k<c){c=k;}
		}
		return c;
	}
	private static int findMax(int[] x){
		int c=x[0];
		for(int k:x){
			if(k>c){c=k;}
		}
		return c;
	}
	public static void main(String[] args) {
		int[] v ={6, 9, 4, 7, 4, 1};
		int d = 3;
		int expected=6;
		System.out.println(diff(v,d));
	}

}
