public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /*
         * Está linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;
        /*
         * Na linha abaixo iremos alterar o valor do variável para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;
        
        System.out.println(numero);
        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variável poderá obter outro valor;
         * logo a linha 22 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        //final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 3.15;
        //System.out.println(VALOR_DE_PI);


        /*
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333;
        long cpf = 965432109L;
        float pi = 3.14F;
        double salario = 1275.33;
        System.out.println("idade: " + idade);
        System.out.println("ano: " + ano);
        System.out.println("cep: " + cep);
        System.out.println("cpf: " + cpf);
        System.out.println("pi: " + pi);
        System.out.println("salario: " + salario);*/

    }
}
