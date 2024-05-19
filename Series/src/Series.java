public abstract class Series {
    private int a1;
    private int d;

    public Series(int a1,int d){
        this.a1 = a1;
        this.d =d;
    }
    public abstract int getElement(int n);
    public abstract double getSum(int n);

    public int getA1() {
        return a1;
    }

    public int getD() {
        return d;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"---> " +"\n" +
                "Series{" +
                "a1=" + a1 +
                ", d=" + d +
                '}';
    }
}
