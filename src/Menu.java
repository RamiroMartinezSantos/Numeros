import java.util.Scanner;

public class Menu {
    public void menu(){
        Numeros numeros = new Numeros();
        Letras letras = new Letras();
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            int nivel = 1;
            System.out.println("--MENU DE JUEGO--");
            System.out.println(" [1] Adivinar numeros");
            System.out.println(" [2] Adivinar letras");
            System.out.println(" [3] Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1 -> {
                    for (int i = 0; i < 4; i++) {
                        nivel = numeros.num(nivel);
                        if (nivel == 0) {
                            System.out.println("FIN DEL JUEGO");
                            break;
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; i < 4; i++) {
                        if (nivel <= 4) {
                            nivel = letras.let(nivel);
                        } else {
                            System.out.println("--FELICIDADES HAS ACOMPLETADO EL RETO");
                            break;
                        }
                    }
                }
                default -> {
                }
            }
        }while(op != 3);
    }
}
