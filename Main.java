import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Descrição Java", 8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria("Curso Java", "Descricao Java", LocalDate.now());
        System.out.println(mentoria);
    }
}
