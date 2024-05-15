/* Usamos o controle de fluxo for, para interagir sobre array e coleções */
/*
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
    
}*/


/* O uso do for / each está fortemente relacionado, com um cenário onde 
 * contenha um array ou coleção, e assim, a interação é baseada nos elementos da coleção.
 */
 public class ExemploForArray{
    public static void main (String[] args){
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //FORMA ABREVIADA
        for (String aluno : alunos){
            System.out.println(aluno);
        }
    }
 }

 /*String aluno  : alunos  -> De forma abreviada, é criada uma variável
  * nome obtendo um elemento do vetor a cada ocorrência;
  * A impressão de cada aluno é realizada.
  */