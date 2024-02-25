
import java.util.Arrays;


public class anagram {
    public static void main(String[] args) {
       if(Anagram("cba", "abc")){
        System.out.println("it is");
       }
       else{
        System.out.println("no");
       }

    }
    public static boolean Anagram(String st1 , String st2){
     if(st1.length()==st2.length()){
        
       char[] a = st1.toLowerCase().toCharArray();
       char[] b = st2.toLowerCase().toCharArray();
       
     Arrays.sort(a);
     for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
     }
     Arrays.sort(b);
     if(Arrays.equals(a, b)){
        return true;
     }
     else{
        System.out.println("it is not");
        return false;
     }
    }
     else{
        return false;
     }

    }
}
