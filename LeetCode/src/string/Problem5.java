package string;

public class Problem5 {

	public static void main(String[] args) {
				
		String str = new String("Hello");
		
		String newStr = str.replace(' ', '#');
		System.out.println(newStr);
		
		/*String result = longestPalindrome(str);
		System.out.println("Longest Palindrome: "+result);*/

	}

	private static String longestPalindrome(String s) {
      
	  if(s == null)
		  return null;
	  
	  if("".equals(s))
		  return "";
	  
	  int len = s.length();
	  
	  if(len == 1)
		  return s;
	  
	  String longSubStr = s.substring(0, 1);
	  String subStr = null;
	  
	  for(int i=0;i < len-1;i++){
		  subStr = expandAroundCenter(s, i, i);
		  if(subStr.length() > longSubStr.length()){
			  longSubStr = subStr;
		  }
		  subStr = expandAroundCenter(s, i, i + 1);
		  if(subStr.length() > longSubStr.length()){
			  longSubStr = subStr;
		  }
	  }
      return longSubStr;
    }
	
	private static String expandAroundCenter(String s, int x,int y){
		
		int l = x, r = y;
		while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
			l--;
			r++;
		}
		return s.substring(l+1,r);
	}
}
