//Extending thread
package threads;


public class ExtendingThread extends Thread{
    public static void main(String[] arg){
        ExtendingThread extendingThread = new ExtendingThread();
        extendingThread.start();
//        try{
//    Thread.sleep(1000);
//    }catch(Exception e){
//        System.out.println(e);
//    }
        System.out.println("threads.ExtendingThread.main()");
    }
    public void run(){
        try{
    Thread.sleep(1000);
    }catch(Exception e){
        System.out.println(e);
    }
        System.out.println("threads.ExtendingThread.run()");
    }
    
}
