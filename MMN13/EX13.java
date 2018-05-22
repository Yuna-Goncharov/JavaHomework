  import java.util.Scanner;
/**
 *
 * @Yona goncharov
 * id: 312631187
 */
public class EX13
{
    
    
    /**
     * Weight function is gets num and digit needs to return the digit weigth
     * can be: ones, tens and so 
     * return the first appereance on num
     * without recurtion 
     */
  public static int weight(int num, int digit)
  {
      int result = 0; //for return in end 
      int index = 1; // digit wiegt is ones
      while (num >0)
      {
        int sub = num % 10;// sub is the digit the we testing if is equal to digit
        
        if (sub == digit)// condition for equal
        {
            result = index;
            break;// end of function 
        }
        else
        {
            num =num/10; // we want to continu looking for the digin in num be reducing last digit
            index = index * 10;
            result = index;
        }
      }
      return result;
   } // end method
   
   /**
     * Weight function is gets num and digit needs to return the digit weigth
     * can be: ones, tens and so 
     * return the first appereance on num
     * with recurtion
     */
   
    public static int weightRec(int num, int digit)
    {
      int result = 0; //for return
      int index = 1;// digit wiegt is ones
      int sub = num % 10;// sub is the digit the we testing if is equal to digit
        
      if (sub == digit)// condition for equa
      {
      result = index;
      }
      else if (num > 9) //the other num that left for looking the digit
      {
      index = (index*10)*weightRec(num/10,digit);
      result = index; 
     }
     return result; 
    }// end method
    
     /**
     * The method Prints a positive integer in reverse
     * without recurtion
     */
    public static int reverse(int num)
    { 
        int reverse = 0; //return index for end of method 
        while(num != 0)
        {
            reverse = (reverse * 10 )+( num % 10);
            num = num / 10;
        }
        return reverse;
    }// end of methos 
    
     /**
     * Prints a positive integer in reverse
     * with recurtion
     */
    public static int reverseRec(int num) 
    {
        return reverseRec (num ,0);
    }
    private static int reverseRec(int num , int digit) 
    {
     
     if (num == 0)
     {
       return digit;
        
     } 
     else 
     {
          digit = (digit*10) + (num%10);
     }
     return reverseRec(num/10,digit);
        
    }// end of method 

    
    /**
 	 * q2.a - This method calculates with how many ways spiderman can climb on a building
	 * @param n The number of floors
	 * @return the number of different ways
	 */
	 public static  int spiderman (int destFloor)
   {
    return spiderman(destFloor ,0);
   }
    
    private static int spiderman(int destFloor , int current)
    {
    int spidermanPaths; // the number of option for spiderman to claim 
    
     if ( destFloor == current)
    {
         spidermanPaths = 1;
     }
     else if (current > destFloor)
     {
         spidermanPaths = 0;
     }
     else
     {
         spidermanPaths = spiderman(destFloor , current +1) + spiderman(destFloor  ,current + 2 );
      }
     
     return spidermanPaths;
    }// end of method 
	 
    /**
    * q2.b - This method gets an integer number and calculates the amount of different ways that
    * that Spiderman can get to the last level.
    * if spiderman reaches the elevator in the 20th level it takes him right away to the last
    * level.
    * @return The number of the different ways to get to the last level of the building
    */    
   public static int spidermanPhoneBooth20(int n){
        if (n >= 30)
        return -1;
        else
        return spidermanPhoneBooth20(n,0);
      }
   //@overloading  
   private static int spidermanPhoneBooth20(int n,int i){
       if(i == n)
            return 1; 
       if(i > n)
            return 0;
       if(i == 20)
            return 1;
           
       return spidermanPhoneBooth20 (n,i+1) + spidermanPhoneBooth20 (n,i+2);
   } // end of method 

	   
 }


    

