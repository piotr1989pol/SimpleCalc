import java.util.Scanner;

/**
 * Created by Piotr on 2017-07-07.
 */
public class SimpleCalc {
    public static void main(String args[]) {
        double a;
        double b;
        char sign ;
        Scanner sc = new Scanner(System.in);
        System.out.println("wpisz liczbę a : ");
        a = sc.nextInt();
        System.out.println("wpisz liczbę b : ");
        b = sc.nextInt();
        System.out.println("wpisz działanie jakie chcesz wykonać (np. + , - , *, / , % )");
      sign = sc.next().charAt(0);

        switch (sign) {
            case '+' :
                System.out.println("wynik dodawania a + b równa się  : " + (a + b));
                break;

            case '-' :
                System.out.println("wynik odejmowania a - b równa się : " + (a - b));
                break;
            case '*':
                System.out.println("wynik mnożenia a*b równa się : " + (a *b));
                break;
            case '/' :
                if(b != 0)
                System.out.println("wynik dzielenia a / b równa się  : " +(a/b));
                else
                    System.out.println("nie dziel przez 0 !!");
                break;
            case '%':
                if(b != 0)
                System.out.println("wynik modulo a % b równa się : " + (a%b));
                else
                    System.out.println("nie dziel przez przez 0 !!");
                break;


        }
    }
}



