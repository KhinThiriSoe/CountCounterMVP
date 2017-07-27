package com.khinthirisoe.countcontermvp;

/**
 * Created by khinthirisoe on 7/26/17.
 */

public class MainPresenter implements MainContract.ClickListener {

    MainContract.View view;

    int teamA = 0;
    int teamB = 0;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void clickThreePointsForA() {
        teamA = teamA + 3;
        view.displayTeamA(teamA);
    }

    @Override
    public void clickTwoPointsForA() {
        teamA = teamA + 2;
        view.displayTeamA(teamA);
    }

    @Override
    public void clickOnePointsForA() {
        teamA = teamA + 1;
        view.displayTeamA(teamA);

    }

    @Override
    public void clickThreePointsForB() {
        teamB = teamB + 3;
        view.displayTeamB(teamB);

    }

    @Override
    public void clickTwoPointsForB() {
        teamB = teamB + 2;
        view.displayTeamB(teamB);

    }

    @Override
    public void clickOnePointsForB() {
        teamB = teamB + 1;
        view.displayTeamB(teamB);

    }

    @Override
    public void clickRest() {
        teamA = 0;
        teamB = 0;
        view.displayTeamA(teamA);
        view.displayTeamB(teamB);
    }
}
