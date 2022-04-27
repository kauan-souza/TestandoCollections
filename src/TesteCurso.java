import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TesteCurso {

    List<Aula> lista =  new ArrayList<>();
    Curso curso =  new Curso("curso java", lista);

    @Test
    public void deveValidarAExistenciaDeUmCurso(){
        Assert.assertEquals("curso java", curso.getNome());

        Assert.assertEquals(lista, curso.getAulas());
    }
    @Test
    public void deveValidarSeUmCursoEIgual(){
        Curso curso2 = new Curso("curso java" , lista);

        Assert.assertEquals(curso2 , curso);
    }
}
