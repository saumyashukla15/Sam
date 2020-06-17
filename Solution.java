import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        return true;
        char[] ar1=a.toCharArray();
        char[] ar2=b.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(ar1.equals(ar2)){
            return true;
        }
        return false;
        }
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