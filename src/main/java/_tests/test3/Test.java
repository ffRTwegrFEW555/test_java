package _tests.test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static char[][] chars;
    private static int x = 0;
    private static int o = 0;
    private static int winI = 0;
    private static int winJ = 0;
    private static int nextI = 0;
    private static int nextJ = 0;
    private static boolean next = true;
    private static boolean winner = false;

    public static void main(String[] args) throws IOException {

        /*
            Проверить, нельзя ли завершить игру победой.
            Проверить, не может ли враг на следующем ходе завершить игру победой.
            Проверить, можно ли создать противнику безвыходную ситуацию
            Если нельзя, то походить просто на одну из выгодных позиций.
            Если и это невозможно, походить на первую попавшуюся клетку.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        chars = new char[][]{   bufferedReader.readLine().toCharArray(),
                                bufferedReader.readLine().toCharArray(),
                                bufferedReader.readLine().toCharArray()};

        fillValues();

        while (true) {

            // Проверить, нельзя ли завершить игру победой.
            if (checkPossibleWin()) {
                winner = true;
            } else

                // Проверить, не может ли враг на следующем ходе завершить игру победой.
                // Проверить, можно ли создать противнику безвыходную ситуацию
                if (checkPossibleEnemyWin()) {
                    chars[winI][winJ] = next ? 'X' : 'O';
                    next = !next;
                } else

                    // Если нельзя, то походить просто на одну из выгодных позиций.
                    if (selectNextCell()) {
                        chars[nextI][nextJ] = next ? 'X' : 'O';
                        next = !next;
                    } else

                        // Если и это невозможно, походить на первую попавшуюся клетку.
                        if (randomMove()) {
                            chars[nextI][nextJ] = next ? 'X' : 'O';
                            next = !next;
                        } else {
                            break;
                        }

            if (winner || checkWin()) {
                winner = true;
                break;
            }
        }

        System.out.println(winner ? next ? "Crosses win" : "Ouths win" : "Draw");
    }

    private static void fillValues() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == 'X') {
                    x++;
                } else if (chars[i][j] == 'O') {
                    o++;
                }
            }
        }

        if (x <= o) {
            next = true;
        } else {
            next = false;
        }
    }

    private static boolean checkWin() {
        boolean reverse = false;

        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < chars.length; i++) {
                int countWinX = 0;
                int countWinO = 0;

                for (int j = 0; j < chars[i].length; j++) {
                    char tempChar = chars[reverse ? j : i][reverse ? i : j];

                    if (tempChar == 'X') {
                        countWinX++;
                    } else if (tempChar == 'O') {
                        countWinO++;
                    }

                    if (countWinX == 3 || countWinO == 3) {
                        return true;
                    }
                }
            }

            reverse = true;
        }

        char c1 = chars[0][0];
        char c2 = chars[1][1];
        char c3 = chars[2][2];
        char r1 = chars[0][2];
        char r2 = chars[1][1];
        char r3 = chars[2][0];

        if (c1 == c2 && c2 == c3) {
            if (c1 != '#') {
                return true;
            }
        }

        if (r1 == r2 && r2 == r3) {
            if (r1 != '#') {
                return true;
            }
        }

        return false;
    }

    private static boolean checkPossibleWin() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == '#') {
                    chars[i][j] = next ? 'X' : 'O';
                    if (checkWin()) {
                        winI = i;
                        winJ = j;
                        chars[i][j] = '#';
                        return true;
                    } else {
                        chars[i][j] = '#';
                    }
                }
            }
        }

        return false;
    }

    private static boolean checkPossibleEnemyWin() {
        next = !next;
        boolean result = checkPossibleWin();
        next = !next;
        return result;
    }

    private static boolean selectNextCell() {

        if (chars[0][0] == chars[0][1] &&
                chars[0][1] == chars[0][2] &&
                chars[0][2] == chars[1][2] &&
                chars[1][2] == chars[2][2] &&
                chars[2][2] == chars[2][1] &&
                chars[2][1] == chars[2][0] &&
                chars[2][0] == chars[1][0] &&
                chars[1][0] == '#') {
            nextI = 0;
            nextJ = 0;
            return true;

        } else if (
                chars[0][2] == chars[1][2] &&
                        chars[1][2] == chars[2][2] &&
                        chars[2][2] == chars[2][1] &&
                        chars[2][1] == chars[2][0] &&
                        chars[1][0] == '#') {
            nextI = 2;
            nextJ = 2;
            return true;

        } else if (
                chars[0][0] == chars[0][1] &&
                        chars[0][1] == chars[0][2] &&
                        chars[0][2] == chars[1][2] &&
                        chars[1][2] == chars[2][2] &&
                        chars[1][0] == '#') {
            nextI = 0;
            nextJ = 2;
            return true;

        } else if (
                chars[2][0] == chars[1][0] &&
                        chars[1][0] == chars[0][0] &&
                        chars[0][0] == chars[0][1] &&
                        chars[0][1] == chars[0][2] &&
                        chars[1][0] == '#') {
            nextI = 0;
            nextJ = 0;
            return true;

        } else if (
                chars[0][0] == chars[1][0] &&
                        chars[1][0] == chars[2][0] &&
                        chars[2][0] == chars[2][1] &&
                        chars[2][1] == chars[2][2] &&
                        chars[1][0] == '#') {
            nextI = 2;
            nextJ = 0;
            return true;

        } else if (chars[0][0] == '#') {
            nextI = 0;
            nextJ = 0;
            return true;

        } else if (chars[0][2] == '#') {
            nextI = 0;
            nextJ = 2;
            return true;

        } else if (chars[2][2] == '#') {
            nextI = 2;
            nextJ = 2;
            return true;

        } else if (chars[2][0] == '#') {
            nextI = 2;
            nextJ = 0;
            return true;
        }

        return false;
    }

    private static boolean randomMove() {

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == '#') {
                    nextI = i;
                    nextJ = j;
                    return true;
                }
            }
        }

        return false;
    }
}
