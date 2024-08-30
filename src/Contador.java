import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidos {
        Scanner terminal = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try{
                contar(parametroUm, parametroDois);
            } catch(Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar um número inteiro.");
            }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidos{
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidos("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;

        for(int x = 1; x <= contagem; x++){
            System.out.println("Imprimindo o número " + x);
        }
    }
}
