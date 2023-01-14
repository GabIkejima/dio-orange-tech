/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 14/01/2023
*/
import java.util.Scanner;

public class DesafioDownloadPacotes {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int tamanho = leitor.nextInt();

            for (int contador = 0; contador < tamanho; contador++) System.out.print("/");
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e){
            System.out.println("Erro ao executar o código!");
        }
    }
}