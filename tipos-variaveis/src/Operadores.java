public class Operadores {
    public static void main(String[] args){
        
        System.out.println("Exemplos de Operadores Aritmáticos\n");
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

    }

}
