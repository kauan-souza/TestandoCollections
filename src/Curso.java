import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    @Override
    public boolean equals(Object o) {
        Curso curso = (Curso) o;
        return this.nome.equals(curso.nome);
    }
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}

