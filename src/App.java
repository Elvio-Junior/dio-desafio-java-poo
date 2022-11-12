import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JavaScript");
        cursoJs.setDescricao("Descrição do Curso JavaScript");
        cursoJs.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descrição da Mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Mentoria JavaScript");
        mentoriaJs.setDescricao("Descrição da Mentoria JavaScript");
        mentoriaJs.setData(LocalDate.now());

        Bootcamp bootCampJava = new Bootcamp();
        bootCampJava.setNome("BootCamp Java Developer");
        bootCampJava.setDescricao("BootCamp para Java");
        bootCampJava.getConteudos().add(cursoJava);
        bootCampJava.getConteudos().add(cursoJs);
        bootCampJava.getConteudos().add(mentoriaJava);
        bootCampJava.getConteudos().add(mentoriaJs);

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootCampJava);
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Joao:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joao:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Jose");
        dev2.inscreverBootcamp(bootCampJava);
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Jose:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jose:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jose:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
