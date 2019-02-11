package calculadora2019_1;

import java.util.Scanner;

public class Calculadora2019_1 {
    private int ans;
    private int x;
    private int y;
    private int n;
    
    public Calculadora2019_1(){
        Scanner s=new Scanner(System.in);
        n=0;
        System.out.println("--------MENU---------");
        System.out.println("1. ingrese 1 para sumar ");
        System.out.println("2. ingrese 2 para restar");
        System.out.println("3. ingresa 3 para multiplicar");
        System.out.println("4. ingrese 4 para dividir");
        System.out.println("5  ingrese 5 para hacer una potencia");
        System.out.println("6. ingrese 6 adicionar al ans");
        System.out.println("7. ingrese 7 para sustraer al ans");
        System.out.println("por favor ingrese una opcion");
        n=s.nextInt();
        
        do {            
            
        } while (n>0);
        
        
        
        ans=0;
    }
    
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int adicionar(int v){
        ans=ans+v;
        return ans;
    }
    
    public int sustraer(int v){
        ans=ans-v;
        return ans;
    }
    
    public int devolver_ans(){
        return ans;
    }
    
    public void clear(){
        ans=0;
    }
    
    public int dividir(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
    
    public void operaciontiempo(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            
        }
    }
}
