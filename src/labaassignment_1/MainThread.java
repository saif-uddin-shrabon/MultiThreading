package labaassignment_1;

public class MainThread { //current thread
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : "+t);
        //reset thread name ....
        t.setName("Saif");
        System.out.println("Changed Nmae : "+t);
        try{
            for(int i = 5 ; i > 0 ; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted!");
        }
    }
}
