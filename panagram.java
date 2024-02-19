public class panagram {
    public static void main(String[] args) {
        String s2 = "nikhil";


        String input = "The quick brown fox jumps over the lazy dog";
        if(isPanagram(input)){
            System.out.println("it is a panagram");
        }
        else{
            System.out.println("it is not panagram");
        }
    }
    public static boolean isPanagram(String s){
        String New = s.replace(" ", "").toLowerCase();
        int val = 0;
        for(char a = 'a';a <= 'z';a++){
            if(New.indexOf(a)==-1){
                return false;
            }
         val++;
        }
        System.out.println(val);
        return val==26;
    }
    
}
