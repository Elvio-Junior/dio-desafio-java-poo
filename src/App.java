import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

    }
}
