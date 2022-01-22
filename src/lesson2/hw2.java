package lesson2;

public class hw2 {
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //  в противном случае – false.
    public static boolean compareSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void checkNumbers(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkNumbersBool(int a) {
        return a < 0;
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз
    public static void printString(String string, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(string);
        }
    }

    //5.* Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leapYear(int year) {
        if (year % 400 == 0){
            return true;
        }
        else if (year % 100 == 0){
            return false;
        }
        else if (year % 4 == 0){
            return true;
        }
        else
            return false;
    }
}


