package edu.teste.segundasemana;
public class MinhaClasse 
{

    public static void main (String [] args)
    {
        String primeiroNome = "Teste";
        String segundoNome = "Nacional Efetuado com Sucesso!";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
