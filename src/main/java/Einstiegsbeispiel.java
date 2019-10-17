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

        System.out.println("\nData of input array:");
        for (int i = 0; i < arrayWithRepetitions.length; i++) {
            System.out.print(arrayWithRepetitions[i] + " ");
        }

        HashMap<Integer, Integer> hashMapResult;
        hashMapResult = numberOfRepetitions(arrayWithRepetitions);
        System.out.println(hashMapResult);

    }

    public static HashMap numberOfRepetitions(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int counter = 1;
        int previous = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == previous) {
                counter++;
            } else {
                hm.put(previous, counter);
                counter = 1;
                previous = array[i];
            }
        }
        counter++;
        hm.put(previous, counter);


        return hm;

}


}