package miscellaneous;

public class Problem9 {

	public static void main(String[] args) {
		
		int num = 2147483647;
		if(isPalindrome(num)){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not a Pallindrome");
		}

	}
	
	public static boolean isPalindrome(int x) {
	        
	        if(x < 0){
	            return false;
	        }
	        
	        if(x / 10 == 0){
	            return true;
	        }
	        
	        boolean flag = true;
	        int len = 0;
	        int power = 0;
	        while(x / (int) Math.pow(10,power) != 0){	        	
	            power++;
	            if((int) Math.pow(10,power-1) > Integer.MAX_VALUE / 10)
	            	break;
	        }
	        
	        len = power;
	        power--;
	        int j = 1;
	        int q = 0;
	        
	        for(int i=0;i<(len/2);i++){
	            if( (x / (int) Math.pow(10,power))%10 ==  (x % (int) Math.pow(10,j))/ (int) Math.pow(10,q) ){
	                power--;
	                j++;
	                q++;
	            }
	            else{
	                flag = false;
	                break;
	            }
	        }
	        return flag;
	    }
}
