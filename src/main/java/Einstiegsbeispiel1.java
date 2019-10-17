import java.util.HashMap;

public class Einstiegsbeispiel1 {
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

        System.out.println("\nData of input array:");
        for (int i = 0; i < arrayWithRepetitions.length; i++) {
            System.out.print(arrayWithRepetitions[i] + " ");
        }

        System.out.println("\n\nResulting HashMap:");
        HashMap resultingHashMap = getRepetitions(arrayWithRepetitions);
        System.out.println(resultingHashMap);

        //todo delete
        /*System.out.println();
        int[] array = new int[1];
        array[0] = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/


    }

    public static HashMap getRepetitions(int[] array) {
        HashMap<Integer, Integer> hashMapNumberOfRepetitions = new HashMap<>();
        int previous; // = array[0];
        int counter;
        previous = array[0];
        counter = 0;
        int i = 0;
        do {
            i++;
            if (array[i] == previous) {
                counter++;
            }
        } while (true);


        //int = 0;

        // while (i < array.length) {
        //counter = 1;
            /*
            if(array[i] == previous) {
                counter++;
            } else {
                hashMapNumberOfRepetitions.put(previous, counter);
            }
            i++;
            */

            /*
            do {
                counter++;
                i++;
            } while (array[i] == previous);
            hashMapNumberOfRepetitions.put(previous, counter);*/
        //i++;
            /*
            if (array[i] == previous) {
                counter++;

            } else {
                hashMapNumberOfRepetitions.put(array[i - 1], counter);
                counter = 1;
                previous = array[i];
            }
            */


        //todo get rid of duplicate code (working, but not nice)
            /*if (i == array.length) {
                hashMapNumberOfRepetitions.put(array[i - 1], counter);
            } */
    }


}



