import java.util.Scanner;
/**
 *
 * @Yona goncharov
 * id: 312631187
 */

public class ex14
{
   /**
    * q1 - A legal path is defined, by statring at the first cell (row 0 collumn 0)
    * and countinue to the next step by adding the first and the second digits of the number in the cell
    * untill reaching the last cell (row n collumn n).
    * return the amount of paths
    */
   
   public static int countPaths (int [][] mat)
{
    return countPaths(mat,0,0);
}

private static int countPaths(int[][] mat, int row, int col)
{
    int paths = 0;
    
    if (row == mat.length-1 && col == mat[row].length-1)
    {
        //In case it's the end of the array, that means we found a path.
        paths = 1;
    }
    else if (row <= mat.length-1 && col <= mat[row].length-1)
    {
        int currentOnes = mat[row][col] % 10;
        int currentTens = mat[row][col] / 10;
        
                System.out.println ("row: "+ row + " col " + col + " ones: " + currentOnes + " tens: " + currentTens);
        if (currentOnes == currentTens)
        {
           //In case of numbers like "22","44","55", etc. - count only one path.
           paths = countPaths(mat, row + currentTens, col + currentOnes);
        }    
        else if (mat[row][col] > 0)
        {
             //Calculate the returns of both paths in each step
             paths = countPaths(mat, row + currentTens, col + currentOnes) + 
                     countPaths(mat, row + currentOnes, col + currentTens);
        }
    }
    
    return paths;
}// end of method 

   /**
    * q2 - the program return true/ false is string t is transform of string s 
    * It is a transformation of string  if it follows the same order of characters,
    * has only the same characters, yet may have them multiplied.
    */
   
   public static boolean isTrans (String s , String t )
    {
        boolean result = false; //boolean default false for return 
        
        if (s != null && t != null && t.length() >= s.length()) //checking is string is valid  call the function
        {
           result =  isTrans (s, t , 0, 0);
        }
        
        return result;
    }
    
    private static boolean isTrans (String s, String t , int i , int j ) // i and j pointer to char at string 
   {
    boolean result = false; 
     
    if (i == s.length() && j == t.length())
    {
       result = true; //t is transfer of s 
    }
    else if (i < s.length() && j < t.length() && s.charAt(i) == t.charAt(j))
    {
       result = isTrans( s, t , i, j + 1) || isTrans( s , t ,i + 1, j + 1)  ;
    }
    
    return result;
   }// end of method


}


      
 
