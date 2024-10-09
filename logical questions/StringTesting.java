public class StringTesting {
  public static String reverseString(String str) {
    // Base case: if the string is empty or has only one character
    if (str == null || str.length() <= 1) {
        return str;
    }
    // Recursive case: reverse the substring starting from index 1, then append the first character
    return reverseString(str.substring(1)) + str.charAt(0);
}

public static boolean Ispalindrome(String str){
   if (str.length() == 0 || str.length() == 1) {
     return true;
   }

   if (str.charAt(0) == str.charAt(str.length()-1)) {
           return Ispalindrome(str);
   }
   return false;

}

public static void main(String[] args) {
    String str = "Vishal";
    String reversed = reverseString(str);
    System.out.println("Original: " + str);
    System.out.println("Reversed: " + reversed);
    System.out.println(Ispalindrome(str));
  }
}  