package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountDogsTest {

    @Test
    void countDogs1() {
        Assertions.assertEquals(0,CountDogs.countDogs(""));
        Assertions.assertEquals(0,CountDogs.countDogs("a"));
        Assertions.assertEquals(0,CountDogs.countDogs("do"));
        Assertions.assertEquals(0,CountDogs.countDogs(" "));
        Assertions.assertEquals(0,CountDogs.countDogs("    "));
    }

    @Test
    void countDogs2() {
        Assertions.assertEquals(1,CountDogs.countDogs("dog"));
        Assertions.assertEquals(1,CountDogs.countDogs("  dug  "));
        Assertions.assertEquals(1,CountDogs.countDogs(" dag "));
        Assertions.assertEquals(1,CountDogs.countDogs(" dig"));
        Assertions.assertEquals(1,CountDogs.countDogs("deg "));
    }

    @Test
    void countDogs3() {
        Assertions.assertEquals(0, CountDogs.countDogs("dgg"));
        Assertions.assertEquals(0, CountDogs.countDogs("dod"));
        Assertions.assertEquals(0, CountDogs.countDogs("dacdoc"));
    }

    @Test
    void countDogs4() {
        Assertions.assertEquals(5, CountDogs.countDogs("dagdegdigdugdog"));
        Assertions.assertEquals(1, CountDogs.countDogs("abc.dog"));
        Assertions.assertEquals(1, CountDogs.countDogs("dadagag"));
        Assertions.assertEquals(1, CountDogs.countDogs("dogdo"));
    }

}

