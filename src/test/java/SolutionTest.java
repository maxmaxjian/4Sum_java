import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {

    private int[] input1;
    private int input2;
    private List<List<Integer>> expected;
    private Solution soln = new Solution1();

    public SolutionTest(int[] in1, int in2, List<List<Integer>> out) {
        input1 = in1;
        input2 = in2;
        expected = out;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,0,-1,0,-2,2}, 0, Arrays.asList(Arrays.asList(-2,0,0,2),
                        Arrays.asList(-2,-1,1,2), Arrays.asList(-1,0,0,1))}
        });
    }

    @Test
    public void testFourSum() {
        assertEquals(expected, soln.fourSum(input1, input2));
    }
}