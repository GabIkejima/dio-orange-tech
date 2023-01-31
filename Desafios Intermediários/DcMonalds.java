/*
@autor Gabriel Higa Ikejima
@version 1.0
@since 31/01/2023
*/
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class DcMonalds {
        public static void main(String[] args) {
            try{
                Scanner leitor = new Scanner(System.in);
                String ingredientes = leitor.next();
                String listaIngredientes[] = ingredientes.split(";");//Divide o input em 4 partes
                frase(listaIngredientes);
        }
        //Caso haja algum erro durante a execução do código:
        catch(Exception e) {
        System.out.println("Erro ao executar o código!");
    }
}
    //Função para printar a frase na formatação correta
    public static void frase(String[] listaIngredientes){
        for(int i=0; i<listaIngredientes.length; i++){
            System.out.println(listaIngredientes[i]);
        }
    }

}
