/* Modo Condicional convencional if /else */
/*
public class PlanoOperadora {
    public static void main(String[] args){
        String plano = "M";

        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if(plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsaApp e Instagram grátis");
        }else if (plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5GB Youtube");
        }
    }
}
*/

/*Modo Condicional Switch/case */

public class PlanoOperadora{
    public static void main(String[]args){
        String plano = "T";

        switch (plano){
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}




