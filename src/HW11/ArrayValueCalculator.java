package HW11;

import java.util.Arrays;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {

        if (array.length != 4 || Arrays.stream(array).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Масив повинен бути розміром 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // 4. Перетворення рядкових значень в int та підсумовування
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {

                    throw new ArrayDataException("Невірні дані в комірці [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
