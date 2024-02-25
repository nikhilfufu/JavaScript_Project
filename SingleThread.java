public class SingleThread {
    public static void main(String[] args)  {
        for(int i = 0;i<=5;i++){
            try{
                Thread.sleep(i);
                int c = i/0;
            }
            catch(Exception e){
                System.out.println("this number caused exception "+i);
                e.printStackTrace();
            }
            finally{
                System.out.println("print this");
            }
        }
    }
}
