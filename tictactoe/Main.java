package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        logic logicObj = new logic();

        win winLoseObj = new win();
        boolean gameStart = true;
        logicObj.Spawnboard();
        int botMove;
        while (gameStart) {

            // user

            Scanner userInput = new Scanner(System.in);
            int userMove = userInput.nextInt();
            if (logicObj.userMoves.contains(userMove) || logicObj.botMoves.contains(userMove)) {
                if (logicObj.userMoves.size() + logicObj.botMoves.size() < 9) {
                    while (logicObj.userMoves.contains(userMove) || logicObj.botMoves.contains(userMove)) {
                        System.out.println("the move is already made try another tile");
                        userMove = userInput.nextInt();
                    }
                }

            }
            logicObj.setUserMove(userMove);
            logicObj.userMoves.add(userMove);
            logicObj.checkPlayerWinCond();
            logicObj.checkBotWinCond();

            if (logicObj.checkPlayerWinCond()) {
                gameStart = false;
            }

            // bot
            botMove = logicObj.getRandomNumber();

            if (logicObj.botMoves.contains(botMove) || logicObj.userMoves.contains(botMove)) {
                if (logicObj.userMoves.size() + logicObj.botMoves.size() < 9) {
                    while ((logicObj.botMoves.contains(botMove) || logicObj.userMoves.contains(botMove))) {
                        botMove = logicObj.getRandomNumber();
                    }
                } else {
                    System.out.println("draw");
                }
                logicObj.clearScreen();
            }
            logicObj.checkBotWinCond();

            logicObj.setBotMove(botMove);
            logicObj.botMoves.add(botMove);

            if (logicObj.checkPlayerWinCond()) {
                gameStart = false;
            } else if (logicObj.checkBotWinCond()) {
                gameStart = false;
            } else if (logicObj.checkIsDraw()) {
                gameStart = false;
            }

            System.out.println(botMove);

            logicObj.Spawnboard();
            logicObj.checkBotWinCond();
            winLoseObj.winSout(logicObj.win, logicObj.BotWin);

        }
    }
}