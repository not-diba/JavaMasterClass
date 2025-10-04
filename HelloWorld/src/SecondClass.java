public class SecondClass {
    public static void main(String[] args) {
        double a =  20.00d;
        double b = 80.00d;

        double result = (a + b) * 100.00d;

        boolean isRemZero = result % 40.00d == 0;

        System.out.println(isRemZero);

        if (!isRemZero) System.out.println("got some remainder");
    }
}