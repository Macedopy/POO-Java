import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso js");
        mentoria.setDescricao("Descricao js");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp do Java");
        bootcamp.getConteudos().add(curso1);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno Macedo");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " +devBruno.getConteudoInscritos());
        devBruno.progredir();
        System.out.println("Conteúdos inscritos " +devBruno.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos " +devBruno.getConteudosConcluidos());
        System.out.println(devBruno.calcularTotalXp() + "XP");
    
        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-");

        Dev devIsabelle = new Dev();
        devIsabelle.setNome("Isabelle");
        devIsabelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " +devIsabelle.getConteudoInscritos());
        devIsabelle.progredir();
        System.out.println("Conteúdos inscritos " +devIsabelle.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos " +devIsabelle.getConteudosConcluidos());
        System.out.println(devIsabelle.calcularTotalXp()+"XP");
    }
}
