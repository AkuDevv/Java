public class RunnableTest implements Runnable {

    int val;

    RunnableTest(int val)
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
                    Thread.sleep(100);
                }
            }
            else if(val == 1000){
                while(val >= 1){
                    val--; 
                    System.out.println(val);
                    Thread.sleep(100);
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
        Runnable rt1 = new RunnableTest(1);
        Runnable rt2 = new RunnableTest(1000);

        new Thread(rt1).start();
        new Thread(rt2).start();
    }
}