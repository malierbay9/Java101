package arrays.printing_letters;

public class Main {

    public static void aLetter() {
        String[][] letter = new String[6][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[0].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pLetter() {
        String[][] letter = new String[6][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[0].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || (i < 3 && j == 3)) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        aLetter();
        System.out.println("\n=============================\n");
        pLetter();
    }
}
