import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EinstiegsbeispielTest {

    /* note: I tried to make a test that finds incorrect inputs, however
    it was not possible to compile anything not equal to an int[]-array; I tried char[],
    int, String, etc. And no integers out of the int[]-array are explicitly excluded in
    the specification of the assignment
    */

    @Test
    public void testAssertMustBeTrue1() {
        int[] testArray = new int[2];
        testArray[0] = 1;
        testArray[1] = 1;
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put(1, 2);
        Assertions.assertEquals(expectedHashMap, testHashMap);
    }

    @Test
    public void testAssertMustBeTrue2() {
        int[] testArray = new int[5];
        testArray[0] = 2;
        testArray[1] = 4;
        testArray[2] = 4;
        testArray[3] = 4;
        testArray[4] = 4;
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put(2, 1);
        expectedHashMap.put(4, 4);
        Assertions.assertEquals(expectedHashMap, testHashMap);
    }

    @Test
    public void testAssertMustBeTrue3() {
        int[] testArray = new int[2];
        testArray[0] = -1;
        testArray[1] = 4;
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put(-1, 1);
        expectedHashMap.put(4, 1);
        Assertions.assertNotEquals(expectedHashMap, testHashMap);
    }

    @Test
    public void testAssertMustBeTrue4() {
        int[] testArray = new int[0];
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        Assertions.assertEquals(expectedHashMap, testHashMap);
    }

    @Test
    public void testAssertMustBeFalse1() {
        int[] testArray = new int[2];
        testArray[0] = 1;
        testArray[1] = 1;
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put(1, 1);
        expectedHashMap.put(2, 1);
        Assertions.assertNotEquals(expectedHashMap, testHashMap);
    }

    @Test
    public void testAssertMustBeFalse2() {
        int[] testArray = new int[5];
        testArray[0] = 2;
        testArray[1] = 4;
        testArray[2] = 4;
        testArray[3] = 4;
        testArray[4] = 4;
        HashMap testHashMap = Einstiegsbeispiel.getRepetitions(testArray);
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put(2, 5);
        Assertions.assertNotEquals(expectedHashMap, testHashMap);
    }

}
