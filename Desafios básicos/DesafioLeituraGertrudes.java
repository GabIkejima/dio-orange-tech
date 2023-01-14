/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 14/01/2023
*/
import java.util.Scanner;

public class DesafioLeituraGertrudes {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int paginas = leitor.nextInt();
            int paginasLidas = 3;
            int tempoLeitura;

            tempoLeitura = paginas / paginasLidas;
            if (tempoLeitura == 1) System.out.println(tempoLeitura + " dia");
            else System.out.println(tempoLeitura + " dias");
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e){
            System.out.println("Erro ao executar o código!");
        }
    }
}