/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 16/01/2023
*/

import java.util.Scanner;
public class SalvandoMúsicas {
    public static void main(String[] args) {
        try{
            Scanner leitor = new Scanner(System.in);
            String arquivoDoPc = leitor.next();

            System.out.println(arquivoDoPc.endsWith(".mp3") ? "Salvar" : "Deletar");
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e){
            System.out.println("Erro ao executar o código!");
        }
    }
}