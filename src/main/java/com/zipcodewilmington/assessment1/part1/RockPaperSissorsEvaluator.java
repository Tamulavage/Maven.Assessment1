package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String retVal ="";

        if("rock".equals(handSign))
        {
            retVal = "paper";
        }
        else if("paper".equals(handSign))
        {
            retVal = "scissor";
        }
        else
        {
            retVal = "rock";
        }

        return retVal;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String retVal ="";

        if("rock".equals(handSign))
        {
            retVal = "scissor";
        }
        else if("paper".equals(handSign))
        {
            retVal = "rock";
        }
        else
        {
            retVal = "paper";
        }

        return retVal;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String retVal = "";

        if(getWinningMove(handSignOfPlayer1) == getLosingMove(handSignOfPlayer2))
            retVal = handSignOfPlayer1;
        else
            retVal =handSignOfPlayer2;

        return retVal;
    }
}
