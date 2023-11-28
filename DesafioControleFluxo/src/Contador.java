import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Dois numeros Inteiros ");
        System.out.print("Numero 1: ");
        int parametroUm = sc.nextInt();
        System.out.print("Numero 2: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    // Métodos -------------------------------------------------------------------------------------------

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois)
        throw new ParametrosInvalidosException ("Ops! algo de errado: O primeiro numero deve ser Menor que o Segundo numero , Tente Novamente.");
        else {

            int contagem = parametroDois - parametroUm;
            System.out.println("as Ocorrencias são: ");
            for (int i = 1; i <= contagem; i++) {
                System.out.print(i + " " );
            }
        }
    }
}      
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

