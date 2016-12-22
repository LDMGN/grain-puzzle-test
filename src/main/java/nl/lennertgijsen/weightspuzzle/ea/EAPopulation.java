package nl.lennertgijsen.weightspuzzle.ea;

import java.util.List;

public class EAPopulation<T extends EACandidate> {
    private List<T> candidates;

    public EAPopulation(final List<T> candidates) {
        this.candidates = candidates;
    }

    public List<T> getCandidates() {
        return candidates;
    }
}
