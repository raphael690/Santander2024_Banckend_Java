// ----------Estrutura Condicional Composta---------

/*public class ResultadoEscolar {
    public static void main (String[] args) {
        int nota = 9;

        if (nota >= 7)
        System.out.println("Aprovado");

        else
        System.out.println("Reprovado");
    }
    
} */

/* 
// -------Estrutura Condicional encadeadas----------

public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 7;
        
    if (nota >= 7)
        System.out.println("Aprovado");
    else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação");
    else
        System.out.println("Reprovado");
    }          
}*/

//--------Estrutra Condicional Ternária Cenario 1-------

/* 
public class ResultadoEscolar{
    public static void main(String[] args){
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}*/


//--------Estrutra Condicional Ternária Cenario 2-------
/* 
public class ResultadoEscolar{
    public static void main(String[] args){
        double nota = 4.99;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
*/



/*Aplicando JOptionPane.showMenssageDialog e JOptionPane.showOnputDialog */

import java.util.Scanner;

import javax.swing.JOptionPane;
public class ResultadoEscolar{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota final: ");
        Double nota = sc.nextDouble();
        String resultado;

        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        JOptionPane.showMessageDialog(null,resultado);

    }
}