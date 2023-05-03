import java.util.Scanner;

public class Numeros {
    public int num(int nivel){

        Scanner scanner = new Scanner(System.in);
        int sigienteNivel = 0, opor = 0;
        int num;
        int numero;

        for (int i=0;i<9;i++) {
            numero = (int) (Math.random() * 1000 + 1);
            System.out.println(numero);

            if (opor != 3) {
                if (sigienteNivel != 3) {
                    System.out.println("NIVEL :" + nivel);
                    System.out.println("En que numero estoy pensando?");
                    num = scanner.nextInt();
                    if (num == numero) {
                        System.out.println("--FELICIDADES HAS ACERTADO---");
                        sigienteNivel++;
                        System.out.println("--FALTAN " + (3-sigienteNivel) + " PUNTOS PARA PASAR AL SEGUNDO NIVEL");
                        System.out.println("--TIENES " + (3-opor) + " OPORTUNIDADES");

                    } else {
                        System.out.println("--LO SIENTO LA RESPUESTA NO ES CORRECTA---");
                        System.out.println("--TIENES " + (3-opor) + " OPORTUNIDADES");
                        opor++;
                    }
                } else
                    break;
            } else {
                System.out.println("--USTED TIENE " + (0) + " OPORTUNIDADES--");
                System.out.println("--USTED A PERDIDO--");
                break;
            }
        }
        if(sigienteNivel == 3){
            System.out.println("--PASAS AL SIGUIENTE NIVEL--");
            nivel++;
        }
        if(opor == 3){
            nivel = 0;
        }
        return nivel;
    }
}





