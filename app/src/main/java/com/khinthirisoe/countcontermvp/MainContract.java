package com.khinthirisoe.countcontermvp;

/**
 * Created by khinthirisoe on 7/26/17.
 */

public class MainContract {

    interface View {

        void displayTeamA(int score);

        void displayTeamB(int score);
    }

    interface ClickListener {

        void clickThreePointsForA();

        void clickTwoPointsForA();

        void clickOnePointsForA();

        void clickThreePointsForB();

        void clickTwoPointsForB();

        void clickOnePointsForB();

        void clickRest();

    }

}
