public class Invoicing extends Series{
    public Invoicing(int a1,int d){
        super(a1, d);
    }

    @Override
    public int getElement(int n) {
        int an = 0;
        an = this.getA1() + (n - 1) * getD();
        return an;
    }

    @Override
    public double getSum(int n) {
        double sn = 0;
        sn =(double) (n * (this.getA1() + getElement(n))) / 2;
        return sn;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
