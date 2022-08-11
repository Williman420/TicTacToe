package tictactoe;

interface winLoseDraw {
    public void winSout(boolean winLose, boolean botWinLose);

}

class win implements winLoseDraw {
    logic logicObj = new logic();

    public void winSout(boolean winLose, boolean botWinLose) {
        if (winLose == true) {
            System.out.println("congrats you win");
        } else if (botWinLose == true) {
            System.out.println("you lose bot win noob");
        }
    }

    public void checkDraw(boolean drawStop) {
        if (drawStop) {
            System.out.println("draw men");
        }
    }
}