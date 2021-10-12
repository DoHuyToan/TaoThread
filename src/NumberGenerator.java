public class NumberGenerator implements Runnable {
//    in ra 10 số tự nhiên đầu tiên và mỗi lần in cách nhau 500

    private Thread mytThread;

    public NumberGenerator(){
        mytThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + mytThread);
        mytThread.start();
    }

    public Thread getMytThread(){
        return mytThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i<10; i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
