public class ExemploFor {
    public static void main(String[] args){
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++)
        {
            //System.out.println("Contando carneirinhos " + carneirinhos);            
        }

        System.out.println("Joaozinho parou de contar e dormiu!");


                        // Outras estruturas

//--------------------------estrutura 1------------------------------------
        System.out.println("Outras estruturas");
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
             System.out.println(carneirinhos + " - Carneirinho(s)");
        }


//------------------estrutura 2 = o que importa é somente o bloco condicional------------  
        System.out.println("o que importa é somente o bloco condicional");
        int carneirinhos = 1;
        for( ; carneirinhos <= 20;){
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

    }    
}


