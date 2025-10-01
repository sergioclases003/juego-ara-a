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
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡷⠚⠉⠉⠉⠁⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
""";

        // Variables para las estadísticas de la aventura
        int distanciaSubida = 0; //cm
        int distanciaBajada = 0; //cm
        int distanciaHorizontal = 0; //cm
        boolean encontroComida = false;
        String destinoFinal = "Desconocido";

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

        // Camino 1: Entrar al aula
        if(pregunta1 == 1) {
            System.out.println("\nHas elegido 1: Entrar al aula");
            distanciaHorizontal += 100; // avanza 1 metro

            System.out.println("\nDecisión 2: ¿Qué quieres hacer ahora?");
            System.out.println("1) Esconderse bajo la mesa");
            System.out.println("2) Caminar por la pizarra");
            System.out.println("3) Subirse al hombro de un estudiante");

            System.out.print("> ");
            int pregunta2 = sc.nextInt();
            if(pregunta2 == 1) {
                System.out.println("\nTe escondes bajo la mesa.");
                System.out.println("Final feliz: Encuentras migas de pan 🥖");
                // Actualizo stats
                distanciaHorizontal += 50;
                encontroComida = true;
                destinoFinal = "Debajo de una mesa";
            } else if(pregunta2 == 2) {
                System.out.println("\nCaminas por la pizarra.");
                System.out.println("Final trágico: Profesor te aplasta 💀");
                // Actualizo stats
                distanciaHorizontal += 200;
                destinoFinal = "La pizarra";
            } else if(pregunta2 == 3) {
                System.out.println("\nTe subes al hombro de un estudiante.");
                System.out.println("Final incierto: Estudiante te lanza por la ventana 🌬️");
                // Actualizo stats
                distanciaSubida += 150;
                distanciaBajada += 400; // La caída por la ventana
                destinoFinal = "El patio (después de un vuelo)";
            } else {
                System.out.println("\nOpción no válida. El miedo te paraliza y no te mueves.");
                destinoFinal = "Paralizada en medio del aula";
            }

            // Camino 2: Quedarse en la ventana
        } else if(pregunta1 == 2) {
            System.out.println("\nHas elegido 2: Quedarte en la ventana");

            System.out.println("\nDecisión 2: ¿Qué quieres hacer ahora?");
            System.out.println("1) Tejer telaraña en el marco");
            System.out.println("2) Saltar al patio");
            System.out.println("3) Esperar inmóvil");

            System.out.print("> ");
            int pregunta2 = sc.nextInt();
            if(pregunta2 == 1) {
                System.out.println("\nTejes una hermosa telaraña en el marco.");
                System.out.println("Final feliz: Cazas un insecto 🦟");
                // Actualizo stats
                encontroComida = true;
                destinoFinal = "El marco de la ventana";
            } else if(pregunta2 == 2) {
                System.out.println("\nSaltas con valentía hacia el patio.");
                System.out.println("Final trágico: Un pájaro te devora 🐦💀");
                // Actualizo stats
                distanciaBajada += 400;
                destinoFinal = "El estómago de un pájaro";
            } else if(pregunta2 == 3) {
                System.out.println("\nDecides esperar sin moverte.");
                System.out.println("Final trágico: La lluvia te arrastra 🌧️");
                // Actualizo stats
                distanciaBajada += 50; // La lluvia te arrastra
                destinoFinal = "Una alcantarilla cercana";
            } else {
                System.out.println("\nOpción no válida. El viento te empuja y caes al suelo sin consecuencias.");
                distanciaBajada += 10;
                destinoFinal = "El suelo, junto a la pared";
            }

            // Camino 3: Subir por la cortina
        } else if (pregunta1 == 3) {
            System.out.println("\nHas elegido 3: Subir por la cortina");
            distanciaSubida += 200; // Lo primero es subir

            System.out.println("\nDecisión 2: ¿Qué quieres hacer ahora?");
            System.out.println("1) Hacer nido en lo alto");
            System.out.println("2) Descender colgando de un hilo");
            System.out.println("3) Saltar a la lámpara");

            System.out.print("> ");
            int pregunta2 = sc.nextInt();
            if(pregunta2 == 1) {
                System.out.println("\nBuscas un lugar seguro y haces un nido en lo alto.");
                System.out.println("Final feliz: Vives tranquila en tu nido 🕸️");
                // Actualizo stats
                destinoFinal = "Un nido en lo alto de la cortina";
            } else if(pregunta2 == 2) {
                System.out.println("\nDesciendes lentamente colgando de tu hilo de seda.");
                System.out.println("Final trágico: Un estudiante te pisa 👟💀");
                // Actualizo stats
                distanciaBajada += 180;
                destinoFinal = "El suelo, bajo una zapatilla";
            } else if(pregunta2 == 3) {
                System.out.println("\nCon un gran salto, alcanzas la lámpara.");
                System.out.println("Final trágico: Te quemas con la bombilla 🔥");
                // Actualizo stats
                distanciaHorizontal += 50; // El salto a la lámpara
                destinoFinal = "La lámpara del techo";
            } else {
                System.out.println("\nOpción no válida. Te resbalas y vuelves al principio.");
                distanciaBajada += 200; // Cae todo lo que subió
                destinoFinal = "El suelo, de nuevo en el inicio";
            }

            // Opción no válida
        } else {
            System.out.println("\nOpción no válida.");
            destinoFinal = "Te quedas en el punto de salida por NO escoger ninguna de las 3 opciones";
        }

        // Resumen de stats finales
        System.out.println("\n--- Resumen de la aventura de " + nombre + " ---");
        System.out.println("Distancia subida: " + distanciaSubida + " cm.");
        System.out.println("Distancia bajada: " + distanciaBajada + " cm.");
        System.out.println("Distancia horizontal: " + distanciaHorizontal + " cm.");
        System.out.println("¿Encontró comida?: " + (encontroComida ? "Sí" : "No"));
        System.out.println("Destino final: " + destinoFinal);
        System.out.println("\n--- Fin de la aventura ---");

        sc.close();
    }
}