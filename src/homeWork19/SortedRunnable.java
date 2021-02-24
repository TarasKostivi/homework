package homeWork19;

import java.util.List;

public class SortedRunnable implements Runnable {
    private List<Integer> num;
    private long sleapTime;

    public SortedRunnable(List<Integer> num, long sleapTime) {
        this.num = num;
        this.sleapTime = sleapTime;
    }

    public List<Integer> getNum() {
        return num;
    }

    public void setNum(List<Integer> num) {
        this.num = num;
    }

    public long getSleapTime() {
        return sleapTime;
    }

    public void setSleapTime(long sleapTime) {
        this.sleapTime = sleapTime;
    }

    public void run(){
        for (Integer number: num){
            System.out.println(Thread.currentThread().getName()+"::"+number);
            try {
                Thread.sleep(sleapTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
