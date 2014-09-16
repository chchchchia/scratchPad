	import java.util.*;
public class test {
	
    public static void main(String[] args) {
	        assert findFirstNonRepeatingCharacterRecur("abcda") == 'b';
	        assert findFirstNonRepeatingCharacterRecur("ab") == 'a';
	        assert findFirstNonRepeatingCharacter("aaab") =='b';
	        System.out.println(findFirstNonRepeatingCharacterRecur("aaab"));
	    }
	  
	    public static char findFirstNonRepeatingCharacter(String inputString) {
			ArrayList<Character> stringArray =new ArrayList<Character>();
			for (char c : inputString.toCharArray()) {
				  stringArray.add(c);
			}
	    char start=inputString.charAt(0);  
	    boolean noRepeat=false;
	    boolean removeFirst=false;
			while(!noRepeat){
	     for(int i=1;i<stringArray.size();i++){
				if (stringArray.get(i)==start){
					stringArray.remove(i);
					removeFirst=true;		
				}
			}
					if(removeFirst){
						stringArray.remove(0);        
						start=stringArray.get(0);
						noRepeat=false;
						removeFirst=false;	
					}else{
					noRepeat=true;
					}
				}
	         
	    
	      return start;
	}
	    
	    public static char findFirstNonRepeatingCharacterRecur(String inputString) {
	    	char[] iSArray= inputString.toCharArray();
	    	char result=iSArray[0];
	    	for(int i=1;i<iSArray.length;i++){
				if (iSArray[i]==iSArray[0]){
					findFirstNonRepeatingCharacterRecur(inputString.substring(1));
				}else{
					result= iSArray[i];
				}
			}
	    	return result;
			 
	    }
}
