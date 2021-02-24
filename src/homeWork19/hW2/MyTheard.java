package homeWork19.hW2;

public class MyTheard extends Thread {
    public MyTheard(){
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.print("Звичайні числа: ");
        while (true){
            System.out.print(ThreadFibonaci.fn + " ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
