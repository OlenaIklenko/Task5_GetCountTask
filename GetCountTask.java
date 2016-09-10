/**
 * Created by Леночка on 10.09.2016.
 */
import java.util.Arrays;
public class GetCountTask {
    public static void main(String[] args) {
// Есть ли такой элемент в массиве

        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int value = 9;
        boolean isValue = false;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                isValue = true;
            }
        }


        if (isValue) {
            System.out.println("Есть число!");

            int count = getCount(array, value);
            if (count == 1) {
                System.out.println("Число присутствует один раз");
            }
            else {
                System.out.println("Число присутствует " + count + " раз(a)!");
            }
            int []arrayOfIndex = new int [count];


            int countOfIndex = 0;
            for (int i = 0; i < array.length; i++){
                if (value == array[i]){
                    arrayOfIndex [countOfIndex] = i;
                    countOfIndex++;
                }
            }
            System.out.println(Arrays.toString(arrayOfIndex));

        } else {
            System.out.println("Нет числа!");
        }

    }

    public static int getCount(int[] array, int value) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                count++;

            }
        }
        return count;
    }
}

