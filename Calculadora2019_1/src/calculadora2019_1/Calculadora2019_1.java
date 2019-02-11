package calculadora2019_1;

import java.util.Scanner;

public class Calculadora2019_1 {

    private static int ans;
    private static int x;
    private static int y;
    private static int n;

    public Calculadora2019_1() {
        ans = 0;
        this.n=0;
        this.x=0;
        this.y=0;
    }

    public static int suma(int a, int b) {
        ans = a + b;
        return ans;
    }

    public static int resta(int a, int b) {
        ans = a - b;
        return ans;
    }

    public static int adicionar(int v) {
        ans = ans + v;
        return ans;
    }

    public static int sustraer(int v) {
        ans = ans - v;
        return ans;
    }

    public static int devolver_ans() {
        return ans;
    }

    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public void clear() {
        ans = 0;
    }

    public static int potencia(int a, int b) {
        ans = (int) Math.pow(a, b);
        return ans;
    }

    public static int dividir(int a, int b) {
        while (b == 0) {
            System.out.println("no se puede dividir por cero, ingrese un valor mayor a cero");
            b = s.nextInt();
        }
        ans = a / b;
        return ans;
    }

    public void operaciontiempo() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String arg[]) {

        do {
            System.out.println("--------MENU---------");
            System.out.println("1. ingrese 1 para sumar ");
            System.out.println("2. ingrese 2 para restar");
            System.out.println("3. ingresa 3 para multiplicar");
            System.out.println("4. ingrese 4 para dividir");
            System.out.println("5  ingrese 5 para hacer una potencia");
            System.out.println("6. ingrese 6 adicionar al ans");
            System.out.println("7. ingrese 7 para sustraer al ans");
            System.out.println("por favor ingrese una opcion");
            n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("ingrese primer numero");
                    x = s.nextInt();
                    System.out.println("ingrese segundo numero");
                    y = s.nextInt();
                    ans = suma(x, y);
                    System.out.println("el resultado de la suma es: " + ans);
                    break;
                case 2:
                    System.out.println("ingrese primer numero");
                    x = s.nextInt();
                    System.out.println("ingrese segundo numero");
                    y = s.nextInt();
                    ans = resta(x, y);
                    System.out.println("el resultado de la resta es: " + ans);
                    break;
                case 3:
                    System.out.println("ingrese primer numero");
                    x = s.nextInt();
                    System.out.println("ingrese segundo numero");
                    y = s.nextInt();
                    ans = multiplicar(x, y);
                    System.out.println("el resultado de la multiplicacion es: " + ans);
                    break;
                case 4:
                    System.out.println("ingrese primer numero");
                    x = s.nextInt();
                    System.out.println("ingrese segundo numero");
                    y = s.nextInt();
                    ans = dividir(x, y);
                    System.out.println("el resultado de la division es: " + ans);
                    break;
                case 5:
                    System.out.println("ingrese numero base");
                    x = s.nextInt();
                    System.out.println("ingrese numero exponente");
                    y = s.nextInt();
                    ans = potencia(x, y);
                    System.out.println("el resultado de la potencia es: " + ans);
                    break;
                case 6:
                    System.out.println("ingrese numero a adicionar");
                    x = s.nextInt();
                    ans = adicionar(x);
                    System.out.println("el resultado de la adicion es: " + ans);
                    break;
                case 7:
                    System.out.println("ingrese numero a sustraer");
                    x = s.nextInt();
                    ans = sustraer(x);
                    System.out.println("el resultado de la susutraccion es: " + ans);
                    break;
                default:
                    System.out.println("la opcion ingresada no es correcta");
            }
        } while (n != 0);
    }

}
