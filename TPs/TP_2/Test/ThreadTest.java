class ThreadTest extends Thread {

    int counter;
    boolean isIncrementing;
    int val;

    ThreadTest(int counter, boolean isIncrementing, int val){
        this.counter = counter;
        this.isIncrementing = isIncrementing;
        this.val = val;
    }

    public void run(){
        try{
            while(isIncrementing && this.counter <= this.val){
                System.out.println(this.counter);
                this.counter++;
                Thread.sleep(10);
            }
            while(!isIncrementing && this.counter >= this.val){
                System.out.println(this.counter);
                this.counter--;
                Thread.sleep(10);
            }
        }
        catch(InterruptedException e){
            return;
        }
    }

    public static void main(String[] args) {
        ThreadTest TA = new ThreadTest(1, true,1000);
        ThreadTest TB = new ThreadTest(1000, false, 1);
        TA.start();
        TB.start();
    }
}
