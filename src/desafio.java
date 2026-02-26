import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        while (opcion != 4){
            String menu = """
                    1 - Cosultar saldo
                    2 - Retirar
                    3 - Depositar
                    4 - Salir
                    """;
            System.out.print(menu);
            System.out.print("Digitar el nuemro de opcion");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("El saldo actual es" + saldo);
                    break;
                case 2:
                    System.out.print("Digitar la cantidad a retirar");
                    int valor = scanner.nextInt();

                    if (valor <= saldo && valor > 0){
                        saldo = saldo - valor;
                        System.out.printf("Monto retirado " + valor);
                        System.out.printf("Saldo actual " + saldo);
                    } else if ( valor > saldo){
                        System.out.print("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.print("Digitar la cantidad a depositar");
                    int monto = scanner.nextInt();

                    if (monto > 0){
                        saldo = saldo + monto;
                        System.out.printf("Monto depocitado " + monto);
                        System.out.printf("Saldo actual " + saldo);
                    }
                    break;
                default:
                    System.out.print("Saliendo...");
            }
        }
    }
}
