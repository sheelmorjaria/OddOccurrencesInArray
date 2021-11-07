import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void testSolution() {
        assertEquals(5, (new Solution()).solution(new int[]{ 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 }));
        assertEquals(5, (new Solution()).solution(new int[]{ 1, 2, 1, 3, 5, 2, 3 }));
        assertEquals(5000000, (new Solution()).solution(new int[]{ 1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000 }));
    }
}

