import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Value: ");
        String s = sc.nextLine();
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;

        for(int i=0;i<s.length(); i++){
        int currValue = romanToInt.get(s.charAt(i));

        if(i<s.length()-1 && currValue < romanToInt.get(s.charAt(i+1))){
            total -= currValue;
        }else{
            total += currValue;
        }
    }
    sc.close();
    System.out.println("Int value of this Roman Value is : " +total);
      }    
}
