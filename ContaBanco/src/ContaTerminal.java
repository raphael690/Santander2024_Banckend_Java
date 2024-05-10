import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale localBR = new Locale("pt", "BR");
        
        String nome;
        String sobrenome;
        int agencia;
        int numero;
        double saldo = 3000;
        String resultado;

        System.out.println("Olá, seja bem vindo, ao nosso Banco Santander!");
        System.out.println("----------------------------------------------");

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("----------------------------------------------");

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.next();
        System.out.println("----------------------------------------------");

        System.out.println("Digite o numero de sua agencia :");
        agencia = sc.nextInt();
        System.out.println("----------------------------------------------");
        
        System.out.println("Digite o número de seu cartao : ");
        numero = sc.nextInt();
        System.out.println("----------------------------------------------");
        

        System.out.println("Obrigado por ser nosso cliente " + nome + "!");
        System.out.println("Sua Nova conta em nosso Banco com os seguintes dados :");
        System.out.println("Olá " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso Banco," +
        " sua agencia é " + agencia + " conta " + numero + " e seu saldo "  + saldo + " já está disponível para Saque!\n");
        



    }  
}
