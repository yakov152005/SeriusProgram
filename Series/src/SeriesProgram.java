import java.util.Scanner;

public class SeriesProgram {
    public static void main(String[] args) {

        int a1,d,q,n;
        System.out.println("How much series? ");
        int numOFSeries = s.nextInt();
        Series[] series = new Series[numOFSeries];
        for (int i = 0; i < series.length; i++) {
            System.out.println("Enter 1 for Invoicing, 2 for Engineering ---> ");
            int choice = s.nextInt();

            switch (choice){
                case INVOICING:
                    System.out.println("Enter |a1|:");
                    a1 = s.nextInt();
                    System.out.println("Enter |d|:");
                    d = s.nextInt();
                    System.out.println("Enter |n|:");
                    n = s.nextInt();
                    series[i] = new Invoicing(a1,d);
                    Invoicing invoicing =(Invoicing) series[i];
                    System.out.println("The " +n + "th elment is: " + invoicing.getElement(n));
                    System.out.println("The sum of the first " +n +" elment is: " + invoicing.getSum(n));
                    System.out.println(invoicing);
                    break;

                case ENGINEERING:
                    System.out.println("Enter |a1|:");
                    a1 = s.nextInt();
                    System.out.println("Enter |q|:");
                    q = s.nextInt();
                    System.out.println("Enter |n|:");
                    n = s.nextInt();
                    series[i] = new Engineering(a1,q);
                    Engineering engineering = (Engineering) series[i];
                    System.out.println("The " +n + "th elment is: " + engineering.getElement(n));
                    System.out.println("The sum of the first " +n +" elment is: " + engineering.getSum(n));
                    System.out.println(engineering);
                    break;
            }
        }
    }
    public static Scanner s = new Scanner(System.in);
    public static final int INVOICING = 1;
    public static final int ENGINEERING = 2;
}
