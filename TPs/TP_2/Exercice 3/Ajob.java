import java.math.*;

public class Ajob implements Runnable
{
    Valeur myVal;
    int i;

    Ajob(Valeur val,int v)
    {
        this.myVal = val;
        this.i = v;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
        for(int i=0;i<Math.pow(10, 6);i++)
        {
            myVal.add(this.i);
            System.out.println(myVal.toString());
            Thread.sleep(1);
        }
        }catch(InterruptedException e){return;}
    }
}