import java.util.Scanner;

public class ListaTresExercicioSete {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    int par = 0;
    int impar = 0;

    System.out.print("Digite o 1° número: ");
    int numero1 = scanner.nextInt();

    System.out.print("Digite o 2° número: ");
    int numero2 = scanner.nextInt();

    System.out.print("Digite o 3° número: ");
    int numero3 = scanner.nextInt();

    System.out.print("Digite o 4° número: ");
    int numero4 = scanner.nextInt();

    System.out.print("Digite o 5° número: ");
    int numero5 = scanner.nextInt();

    System.out.print("Digite o 6° número: ");
    int numero6 = scanner.nextInt();

    System.out.print("Digite o 7° número: ");
    int numero7 = scanner.nextInt();

    System.out.print("Digite o 8° número: ");
    int numero8 = scanner.nextInt();

    System.out.print("Digite o 9° número: ");
    int numero9 = scanner.nextInt();
    
    System.out.print("Digite o 10° número: ");
    int numero10 = scanner.nextInt();

    if (numero1 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero2 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero3 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero4 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero5 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero6 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero7 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero8 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero9 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }
    
    if (numero10 % 2 == 0) {
      par ++;      
    } else {
      impar ++;
    }

    System.out.printf("\nTemos " + par + " número(s) par(es) e " + impar + " número(s) ímpar(es).");

    scanner.close();
  }
}