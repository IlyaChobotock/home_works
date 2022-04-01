package ru.geekbrains.ageev.hw1_2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWork1_2 {

    public static void main(String[] args) {

// К задаче 1

        int[] nums = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        reversArray(nums);

// К задаче 2

        int[] arr = new int[8];
        fillArray(arr);

// К задаче 3

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply2(array);

// К задаче 4

        int[][] table = new int[10][10];
        diagonalsTable(table);

// К задаче 5

        int[] array01 = { 811, -5, 34, 21, -11, 431, 5, 2, -4, 8, -931, 0};
        minAndMax(array01);

// К задаче 6

        int[] array02 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(array02));

    }

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

    /**
     * Метод, меняющий в массиве 0 на 1, а 1 на 0
     * @param arr Одномерный массив, состоящий из 0 и 1
     */
    public static void reversArray (int[] arr){
        System.out.println("Задача 1");
        System.out.println(Arrays.toString(arr) + " - исходный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        };
        System.out.println(Arrays.toString(arr) + " - реверсивный массив");
    };

/*
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;
 */

    /**
     * Метод, заполняющий значениями 0 3 6 9 12 15 18 21 массив (массив может быть размером более 8)
      * @param arr Одномерный массив
     */
    public static void fillArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println();
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr) + " - заполненный массив");
    }

/*
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;
 */

    /**
     * Метод, умножающий на 2 числа меньше 6 в одномерном массиве
      * @param arr Одномерный массив
     */
    public static void multiply2 (int[] arr){
        System.out.println();
        System.out.println("Задача 3");
        System.out.println(Arrays.toString(arr) + " - исходный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr) + " - массив, с умноженными на 2 числами меньше 6");
    }

/*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */

    /**
     * Метод, заполняющий единицами диагонали квадратного двумерного целочисленного массива.
     * Остальные элементы заполняет нулями
     * @param arr Квадратный двумерный целочисленный массив
     */
    public static void diagonalsTable (int[][] arr){
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    arr[i][j] = 1;
                }
                else if (i + j == arr.length - 1){
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

/*
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
помощи интернета);
 */

    /**
     * Метод, находящий минимальное и максимальное число в одномерном целочисленном массиве
     * @param arr Одномерный целочисленный массив
     */
    public static void minAndMax (int[] arr){
        System.out.println();
        System.out.println("Задача 5");
        int min = arr[0];
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            else if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве = " + min);
        System.out.println("Максимальное число в массиве = " + max);
    }

/*
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
 */

    /**
     * Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
     * массива равны
     * @param arr Одномерный целочисленный массив
     * @return
     */
    public static boolean checkBalance (int[] arr){
        System.out.println();
        System.out.println("Задача 6");
        int sumArr = 0;
        int halfSumArr;
        int sumFromStart = 0;
        int flag = 0;
        for (int value : arr){
            sumArr += value;
        }
        halfSumArr = sumArr / 2;
        System.out.println(sumArr + " сумма элементов массива");
        System.out.println(halfSumArr + " половина суммы элементов массива");

        for (int i = 0; i < arr.length; i++) {
            sumFromStart += arr[i];
            if (sumFromStart == halfSumArr){
                flag = 1;
                break;
            } else {
                flag = -1;
            }
        }
        if (flag == 1){
            return true;
        } else {
            return false;
        }
    }
}
