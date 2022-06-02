import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random jogada = new Random();
        if(((jogada.nextInt(6)+1)*2) == 7 || ((jogada.nextInt(6)+1)*2) ==11) {
            System.out.println("Você ganhou! vc é natural! seu numero foi: " + ((jogada.nextInt(6)+1)*2));
        }else if(((jogada.nextInt(6)+1)*2) == 2  || ((jogada.nextInt(6)+1)*2) == 3  || ((jogada.nextInt(6)+1)*2) == 12 ) {
            System.out.println("Você perdeu!vc é um craps! seu numero foi: " + ((jogada.nextInt(6)+1)*2));
        } else {
            System.out.println("seu ponto de marcação é" + ((jogada.nextInt(6)+1)*2));
            while (((jogada.nextInt(6)+1)*2) != 7){
                    if(((jogada.nextInt(6)+1)*2) == 7){
                        System.out.println("vc perdeu! Tirou o " + ((jogada.nextInt(6)+1)*2));
                        break;
                    }if (((jogada.nextInt(6)+1)*2) == ((jogada.nextInt(6)+1)*2)){
                        System.out.println("vc ganhou! Tirou outro " + ((jogada.nextInt(6)+1)*2));
                        break;
                    }else{
                        continue;
                    }
                }

            }

        }



    }
