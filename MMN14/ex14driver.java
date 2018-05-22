 import java.util.Scanner;
/**
 * Write a description of class ex14driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ex14driver
{
  
/**
 * Write a description of class Driver13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

  public static void main ()
  {
      ex14  e = new ex14(); 
     System.out.println("~Ex14 tester~\n\n\n===>Checking method 'isTrans':");
     		System.out.println("true? "+e.isTrans("", "")); 
     		System.out.println("false? "+e.isTrans(null, null)); 
     		System.out.println("false? "+e.isTrans("abc", null)); 
     		System.out.println("false? "+e.isTrans(null, "abc")); 
     		System.out.println("false? "+e.isTrans("abbcd", "abcd"));
		System.out.println("true? "+e.isTrans("abbcd", "abbbcdddddd"));
		System.out.println("true? "+e.isTrans("abbcd", "abbcd"));
		System.out.println("false? "+e.isTrans("abbcd", "abbbcdddddds"));
		System.out.println("false? "+e.isTrans("addddsss", "abbbcdddddds"));
		System.out.println("false? "+e.isTrans("addddsss", "addddsssaddddsss"));
		
		
		
		
   
     /**  int[][]matrix = new int[][] {{12,22,23,54},{43,35,21,20},{34,21,43,21},
		{25,30,0,20},{0,22,10,10 }, {20,13,3,45}};
		printMatrix (matrix);
		int count = ex14.countPaths (matrix);
		System.out.println ("countPaths is: " + count + "\t should be: 3");
		System.out.println ();
		*/
		 
	
}
/** // prints two dimentional array 
    public static void printMatrix(int[][] values){
        System.out.print("The matrix is: \n");
        for (int i=0; i<values.length; i++){
		  		for (int j=0; j<values[0].length;j++)
            	System.out.print("\t"+ values[i][j]);
				System.out.println();
		  }
    }**/

  }


