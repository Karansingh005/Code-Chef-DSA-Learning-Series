import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    static final int MAX_CHAR=26;
	public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<String> abc = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
           String b = sc.next();
           sc.nextLine();
            abc.add(b);
        }
        for(String item: abc){
            if(Lapindromes(item)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
    static boolean Lapindromes(String s){
        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int l=s.length();

        if(s.length()==1){
            return true;
        }
        for(int i=0, j=l-1; i<j ; i++,j--){
            count1[s.charAt(i)-'a']++;
            count2[s.charAt(j)-'a']++;
        }
        for(int i=0; i<MAX_CHAR; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
}
