package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedCharsInString dcs = new RepeatedCharsInString();
        dcs.findDuplicateChars("JyothiisCute");

	}
	 public void findDuplicateChars(String str){
         
	        Map<Character, Integer> dupMap = new HashMap<>(); 
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys){
	            if(dupMap.get(ch) > 1){
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            }
	        }
	    }
}
