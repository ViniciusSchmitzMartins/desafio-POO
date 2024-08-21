import dio.desafio.*;

import java.lang.module.Configuration;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(8);
//
//        System.out.println(curso1);
//        System.out.println(curso2);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());
//
//        System.out.println(mentoria1);


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("bootcamp java developer");
        bootcamp1.setDescricao("descricao bootcamp java developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos por Vinicius " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos por Vinicius " + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos por Vinicius " + devVinicius.getConteudosConcluidos());
        System.out.println("Xp:" + devVinicius.calcularTotalXp());
        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos por João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos por João " + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos por João " + devVinicius.getConteudosConcluidos());
        System.out.println("Xp:" + devJoao.calcularTotalXp());


    }
}