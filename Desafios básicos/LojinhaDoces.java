/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 14/01/2023
*/
import java.util.Scanner;

public class LojinhaDoces {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int valor = leitor.nextInt();
            int quantidadeDoces;
            int docesPorReal = 2;

            quantidadeDoces = valor * docesPorReal;
            System.out.println("O cliente obteve " + quantidadeDoces + " doces");
        } catch (Exception e) {
            System.out.println("Erro ao executar o código!");
        }
    }
}