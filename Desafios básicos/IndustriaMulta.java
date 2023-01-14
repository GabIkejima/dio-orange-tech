/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 14/01/2023
*/
import java.util.Scanner;

public class IndustriaMulta{
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int velocidadeAtual = leitor.nextInt();

            if (velocidadeAtual > 60) System.out.println("Foi multado");
            else System.out.println("Nao foi multado");

        } catch (Exception e) {
            System.out.println("Erro ao executar o código!");
        }
    }
}