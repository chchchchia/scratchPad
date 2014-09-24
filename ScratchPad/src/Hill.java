import java.util.Arrays;


public class Hill {
	//Make a version of below that sorts w/out using built-in fxn
	public static int extractX(int[] v){
		int x=0;
		int[] unsortedV=v.clone();
		Arrays.sort(v);

		for(int i=0;i<v.length;i++){
			int k=v[i]-unsortedV[i];
			if(Math.abs(k)>x){x=k;}
		}
		return x;
	}
	
	public static void main(String[] args) {
		int[] v={5, 4, 3, 2, 8};
		int expected =3;
		assert extractX(v)==expected;
		System.out.println(extractX(v));
	}

}
