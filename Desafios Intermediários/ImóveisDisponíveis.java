/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 31/01/2023
*/
import java.util.Scanner;
public class ImóveisDisponíveis {
        public static void main(String[] args) {
            try {
                Scanner leitor = new Scanner(System.in);
                String frase = leitor.next();
                String fraseDividida[] = frase.split("/"); //Divide o input em 3 partes
                                                                // [Casa/1900/Disponivel] >>> [Casa][1900][Disponivel]
                frase(fraseDividida);
            }
            //Caso haja algum erro durante a execução do código:
            catch(Exception e) {
                System.out.println("Erro ao executar o código!");
            }
        }
        //Função para printar a frase na formatação correta
        public static void frase(String[] fraseDividida){
            System.out.print("Imovel: " + fraseDividida[0]);
            System.out.print(" R$" + fraseDividida[1]);
            System.out.println(" " + fraseDividida[2]);
        }
    }

