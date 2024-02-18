import java.util.ArrayList;
import java.util.List;

class nikhil extends appi{
    public static void main(String[] args) {
   appi a = new nikhil();

   if(a instanceof nikhil){
    System.out.println("hello");
    nikhil n = (nikhil)(a);
    System.out.println("down cast done");
   }
   
    
      

            String s = "nikhil -EUR";
            
           String s2= s.replaceAll(" -[A-Z]+", "");
           System.out.println("the replaced   "+s2);

           List<String> slList = new ArrayList<>();
           slList.add("nikhil - EUR ");
           slList.add("jeethu - EUR ");
   
           List<String> slList1 = new ArrayList<>();
           slList1.add("nikhil");
           slList1.add("jeethu");
   
           System.out.println(slList1);
   
           List<String> modifiedList = removingCurrencyCode(slList);
   
           // Check if the modifiedList is equal to slList1
           if (modifiedList.equals(slList1)) {
               System.out.println("yes sir");
           } else {
               System.out.println("no sir");
           }
       }
   
       public static List<String> removingCurrencyCode(List<String> s) {
           List<String> sx = new ArrayList<>();
           for(int i = 0;i<s.size();i++) {
               String new2 = sx.get(i).replaceAll(" - [A-Z]+ ", "").replaceAll(" ","");
               sx.add(new2);
           }
        
           System.out.println(sx);
           return sx;
       }
   }