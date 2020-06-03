import java.util.Scanner;

public class Solution {

       static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
        
        
            for(int j=0;j<a.length()-1;j++)
            if (aArray[j] > aArray[j+1]) {
                char temp = aArray[j];
                aArray[j] = aArray[j+1];
                aArray[j+1] = temp;
                j=-1;
            }
        
        String abc = new String(aArray);

        for(int j=0;j<b.length()-1;j++)
            if (bArray[j] > bArray[j+1]) {
                char temp = bArray[j];
                bArray[j] = bArray[j+1];
                bArray[j+1] = temp;
                j=-1;
            }
        
        String bcd = new String(bArray); 
        if(abc.equals(bcd)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
