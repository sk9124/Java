import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int i = scanner.nextInt();
        if (i>=18){
        System.out.println("Eres mayor de edad");
       } else     
        System.out.println("No eres mayor de edad");
        
   
    }  
  }
