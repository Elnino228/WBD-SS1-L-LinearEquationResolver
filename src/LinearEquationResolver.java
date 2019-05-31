import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Give a equation as 'a*x+b=0', please enter constants:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter b: ");
        double b=scanner.nextDouble();

        if (a!=0){
            double x=-b/a;
            System.out.printf("The solution is: %f!",x);
        } else {
            if (b==0){
                System.out.print("The solution is all x");
            } else {
                System.out.print("No solution");
            }
        }

    }
}
