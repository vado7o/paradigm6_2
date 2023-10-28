import java.util.Random;

public class Randomizer {
    Random rnd = new Random();
    public int[] randomize(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(10);
        }
        return array;
    }
}
