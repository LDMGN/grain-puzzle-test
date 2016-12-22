package nl.lennertgijsen.weightspuzzle.ea.weights;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WeightsCandidateTest {
    @Test
    public void testGetAllPermutations() {
        final WeightsCandidate candidate = new WeightsCandidate(new int[]{1, 2}, 3);
        final int[][] result = new int[3][];
        result[0] = new int[]{1};
        result[1] = new int[]{2};
        result[2] = new int[]{1, 2};
        assertArrayEquals(candidate.getAllPermutations(), result);
    }

    @Test
    public void testGetArrayMinus() {
        final WeightsCandidate candidate = new WeightsCandidate(0, 0);
        assertArrayEquals(candidate.getArrayMinus(new int[]{1, 2, 3, 4, 5}, 4), new int[]{1, 2, 3, 4});
        assertArrayEquals(candidate.getArrayMinus(new int[]{1, 2, 3, 4, 5}, 2), new int[]{1, 2, 4, 5});
        assertArrayEquals(candidate.getArrayMinus(new int[]{1, 2, 3, 4, 5}, 0), new int[]{2, 3, 4, 5});
    }
}
