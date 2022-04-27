import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {

        Map<Integer, Aula> map = new HashMap();

        map.put(1234, new Aula(23));
        map.put(12, new Aula(3));

        System.out.println(map.containsKey(1234));
        System.out.println(map.keySet());

        List<Aula> lista = new ArrayList<>();
        lista.add(new Aula(10));
        lista.add(new Aula(5));
        lista.add(new Aula(20));

        lista.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(lista);

        Curso colecoes = new Curso("Dominando as coleções do Java");
        colecoes.adiciona(new Aula(2));

        List<Aula> aulasImutaveis = colecoes.getAulas();
        /**
         * excecao sendo lançado pq o getAula é apenas para leitura
         aulasImutaveis.add(new Aula(3));
         */
        Collection<Aula> aulas = new ArrayList<>(aulasImutaveis);
        aulas.add(new Aula(7));
        System.out.println(aulas);

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");
        alunos.add("Paulo");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }


}
