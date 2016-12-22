package nl.lennertgijsen.weightspuzzle.ea;

public class EA<T> {
    private final int populationSize;

    public EA(final int populationSize) {
        this.populationSize = populationSize;
    }

    public void run(final int runs) {

    }

    public EAPopulation getSolution() {
        throw new UnsupportedOperationException();
    }
}
