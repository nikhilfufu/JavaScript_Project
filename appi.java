public class appi {
    int a = 30;
    
    public static void method() {
        System.out.println("this is object method");
    }
    public  void method(String s) {
        System.out.println("this is string method");
        System.out.println(this.a);
    }
   public static void main(String[] args) {
    System.out.println(10+10+"nikhil"+10+20);
    appi a = new appi();
    a.method(null);
    String s = "nikhil";
    String s2 ="";
    for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        
        s2=c+s2;
    }
    String st = "nikhilgn";
    String st2 = st.replace("i", "");st.replace("i", "");
    System.out.println(st.toString());
    System.out.println(st2);
    System.out.println(s2);
    StringBuffer s4 = new StringBuffer();
   // s4.append("niiiiiiiiiiiiiiiiiii");
    System.out.println(s4.hashCode());
   }
    
    
}
