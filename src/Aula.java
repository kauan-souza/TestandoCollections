public class Aula {

    private int tempo;

    public Aula(int tempo) {
        this.tempo = tempo;
    }
    public int getTempo() {
        return this.tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "tempo=" + tempo +
                '}';
    }
}
