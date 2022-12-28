//hallar el area del triangulo isoceles
//estudiante cifuentes zavala miguel
import java.util.Scanner;

public class segundo{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese la base que tiene el triangulo: ");
        double a = Double.parseDouble(sc.nextLine());
        
        System.out.print("ingresa la altura que tiene el triangulo: ");
        double b = Double.parseDouble(sc.nextLine());
        
        double area = (b * Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
        System.out.println("El área del triangulo isósceles es: " + area);
    }
}