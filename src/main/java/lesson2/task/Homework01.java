//Реализуйте алгоритм сортировки пузырьком числового массива,
//результат после каждой итерации запишите в лог-файл.
//(через FileWriter)

package lesson2.task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Homework01 {
    public static void bubbleSort(int[] array) throws IOException {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    try (FileWriter fileWriter = new FileWriter("Homework.txt")) {
                        fileWriter.write(Arrays.toString(array));
                    }
                }

            }

        }

    }

}
