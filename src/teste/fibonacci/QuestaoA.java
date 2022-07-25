package teste.fibonacci;

import java.util.Scanner;

public class QuestaoA {
	
	public static void main(String[] args) {
		
		 int n, primeiro = 0,proximo = 1;
         
         System.out.println("Digite a quantidade de termos");
         Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         System.out.print("Os primeiros " + n + " numeros de Fibonacci são: ");
         System.out.print(primeiro + " " + proximo);
         for (int i = 1; i<=n-2; ++i)
         {
             int result = primeiro + proximo;
             primeiro = proximo;
             proximo = result;
             System.out.print(" " + result);
         }
		
    }
		
}


