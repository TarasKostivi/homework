package homeWork19.hW2;

public class ThreadFibonaci implements Runnable{

    public static volatile long fn;
    private int n;

    public ThreadFibonaci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long f0 = 1;
        fn=f0;
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long f1 = 1;
        fn=f1;
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            fn=f0+f1;
            f0=f1;
            f1=fn;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = n; i <= 0; i--) {
            fn=f0+f1;
            f0=f1;
            f1=fn;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
