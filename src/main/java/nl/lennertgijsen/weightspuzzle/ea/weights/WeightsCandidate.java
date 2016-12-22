package nl.lennertgijsen.weightspuzzle.ea.weights;

import nl.lennertgijsen.weightspuzzle.ea.EACandidate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightsCandidate implements EACandidate {
    private final int[] weights;
    private final int allowedWeights;

    public WeightsCandidate(final int numWeights, final int numAllowedWeights) {
        this.weights = new int[numWeights];
        this.allowedWeights = numAllowedWeights;
    }

    WeightsCandidate(final int[] weights, final int numAllowedWeights) {
        this.weights = weights;
        this.allowedWeights = numAllowedWeights;
    }

    public int fitness() {
        return calculateHighestNumber();
    }

    public void mutate(final float chance) {
        throw new UnsupportedOperationException();
    }

    private int calculateHighestNumber() {
        int i = 0;
        while (true) {
            if (canCombineWeightsTo(i + 1)) {
                i++;
                continue;
            }
            break;
        }
        return i;
    }

    private boolean canCombineWeightsTo(final int goal) {
        for (int numWeights = 1; numWeights < Math.min(weights.length, allowedWeights); numWeights++) {
            final int[][] permutations = getAllPermutations();
        }
        throw new UnsupportedOperationException();
    }

    int[][] getAllPermutations() {
        Set<List<Integer>> permutations = new HashSet<>();
        int[][] result = new int[permutations.size()][];
        int i = 0;
        for (List<Integer> permutation : permutations) {
            result[i] = permutation.stream().mapToInt(Integer::intValue).toArray();
            i++;
        }
        return result;
    }

    int[] getArrayMinus(final int[] array, final int pos) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < pos) {
                result[i] = array[i];
            } else if (i > pos) {
                result[i - 1] = array[i];
            }
        }
        return result;
    }
}
