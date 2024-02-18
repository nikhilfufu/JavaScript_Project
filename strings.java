import java.util.ArrayList;
import java.util.List;

public class strings {
    public static void main(String[] args) {
        String s = "HELLO";
         String s1=s.replace("O","oo");
         String s2=s1.replaceFirst("o", " ");
        String sh=s2.repeat(5);
        System.out.println(sh);
        List<String> slList = new ArrayList<>();
        slList.add("nikhil - EUR ");
        slList.add("jeethu - EUR ");

        List<String> slList1 = new ArrayList<>();
        slList1.add("nikhil");
        slList1.add("jeethu");

        System.out.println(slList1);

        List<String> modifiedList = removeCurrencyCode(slList);

        // Check if the modifiedList is equal to slList1
        if (modifiedList.equals(slList1)) {
            System.out.println("yes sir");
        } else {
            System.out.println("no sir");
        }
    
    }

    public static List<String> removeCurrencyCode(List<String> A) {
List<String> B=new ArrayList<String>();
    int size = A.size();
for(int i =0; i<size ; i++){
    String option=A.get(i).replaceAll(" - [A-Z]+", "").replaceAll(" ","");
    B.add(option);
    System.out.println(B);
}

        return B;
    
}
}