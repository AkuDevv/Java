public class ThreadsTest extends Thread {

    int val;

    ThreadsTest(int val)
    {
        this.val = val;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
            if(val == 1){
                while(val <= 1000) {
                    val++;
                    System.out.println(val);
                    sleep(100);
                }
            }
            else if(val == 1000){
                while(val >= 1){
                    val--; 
                    System.out.println(val);
                    sleep(100);
                }
            }
            else{
                System.out.println("La valeur peut etre 1 ou 1000 !!");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
            return;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadsTest(1);
        Thread t2 = new ThreadsTest(1000);

        t1.start();
        t2.start();
    }
}