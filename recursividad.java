import java.util.Scanner;

public class recursividad{
    public static void main(String[] args) {
    Scanner si = new Scanner (System.in);
    System.out.print("Ingrese un valor: ");
    int base = si.nextInt();
    System.out.print("Ingrese un exponente: ");
    int exponente = si.nextInt();
    si.close();
    System.out.printf("El valor de la potencia es: %.2f%n", potencia(base, exponente));
    }
    private static double potencia  (int base, int exponente){
        if (exponente == 0){
        return  1 ;
    }else if(exponente < 0){
        return potencia(base, exponente +1 )/base;
    }else{
        return  base * potencia ( base , exponente -1); 
    }
    }
}
    



