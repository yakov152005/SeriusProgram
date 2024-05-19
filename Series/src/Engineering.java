public class Engineering extends Series{
    public Engineering(int a1,int q){
        super(a1,q);
    }

    @Override
    public int getElement(int n) {
       int an = 0;
       int q = this.getD();
       an = (int) (this.getA1() * (Math.pow(q,(n-1))));
       return an;
    }

    @Override
    public double getSum(int n) {
        double sn = 0;
        int q = this.getD();
        sn =  ((this.getA1() *(Math.pow(q,n)-1)) /(q -1));
        return sn;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
