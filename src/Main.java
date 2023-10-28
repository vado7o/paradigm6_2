import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Randomizer rnd = new Randomizer();
        int n = 5;
        int[] array = rnd.randomize(n);

        System.out.println("Задан массив: ");
        System.out.println(Arrays.toString(array));

        Merge merge = new Merge();

        System.out.println("Отсортированный массив: ");
        merge.sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}