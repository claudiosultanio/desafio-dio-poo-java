import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("desricao curso java");
        curso1.setCargaHoraria( 8 );

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("desricao curso js");
        curso2.setCargaHoraria ( 10 );


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mantoria java");
        mentoria.setDescricao("desricao mantoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSultanio = new Dev();
        devSultanio.setNome("Sultanio");
        devSultanio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sultanio:" + devSultanio.getConteudosInscritos());
        devSultanio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sultanio:" + devSultanio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sultanio:" + devSultanio.getConteudoConcluidos());
        System.out.println("XP:" + devSultanio.calcularTotalXp());
        System.out.println("-------");

        Dev devClaudio = new Dev();
        devClaudio.setNome("Claudio");
        devClaudio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Claudio:" + devClaudio.getConteudosInscritos());
        devClaudio.progredir();
        devClaudio.progredir();
        devClaudio.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Claudio:" + devClaudio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Claudio:" + devClaudio.getConteudoConcluidos());
        System.out.println("XP:" + devClaudio.calcularTotalXp());


    }
}