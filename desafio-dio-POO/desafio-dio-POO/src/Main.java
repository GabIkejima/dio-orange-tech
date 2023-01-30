import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Orientação a objetos Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de APIS Flask Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria voltada para a mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Teste");
        bootcamp.setDescricao("Descrição bootcamp teste");
//        bootcamp.getConteudos().add(curso1);
//        bootcamp.getConteudos().add(curso2);
//        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("Conteúdos Inscritos:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("--------");
        Dev devGiovanna = new Dev();
        devGiovanna.setNome("Giovanna");
        devGiovanna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devGiovanna.getConteudosInscritos());

    }
}