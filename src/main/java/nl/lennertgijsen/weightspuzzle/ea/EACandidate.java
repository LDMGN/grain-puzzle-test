package nl.lennertgijsen.weightspuzzle.ea;

public interface EACandidate {
    int fitness();
    void mutate(float chance);
}
