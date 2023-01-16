/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 16/01/2023
*/

import java.util.Scanner;
public class PontosCarteira {
    public static void main(String[] args) {
        try{
            Scanner leitor = new Scanner(System.in);
            int velocidade = leitor.nextInt();
            int multas = leitor.nextInt();

            //Verifica se o motorista irá receber uma multa
            if(velocidade > 80) multas++;

            //Verifica se o motorista irá receber pontos na carteira
            if(multas >= 3){
                System.out.println(multas + " multas. Levou pontos na carteira");
            }else {
                System.out.println(multas + " multas. Nao levou pontos na carteira");
            }
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e){
            System.out.println("Erro ao executar o código!");
        }
    }
}
