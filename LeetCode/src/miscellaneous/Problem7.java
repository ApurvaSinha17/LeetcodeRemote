package miscellaneous;

public class Problem7 {

	public static void main(String[] args) {
		
		System.out.println("Number: -2147483648");
		System.out.println(reverse(-2147483648));
		System.out.println(rev(-2147483648));

	}

	public static int reverse(int x) {
        
        int result = 0;
        int num = x;
        int digitCount = 0;
        int position = 0;
        
        while(Math.abs(num) > 0){
            digitCount++;
            num = num / 10;
        }
        
        num = x;
        
        while(digitCount >= 1){
            result = (int) ( (int) Math.pow(10,position) * (int) (num / Math.pow(10,(digitCount-1))) + result);
            //System.out.println((int) Math.pow(10,position)+" * "+(int) (num / Math.pow(10,(digitCount-1)))+" + "+result);
            //System.out.println("result: "+result+" digitCount: "+digitCount+" position: "+position+" num: "+num);
            num = (int) (num % Math.pow(10,(digitCount-1)));
            position++;
            digitCount--;
        }
        //System.out.println("Result: "+result);
        return result;
    }
	
	private static int rev(int x){
		
        int n = x;
        long reverse = 0;
	      while( n != 0 )
	      {
	          reverse = reverse * 10 + n%10;
	          n = n/10;
	      }
	   if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
	        return 0;
	   else
	        return (int) reverse;
	}
}
