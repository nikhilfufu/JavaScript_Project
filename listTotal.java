import java.util.ArrayList;
import java.util.List;

public class listTotal {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("4000");
        a.add("5000");
        a.add("7000");
        a.add("(6000)");
        a.add("(5000)");
        addList(a);
        String s = "n(i()khi)]l";
        String string2 = s.replaceAll("i", " ");
        String string3 = s.replace("]", "h");
        System.out.println(string2);
        System.out.println(string3);
    }
public static int addList(List<String> a){
int sum = 0;
int diff = 0;
for (String string : a) {
    if(string.contains("(")){
    diff+= -Integer.parseInt(string.replaceAll("[()]", ""));
    }
    else
    sum+=Integer.parseInt(string);
}
return sum+diff;
    }
}
