public class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new runs("nikhil"));
        Thread t2 = new Thread(new runs("jeethu"));
        t1.start();
        t2.start(); 

    }
}
