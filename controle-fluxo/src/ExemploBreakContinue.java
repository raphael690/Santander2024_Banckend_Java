public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if (numero == 3)
                    //break;
                    continue;
            System.out.println(numero);
        }
    }
}

//Resultado do break é : 1,2
// Resultado do continue é : 1,2,4,5
/*
 * Break significa quebrar, parar, frear, interromper. E é isso que se faz,
 *  quando o java encontra esse comando pela frente. continue, como o nome diz, ele
 * continua o laço. O comando (break) interrompe o laço, já o (continue) interrompe somente 
 * a interação atual
 */