import java.lang.Runnable;
public class runs implements Runnable {
    String thd ;
    public runs(String th){
        this.thd = th;
    }
    public void run(){
        for(int i = 0;i<=5;i++){
            try{
                System.out.println(this.thd+" execution no ." +i);
                
            }
            catch(Exception e){
                e.printStackTrace();

            }
        }
    }
}
