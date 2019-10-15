package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SameNumbersTest {

    static final int nbrTests = 20;
    private Random random = new Random();

    @Test
    void sameNumbers1() {
        Assertions.assertEquals(true,
                SameNumbers.sameNumbers(new int[]{}, new int[]{}),
                "SameNumbers.sameNumbers(new int[]{}, new int[]{})");
    }

    @Test
    void sameNumbers2() {
        for (int i = 0; i < nbrTests; i++) {
            int r = random.nextInt(20);
            Assertions.assertFalse(
                    SameNumbers.sameNumbers(new int[]{}, new int[]{r}),
                    "SameNumbers.sameNumbers(new int[]{}, new int[]{r})");
            Assertions.assertFalse(
                    SameNumbers.sameNumbers(new int[]{r}, new int[]{}),
                    "SameNumbers.sameNumbers(new int[]{r}, new int[]{})");
            Assertions.assertTrue(
                    SameNumbers.sameNumbers(new int[]{r}, new int[]{r}),
                    "SameNumbers.sameNumbers(new int[]{r}, new int[]{r})");
        }
    }

    @Test
    void sameNumbers3() {
        for (int i = 0; i < nbrTests; i++) {
            int r = random.nextInt(20);
            if (r != 1) {
                Assertions.assertFalse(
                        SameNumbers.sameNumbers(new int[]{1}, new int[]{r, 1}),
                        "SameNumbers.sameNumbers(new int[]{1}, new int[]{r, 1})");
                Assertions.assertFalse(
                        SameNumbers.sameNumbers(new int[]{r, 1}, new int[]{1}),
                        "SameNumbers.sameNumbers(new int[]{r, 1}, new " +
                                "int[]{1})");
            } else {
                Assertions.assertTrue(
                        SameNumbers.sameNumbers(new int[]{1}, new int[]{r, 1}),
                        "SameNumbers.sameNumbers(new int[]{1}, new int[]{r, 1})");
                Assertions.assertTrue(
                        SameNumbers.sameNumbers(new int[]{r, 1}, new int[]{1}),
                        "SameNumbers.sameNumbers(new int[]{r, 1}, new int[]{1})");
            }
        }
    }

    @Test
    void sameNumbers4() {
        Assertions.assertTrue(
                SameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 2, 1}),
                "SameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 2, 1})");
        Assertions.assertTrue(
                SameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 3, 2, 1}),
                "SameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 3, 2, 1})");
        Assertions.assertFalse(
                SameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 4, 2, 1}),
                "ameNumbers.sameNumbers(new int[]{1, 2, 3}, new int[]{3, 4, 2, 1})");
        Assertions.assertTrue(
                SameNumbers.sameNumbers(new int[]{1, 2}, new int[]{2, 1, 1}),
                "SameNumbers.sameNumbers(new int[]{1, 2}, new int[]{2, 1, 1})");
        Assertions.assertTrue(
                SameNumbers.sameNumbers(new int[]{1, 2, 2}, new int[]{2, 1, 1}),
                "SameNumbers.sameNumbers(new int[]{1, 2, 2}, new int[]{2, 1, 1})");
    }
}

