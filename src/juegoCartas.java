import java.util.Scanner;
import java.util.Random;

public class juegoCartas {

    public static void main(String[] args) {
        String[][] Cartas = crearMatrizCartas();
        String[][] Baraja = inicializarCartas(Cartas);
        Boolean Condicion = true;
        int opcion = 0;
        do {
            opcion =  menu();
        } while (opcion == 0);

    }

    public static int escogerOpcion () {
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.close();
        return opcion;
    }

    public static void opciones() {
        System.out.println("Ingrese el número de la opcion que desee ejecutar");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    public static int menu() {
        opciones();
        int Op = escogerOpcion();
        return Op;
    }

    public static String[][] crearMatrizCartas() {
        String m[][] = new String[12][2];
        return m;
    }

    public static String[][] agregarCartas(String[][]m, String nombreCarta, String puntaje) {
        for (int i = 0; i <= 12; i++) {
            if (m[i][0] == null) {
                m[i][0] = nombreCarta;
                m[i][1] = puntaje;
            }
        }
        return m;
    }

    public static String[][] inicializarCartas(String[][]  m) {
        agregarCartas(m, "AsRombo", "11");
        agregarCartas(m, "DosTrebol", "2");
        agregarCartas(m, "TresDiamante", "3");
        agregarCartas(m, "CuatroPica", "4");
        agregarCartas(m, "CincoCorazones", "5");
        agregarCartas(m, "SeisTrebol", "6");
        agregarCartas(m, "SieteDiamante", "7");
        agregarCartas(m, "OchoPica", "8");
        agregarCartas(m, "NueveCorazones", "9");
        agregarCartas(m, "JotaTrebol", "10");
        agregarCartas(m, "CuinaCorazones", "10");
        agregarCartas(m, "QaiserPica", "10");
        return m;
    }

    public static int obtenerCartas(String m[][]) {
        int valor = 0;
        for (int i = 1; i < 3; i++) {
            Random random = new Random();
            int posicion = random.nextInt(12);
            valor = valor + Integer.parseInt(m[posicion][2]);
        }
        return valor;
    }

    public static String[][] jugar(String m[][]) {

    }




}
