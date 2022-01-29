package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static char[][] field;
    public static int fieldSize;
    public static int cellsToWin;
    public static char player = 'X';
    public static char pc = 'O';
    public static char empty = '_';


    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        readGameDifficulty();
        createNewField();
        drawField();

        while (true) {
            requestPlayerTurn();
            drawField();

            if (checkWin(player)) {
                System.out.println("You won!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw!");
                break;
            }
            System.out.println();
            requestPcTurn();
            drawField();

            if (checkWin(pc)) {
                System.out.println("PC won!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
    }

    private static boolean checkDraw() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (checkEmptyCell(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void createNewField() {
        field = new char[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = empty;
            }
        }
    }

    public static void readGameDifficulty() {
        do {
            System.out.println("***********************************************************************");
            System.out.println("Select the game difficulty. Easy: 3. Normal: 4. Hard: 5. Nightmare: >5.");
            System.out.println("> ");
            fieldSize = scanner.nextInt();
        } while (fieldSize < 3);
        if (fieldSize >= 4) {
            cellsToWin = 4;
        } else cellsToWin = 3;
    }

    public static void drawField() {
        System.out.println("****** FIELD *****");
        for (int i = 0; i < fieldSize; i++) {
            for (int k = 0; k < fieldSize; k++) {
                System.out.print(field[i][k] + " | ");
            }
            System.out.println();
        }
        System.out.println("****************");
    }


    public static void requestPlayerTurn() {
        int x;
        int y;
        do {
            System.out.println("Enter your coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!checkValidCell(x, y) || !checkEmptyCell(x, y));
        field[y][x] = player;
    }

    public static void requestPcTurn() {
        if (checkWinPCCell()) {
            return;
        }
        if (checkWinPlayerCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(fieldSize);
            y = random.nextInt(fieldSize);
        } while (!checkEmptyCell(x, y));
        field[x][y] = pc;

    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (checkSequence(i, j, c, 1, 1)) {
                    return true;
                }
                if (checkSequence(i, j, c, 1, -1)) {
                    return true;
                }
                if (checkSequence(i, j, c, 0, 1)) {
                    return true;
                }
                if (checkSequence(i, j, c, 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkSequence(int i, int j, char c, int stepi, int stepj) {
        int finali = i + (cellsToWin - 1) * stepi;
        int finalj = j + (cellsToWin - 1) * stepj;
        if (!checkValidCell(finali, finalj)) {
            return false;
        }
        for (int k = 0; k < cellsToWin; k++) {
            if (field[i + k * stepi][j + k * stepj] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkValidCell(int i, int j) {
        return i < fieldSize && j < fieldSize && i >= 0 && j >= 0;
    }

    public static boolean checkEmptyCell(int i, int j) {
        return field[i][j] == empty;
    }

    public static boolean checkWinPCCell() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (checkEmptyCell(i, j)) {
                    field[i][j] = pc;
                    if (checkWin(pc))
                        return true;
                    else {
                        field[i][j] = empty;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkWinPlayerCell() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (checkEmptyCell(i, j)) {
                    field[i][j] = player;
                    if (checkWin(player)) {
                        field[i][j] = pc;
                        return true;
                    } else field[i][j] = empty;
                }
            }
        }
        return false;
    }


}
