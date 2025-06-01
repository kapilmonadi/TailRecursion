import static com.kapil.recursion.FactorialRecursion.calculateFactorial;
import static com.kapil.recursion.FactorialRecursion.calculateFactorialTailRec;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorialTailRec(5));
    }
}