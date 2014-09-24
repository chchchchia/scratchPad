import java.util.*;

public class perfectNumber {
	//determine if a number is a prefect number, return a boolean
	public static void main(String[] args){
		assert isPerfectNumber(6)==true;
		assert isPerfectNumber(5)==true;
		System.out.println(isPerfectNumber(0));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(855));	
	}
	public static boolean isPerfectNumber(int number){
		int sumOfDivisors=0;
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				sumOfDivisors+=i;
			}
					
		}
	if(sumOfDivisors==number){
		return true;
	}else{
		return false;
		}
	}
	
}
