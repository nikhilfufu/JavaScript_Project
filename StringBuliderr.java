public class StringBuliderr {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbu = new StringBuffer();
        Thread t = new Thread(new RunString(sb));
        Thread t2 = new Thread(new RunString(sb));
        Thread t3 = new Thread(new RunString(sbu));
        Thread t4 = new Thread(new RunString(sbu));
        t.start();
        t2.start();
        t3.start();
        t4.start();
        try{
        t.join();
        t2.join();
        t3.join();;
        t4.join();;
        }
        catch(Exception e){
            
        }
        System.out.println("the size of the stringbulider is "+sb.length());
        System.out.println("the size of the stringbulider is "+sb.toString());
        System.out.println("the size of the stringbuffer is "+sbu.length());
        System.out.println("the size of the stringbuffer is "+sbu.toString());
    }
}
