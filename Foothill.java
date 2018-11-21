public class Foothill
{
   public static void main(String[] args)
   {
      String preference, substring; 
      char fifth, seventeenth;
      preference = "Java versus C++ Programming";
      
      fifth = preference.charAt(5); /* store the result of the character 
      found at the fifth position */
      
      seventeenth = preference.charAt(17); /* store the result of the character 
      found at the seventeenth position */
      
      substring = preference.substring(5); /* the substring of whichIsBetter
      starting at the fifth position */
      
      System.out.println("The string we're examining is \"" + preference + "\".");
      System.out.println("The character at the fifth index is \"" + fifth + "\".");
      System.out.println("The character at the seventeenth index is \"" + seventeenth + "\".");
      System.out.println("The substring starting at the fifth index is \"" + substring + "\".");
   }

}

/* -------------------- paste of run from console window -------------------------

The string we're examining is "Java versus C++ Programming".
The character at the fifth index is "v".
The character at the seventeenth index is "r".
The substring starting at the fifth index is "versus C++ Programming".

---------------------------------------------------------------------------------*/