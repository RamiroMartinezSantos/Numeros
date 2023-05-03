import java.util.Random;
import java.util.Scanner;

public class Letras {
    public int let(int nivel){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char letra;
        char let;
        int segundoNivel = 0, opor = 0;

        for (int i=0;i<9;i++){
            int num = random.nextInt(26) + 97;
            letra = (char) num;
            System.out.println(letra);

            if(opor != 3){
                if(segundoNivel != 3) {
                    System.out.println("NIVEL :" + nivel);
                    System.out.println("En que letra estoy pensando?");
                    let = scanner.next().charAt(0);
                    if (letra == let) {
                        System.out.println("--FELICIDADES HAS ACERTADO---");
                        segundoNivel++;
                        System.out.println("--FALTAN " + (3-segundoNivel) + " PUNTOS PARA PASAR AL SEGUNDO NIVEL");
                        System.out.println("--TIENES " + (3 - opor) + " OPORTUNIDADES");
                    } else {
                        System.out.println("--LO SIENTO LA RESPUESTA NO ES CORRECTA---");
                        opor++;
                        System.out.println("--TIENES " + (3 - opor) + " OPORTUNIDADES");
                    }
                }else
                    break;
            }else{
                System.out.println("--USTED TIENE "+(0)+" OPORTUNIDADES--");
                System.out.println("--USTED A PERDIDO--");
                break;
            }
        }
        if(segundoNivel == 3){
            System.out.println("--PASAS AL SIGUIENTE NIVEL--");
            nivel+=1;
        }
        if(opor == 3){
            nivel = 0;
        }
        return nivel;
    }
}
