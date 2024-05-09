
public class Operadores {
    public static void main(String[] args){
        
        System.out.println("Exemplos de Operadores Aritméticos\n");
        double soma = 10.5 + 15.7;
        System.out.println("A soma de 10.5 + 15.7 é: " + soma);
        int subtracao = 113 - 25;
        System.out.println("A subtração de 113 - 25 é: " + subtracao);
        int multiplicacao = 20 * 7;
        System.out.println("A multiplicação de 20 * 7 é: " + multiplicacao);
        int divisao = 15 / 3;
        System.out.println("A divisão de 15 / 3 é: " + divisao);
        int modulo = 18 % 3;
        System.out.println("O modulo de 18 % 3 é: " + modulo);
        double resultado = (10 * 7) + (20 / 4);
        System.out.println("O resultado da expressão (10 * 7) + (20 / 4) é: " + resultado);

        System.out.println("--------------Classe Operador .java-----------------------------");
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        System.out.println("qual o resultado das expressoes abaixo?\n");

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        

        System.out.println("-----Operadores Unários-----");
        int numero = 5;
        //imprimindo o numero negativo
        System.out.println(- numero);
        
        System.out.println("Incrementando numero em mais 1 numero, imprime 6");
        numero ++;
        System.out.println(numero);

        System.out.println("Incrementando numero em mais 1 numero, imprime 7");
        System.out.println(numero ++); // ops algo de errado está certo
        System.out.println(numero); // agora sim, numero virou 7

        System.out.println("Ordem de precedencia conta aqui");
        System.out.println(++ numero);

        boolean verdadeiro = true;
        System.out.println("inverteu " + !verdadeiro);

        System.out.println("-----------------Operador Ternário-----------------\n");

        int a, b;
        a = 5;
        b = 6;
        String result = "";
        System.out.println("---Exemplo de Condicional utilizando uma estrutura IF/ELSE---");
        if (a == b)
            result = "verdadeiro";
        else
            result = "falso";
        System.out.println(result);

        System.out.println("---Mesma Condicional, mas dessa vez, utilizando o operador condicional ternário---");
        String valor = a == b ? "true" : " false";
        System.out.println(valor);

        System.out.println("\n");
        System.out.println( "-----------------------Operadores Relacionais----------------------\n");

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? "+ simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2? " + simNao);

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        String nomeUm = "Raphael";
        String nomeDois ="Raphael";

        System.out.println(nomeUm == nomeDois);

        System.out.println("-----------------------Comparação Avançada--------------------------\n");
        
        String num1 = "JAVA";
        String num2 = "JAVA";

        System.out.println("num1 e num2 são igual ? " + (num1 == num2));

        String num3 = new String("JAVA");
        System.out.println("num1 é igua a num3 ? " + (num1 == num3));

        String num4 = num3;
        System.out.println("num3 é igual a num4 ? " + (num3 == num4));
        
        System.out.println("equals na parada\n");
        System.out.println(num1.equals(num2));
        System.out.println(num2.equals(num3));
        System.out.println(num3.equals(num4));

        System.out.println("----------------------  == Versus  equals ------------------------------");
        
        int n1 = 130;
        int n2 = 130;
        System.out.println(n1 == n2); 

        Integer nu1 = 130;
        Integer nu2 = 130;
        System.out.println(nu1 == nu2);

        System.out.println(nu1.equals(nu2));

        System.out.println("---Expressões Lógicas Avançadas && Operador Lógico E || Operador Lógico OU---\n");
        
        boolean  condicao1 = true;
        boolean condicao2 = true;
        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões
         * é como se estivesse escrito:
         * Se condição 1 e condicao2 forem verdadeiras, executar código"
         */
        if(condicao1 && condicao2)
        {
            System.out.println("Os dois valores são verdadeiros!");
            
            // se condicao1 OU || condicao2 for verdadeira, executar código.
        }
        else if (condicao1 || condicao2)
        {
            System.out.println("Um dos valores é verdadeiro");
        }
        
            System.out.println("FIM");              

    }

}//daniele.pereira@grupootimiza.com.br
