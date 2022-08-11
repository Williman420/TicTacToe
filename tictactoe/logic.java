package tictactoe;

import java.util.ArrayList;
import java.util.Random;

public class logic {
    public boolean win;
    public boolean BotWin;
    public boolean draw;

    ArrayList<Integer> userMoves = new ArrayList<Integer>();
    ArrayList<Integer> botMoves = new ArrayList<Integer>();
    ArrayList<Integer> moveChecks = new ArrayList<Integer>();
    // board
    char row1 = ' ';
    char row2 = ' ';
    char row3 = ' ';
    char row21 = ' ';
    char row22 = ' ';
    char row23 = ' ';
    char row31 = ' ';
    char row32 = ' ';
    char row33 = ' ';

    public void Spawnboard() {
        System.out.println("|" + this.row1 + "|" + this.row2 + "|" + this.row3 + "|");
        System.out.println("|" + this.row21 + "|" + this.row22 + "|" + this.row23 + "|");
        System.out.println("|" + this.row31 + "|" + this.row32 + "|" + this.row33 + "|");
    }

    public void setUserMove(int move) {
        switch (move) {
            case 1: {
                this.row1 = 'x';
            }
                break;
            case 2: {
                this.row2 = 'x';
            }
                break;
            case 3: {
                this.row3 = 'x';
            }
                break;
            case 4: {
                this.row21 = 'x';
            }
                break;
            case 5: {
                this.row22 = 'x';
            }
                break;
            case 6: {
                this.row23 = 'x';
            }
                break;
            case 7: {
                this.row31 = 'x';
            }
                break;
            case 8: {
                this.row32 = 'x';
            }
                break;
            case 9: {
                this.row33 = 'x';
            }
                break;
        }

    }

    public void setBotMove(int BotMove) {
        switch (BotMove) {
            case 1: {
                this.row1 = 'o';
            }
                break;
            case 2: {
                this.row2 = 'o';
            }
                break;
            case 3: {
                this.row3 = 'o';
            }
                break;
            case 4: {
                this.row21 = 'o';
            }
                break;
            case 5: {
                this.row22 = 'o';
            }
                break;
            case 6: {
                this.row23 = 'o';
            }
                break;
            case 7: {
                this.row31 = 'o';
            }
                break;
            case 8: {
                this.row32 = 'o';
            }
                break;
            case 9: {
                this.row33 = 'o';
            }
                break;

        }
    }

    public int getRandomNumber() {
        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(9) + 1;
        return randomNum;
    }

    public boolean checkPlayerWinCond() {

        if (userMoves.contains(1) && userMoves.contains(2) && userMoves.contains(3) ||
                userMoves.contains(4) && userMoves.contains(5) && userMoves.contains(6) ||
                userMoves.contains(7) && userMoves.contains(8) && userMoves.contains(9) ||
                userMoves.contains(1) && userMoves.contains(4) && userMoves.contains(7) ||
                userMoves.contains(2) && userMoves.contains(5) && userMoves.contains(8) ||
                userMoves.contains(3) && userMoves.contains(6) && userMoves.contains(9) ||
                userMoves.contains(1) && userMoves.contains(5) && userMoves.contains(9) ||
                userMoves.contains(3) && userMoves.contains(5) && userMoves.contains(7)) {
            win = true;

        }
        return win;
    }

    public boolean checkBotWinCond() {
        if (botMoves.contains(1) && botMoves.contains(2) && botMoves.contains(3) ||
                botMoves.contains(4) && botMoves.contains(5) && botMoves.contains(6) ||
                botMoves.contains(7) && botMoves.contains(8) && botMoves.contains(9) ||
                botMoves.contains(1) && botMoves.contains(4) && botMoves.contains(7) ||
                botMoves.contains(2) && botMoves.contains(5) && botMoves.contains(8) ||
                botMoves.contains(3) && botMoves.contains(6) && botMoves.contains(9) ||
                botMoves.contains(1) && botMoves.contains(5) && botMoves.contains(9) ||
                botMoves.contains(3) && botMoves.contains(5) && botMoves.contains(7)) {
            BotWin = true;
        }
        return BotWin;
    }

    public boolean checkIsDraw() {
        if (botMoves.size() + userMoves.size() == 9) {
            draw = true;
        }
        return draw;
    }

    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
}