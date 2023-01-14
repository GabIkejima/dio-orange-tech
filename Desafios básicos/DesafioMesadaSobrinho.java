/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 13/01/2023
*/

import java.util.Scanner;
public class DesafioMesadaSobrinho {
    public static void main(String[] args) {
        try{
            Scanner leitor = new Scanner(System.in);
            int quantidadeMeses = leitor.nextInt();
            int valorMesada = 50;
            int valorTotal = quantidadeMeses * valorMesada;

            System.out.println(valorTotal);
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e){
            System.out.println("Erro ao executar o código!");
        }
    }
}
