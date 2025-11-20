// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x, int y)
    {
        int a = x;
        if (y >= 0)
        {for (int i = 0 ; i < y ;i++  )
        {
            a++;
        }
        return a;
        }
    else
        {
          {for (int i = y ; i < 0 ;i++)
        {
            a--;
        }
        return a;
        }
        }
    }

	// Returns x1 - x2
	public static int minus(int x, int y) {
		// Replace the following statement with your code
		int a = x;
         if (y == 0)
		{return x;}
		if (y < 0)
		{y= -y;
		return plus(x,y);
		}
        for (int i = y ; i > 0 ;i--)
        {
            a--;
        }
        return a;
        }
	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		if (x2 ==0 || x1 == 0)
		{return 0;}
		if (x1 < 0  && x2 < 0 || x1 > 0 && x2 <0 )
		{x1 = -x1;
		x2 = -x2;}
		int a = x1;
		for (int i = 1 ; i < x2 ;i++)
        {a =  plus(a,x1); }
		return a;
	}
	

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int a= x;
		if(n==0)
		{return 1;}
		for (int i =1; i< n ; i++)
		{
		a = times (a,x);
		}
		return a;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		boolean neg = (x1 <0 && x2 >0) || (x1>0 && x2 <0);
		int div1 =0 ;
		if (x1 < 0)
		{x1 = -x1;}			
		if (x2 < 0)
		{x2 = -x2;}
		if (x2 == 0)
		{return -1;}
		if (x1 == 0)
		{return 0;}
		if (x1 == x2)
		{return 1;}
		for (int i = x2; i <= x1 ; i = plus(i,x2))
		{
			div1++;
		}
		if (neg)
		{return (-div1);}
		return div1;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		boolean neg = (x1 <0 && x2 >0) || (x1>0 && x2 <0);
		int a =0 ;
  	  	for (int i = x1; i >= x2;) 
		{ i = minus(i, x2);
		a= i;}
		if (neg)
		{a= -a;}
    	return a;
}

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		int max =0;
		if (x<0)
		{return -1;}
		if (x==0)
		{return 0;}
		if (x==1)
		{return 1;}
	 for (int i = 1; i <= x; i++) {
        int sq = times(i, i); 

        if (sq == x) {
            return i;          
        } else if (sq < x) {
            max = i;           
        } else {             
            break;          
        }
    }
	return max;
	}	  	  
}