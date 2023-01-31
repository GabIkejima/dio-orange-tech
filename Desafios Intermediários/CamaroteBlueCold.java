/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 31/01/2023
*/

import java.util.Scanner;

public class CamaroteBlueCold {
        public static void main(String[] args) {
            try {

                Scanner leitor = new Scanner(System.in);
                int tamanhoDaFila = leitor.nextInt();
                int pessoasNoCamarote = 0;


                if (tamanhoDaFila % 2== 0){
                    pessoasNoCamarote = tamanhoDaFila / 2;
                }else {
                    pessoasNoCamarote = tamanhoDaFila / 2 + 1;
                }
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
            }
            //Caso haja algum erro durante a execução do código:
            catch (Exception e) {
                System.out.println("Erro ao executar o código!");
            }
        }
    }


