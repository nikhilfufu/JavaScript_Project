import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer>l = new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            l.remove(i);
            
        }
        System.out.println(l);
    }
    
    
}
