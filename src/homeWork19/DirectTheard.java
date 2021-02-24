package homeWork19;

import java.util.List;

public class DirectTheard extends Thread {
    private List<Integer> num;
    private long sleapTime;

    public DirectTheard(List<Integer> num, long sleapTime) {
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
                sleep(sleapTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
