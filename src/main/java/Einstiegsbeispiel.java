import java.util.HashMap;

public class Einstiegsbeispiel {
    public static void main(String[] args) {
        int[] arrayWithRepetitions = new int[11];
        arrayWithRepetitions[0] = 1;
        arrayWithRepetitions[1] = 1;
        arrayWithRepetitions[2] = 1;
        arrayWithRepetitions[3] = 2;
        arrayWithRepetitions[4] = 2;
        arrayWithRepetitions[5] = 2;
        arrayWithRepetitions[6] = 2;
        arrayWithRepetitions[7] = 3;
        arrayWithRepetitions[8] = 4;
        arrayWithRepetitions[9] = 4;
        arrayWithRepetitions[10] = 4;

        System.out.println("Data of input array:");
        for (int i = 0; i < arrayWithRepetitions.length; i++) {
            System.out.print(arrayWithRepetitions[i] + " ");
        }

        System.out.println("\n\nResulting HashMap:");
        HashMap resultingHashMap = new HashMap();
        resultingHashMap = getRepetitions(arrayWithRepetitions);
        System.out.println(resultingHashMap);
    }

    public static HashMap getRepetitions(int[] incomingArray) {
        HashMap<Integer, Integer> hashMapOfNumberOfRepetitions = new HashMap();
        int integerToCompare = incomingArray[0];
        int repetitionCounter = 1;
        int i = 1;
        while (i < incomingArray.length) {
            if (incomingArray[i] == integerToCompare) {
                repetitionCounter++;

            } else {
                hashMapOfNumberOfRepetitions.put(incomingArray[i - 1], repetitionCounter);
                repetitionCounter = 1;
                integerToCompare = incomingArray[i];
            }

            i++;
            if (i == incomingArray.length) {
                hashMapOfNumberOfRepetitions.put(incomingArray[i - 1], repetitionCounter);
            }
        }
        return hashMapOfNumberOfRepetitions;
    }


}
