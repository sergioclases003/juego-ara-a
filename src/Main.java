import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el nombre de la araña



        String art = """
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⣠⣾⠙⢦⣀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠔⠂
⠀⠀⠀⠀⠀⠀⠀⢸⡿⣗⡲⠶⠖⠋⣡⣯⡀⠀⠈⠉⠓⠒⠲⢶⣶⡖⠋⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢀⡼⠁⡿⢯⠙⠛⠋⣹⡇⠙⠲⢤⣀⣀⡤⠖⢫⠏⠀⠀⠀⠀⠀
⠈⠙⠓⠶⢤⣴⣋⢀⣰⠃⠈⣿⡛⠉⣽⠙⠲⢤⡤⠞⢻⠀⢀⡏⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠈⢯⡙⢳⡲⢴⣇⣙⣄⣇⡤⠚⠉⡇⠀⢸⠀⢸⡇⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⣷⠀⣧⠀⣇⡼⢻⢿⡲⠤⣄⣧⠀⠸⡆⠈⣧⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢠⡇⣠⣿⡊⠙⢦⡞⠀⠳⣴⠋⠉⢉⡷⠿⠤⣌⣦⡀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣠⢾⣋⠁⠀⠙⢦⢸⡟⠉⠉⠙⣆⢠⠏⣠⠖⠋⠉⠉⠉⠓⠲⠤⡄
⠀⠀⣠⠖⠋⠁⠀⠈⠙⠦⡀⠈⣿⣠⠤⠴⠶⠾⢿⣠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⡏⠀⠀⢀⣀⣀⣀⣻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡷⠚⠉⠉⠁⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
""";

        int distanciaSubida = 0;
        int distanciaBajada = 0;
        boolean comida = false;
        boolean hizoamigos  = false;

        System.out.print("\nBienvenido a la aventura de la araña 🐜");
        System.out.print("\nDinos cómo se llama tu araña: ");
        String nombre = sc.nextLine();
        System.out.println(art);

        System.out.println("¡Hola, " + nombre + "! Hoy te despiertas en el aula de ASIR 1.");
        System.out.println("Frente a ti hay una ventana abierta y la puerta del aula.");
        System.out.println("");

        // Primera decisión
        System.out.println("Decisión 1: ¿Qué quieres hacer?");
        System.out.println("1) Entrar al aula");
        System.out.println("2) Quedarte en la ventana");
        System.out.println("3) Subir por la cortina");

        System.out.print("> ");
        int pregunta1 = sc.nextInt();

        // Mostrar elección
        if(pregunta1 == 1) {
            System.out.println("\nHas elegido 1: Entrar al aula");
            // decisión tipo 1.1
            System.out.println("\nDecisión 2: ¿Qué quieres hacer ahora?");
            System.out.println("1) Esconderse bajo la mesa");
            System.out.println("2) Caminar por la pizarra");
            System.out.println("3) Subirse al hombro de un estudiante");

            System.out.print("> ");
            int pregunta2 = sc.nextInt();
            if(pregunta2 == 1) {
                System.out.println("\nTe escondes bajo la mesa.");
                System.out.println("Final feliz: Encuentras migas de pan \uD83E\uDD56");
            } else if(pregunta2 == 2) {
                System.out.println("\nCaminas por la pizarra.");
                System.out.println("Final trágico: Profesor te aplasta \uD83D\uDC80");
            } else if(pregunta2 == 3) {
                System.out.println("\nTe subes al hombro de un estudiante.");
                System.out.println("Final imprevisto: Un estudiante te lanza por la ventana \uD83C\uDF2C\uFE0F");
            } else {
                System.out.println("\nOpción no válida, sigues explorando el aula.");
            }


        } else if(pregunta1 == 2) {
            System.out.println("\nHas elegido 2: Quedarte en la ventana");

        } else if (pregunta1 == 3) {
            System.out.println("\nHas elegido 3: Subir por la cortina");
        } else {
            System.out.println("\nOpción no válida, pero continuamos la aventura...");
        }


        sc.close();
    }
}
