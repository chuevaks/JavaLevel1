package lesson3;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {

        taskNumber(1);
        arrayReplace(10);
        taskNumber(2);
        fillArray();
        taskNumber(3);
        multiplyArray();
        taskNumber(4);
        diagonalArray(9);
        taskNumber(5);
        printArray(initialLenArray(6, 10));
        taskNumber(6);
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        minMaxArray(array);
    }

    //Home work 3


// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;


    public static void arrayReplace(int count) {
        Random random = new Random();
        int[] initialArrayOfInt = new int[count];

        for (int i = 0; i < initialArrayOfInt.length; i++) {
            initialArrayOfInt[i] = random.nextInt(2);
        }
        printArray(initialArrayOfInt);

        int[] replacedArray = new int[initialArrayOfInt.length];
        for (int i = 0; i < replacedArray.length; i++) {
            replacedArray[i] = 1 - initialArrayOfInt[i];
        }
        printArray(replacedArray);
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void fillArray() {
        int[] arrayInt = new int[100];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        printArray(arrayInt);
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве;

    public static void multiplyArray() {
        int[] arrayInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 6) {
                arrayInt[i] = arrayInt[i] * 2;
            }
        }
        printArray(arrayInt);
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonalArray(int size) {
        int[][] myArr = new int[size][size];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i][i] = 1;
            myArr[i][myArr.length - 1 - i] = 1;
            printArray(myArr[i]);
        }
    }

    //* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] initialLenArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;

    public static void minMaxArray(int[] array) {

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        printArray(array);
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void taskNumber(int counter) {
        System.out.println("**********");
        System.out.println("Задание " + +counter + ".");
        System.out.println("**********");
    }
}


