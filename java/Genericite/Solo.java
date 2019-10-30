public class Solo<T>{
    public T valeur;

    public Solo(){
        this.valeur = null;
    }

    public Solo(T val){
        setValeur(val);
    }

    public void setValeur(T val){
        this.valeur = val;
    }

    public T getValeur(){
        return this.valeur;
    }
}