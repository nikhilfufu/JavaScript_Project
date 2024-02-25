public class RunString implements Runnable {
   StringBuilder st ;
   StringBuffer st2;

    public RunString(StringBuilder st) {
     this.st = st;
    }
    public RunString(StringBuffer st2) {
        this.st2 = st2;
       }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            // Modifying the string by appending the thread's name
            st.append("A");
        }
    }
}

