import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
     
        System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();

        System.out.println("Olá, seja bem vindo, ao nosso Banco Santander!");
        System.out.println("----------------------------------------------");

        System.out.printf("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("----------------------------------------------");
      
        System.out.println("Digite o numero de sua agencia: Exemplo 123-4");
        String agencia = sc.nextLine();
        System.out.println("----------------------------------------------");
        
        System.out.println("Digite o número de seu cartao: Exemplo: 1234 ");
        int numero = sc.nextInt();
        System.out.println("----------------------------------------------");
        
        System.out.println("Digite o Valor do seu deposito inicial : ");
        Double saldo = sc.nextDouble();

        double bonus = 0.0;
        if(saldo >= 3000){
            //Adiciona 50% de bônus se o valor inserido for maior igual que 3000
            bonus = saldo * 0.5;
            saldo += bonus;       
        }

        JOptionPane.showMessageDialog(null,"Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso Banco,\n" +
        "sua agencia é " + agencia + " conta " + numero + " e seu saldo R$: "  + saldo +"\nJá está disponível para Saque!\n");
      

        
        System.out.println("----------------------------------------------");

        String mensagem = "-------Comprovante da Conta Bancária Detalhado--------\n\n" +
                          "Olá, seja bem vindo, ao nosso Banco Santander!\n" + 
                          "--------------------------------------------------------------------\n" +
                          "Nome do Cliente: " + nomeCliente + "\n" +
                          "Agência: " + agencia + "\n" +
                          "Numero do Cartão: " + numero + "\n" +
                          "Saldo Bonus 50%: " + bonus + "\n" +
                          "Saldo Total: R$ " + saldo + "\n" +
                          "---------------------------------------------------------------------\n" +
                          "Obrigado por criar uma conta em nosso Banco, \n" +
                          "seu saldo já está disponível para saque!\n" +
                          "----------------------------------------------------------------------\n";

                          JOptionPane.showMessageDialog(null, mensagem); 

              
        sc.close();
    }  
}
