//Runnable thread
package threads;

class Walk implements Runnable{
public void run(){
    System.out.println("threads.walk.run()");
    try{
    Thread.sleep(1000);
    }catch(Exception e){
        System.out.println(e);
    }
}

}

public class Threads {

    public static void main(String[] args) {
       Walk walk = new Walk();
       Thread thread = new Thread(walk);
       thread.start();
       try{
    Thread.sleep(1000);
           System.out.println("threads.main()");
    }catch(Exception e){
        System.out.println(e);
    }
        System.out.println("threads.Threads.main()");
    }
    
}
