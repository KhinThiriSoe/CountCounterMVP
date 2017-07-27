package com.khinthirisoe.countcontermvp;

import org.junit.Test;

/**
 * Created by khinthirisoe on 7/26/17.
 */
public class MainPresenterTest {

    int teamA = 0;
    int teamB = 0;
    @Test
    public void clickThreePointsForA() throws Exception {
        teamA = teamA + 3;
    }

    @Test
    public void clickTwoPointsForA() throws Exception {
        teamA = teamA + 3;
    }

    @Test
    public void clickOnePointsForA() throws Exception {
        teamA = teamA + 3;
    }

    @Test
    public void clickThreePointsForB() throws Exception {
        teamB = teamB + 3;
    }

    @Test
    public void clickTwoPointsForB() throws Exception {
        teamB = teamB + 2;
    }

    @Test
    public void clickOnePointsForB() throws Exception {
        teamB = teamB + 1;
    }

    @Test
    public void clickRest() throws Exception {
        teamA = 0;
        teamB = 0;
    }

}