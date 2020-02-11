import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

    private int[][] targetArray = new int[5][3];
    private int numberOfColumns = targetArray.length;
    private int numberOfRows = targetArray[0].length;
    private int randomNumberCounter = new Random()
            .ints(3, 6)
            .findFirst()
            .getAsInt();

    public ArrayGenerator() {
        this.getArray();
    }

    private void getArray() {
        while (randomNumberCounter != 0) {
            int randomColumn = new Random().nextInt(numberOfColumns);
            int randomRow = new Random().nextInt(numberOfRows);
            if (targetArray[randomColumn][randomRow] == 0) {
                targetArray[randomColumn][randomRow] = 1;
                randomNumberCounter--;
            }
        }
    }

    public void printArray() {
        System.out.print(Arrays.deepToString(targetArray));
    }
}
