public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName=threadName;
        System.out.println("oluşturuyor" + threadName);
    }

    @Override
    public void run() {
        System.out.println("çalistiriliyor" + threadName);

    try

    {
        for (int i=1; i <= 10; i++) {
            System.out.println(threadName + ":" + i);
            Thread.sleep(1000);
        }
    }catch(
    InterruptedException exception){
        System.out.println("kesildi" + threadName);
    }
    System.out.println("thread bitti"+threadName);

}
public  void  start(){
        System.out.println("thread nesnesi oluşturuyor");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
}
}
