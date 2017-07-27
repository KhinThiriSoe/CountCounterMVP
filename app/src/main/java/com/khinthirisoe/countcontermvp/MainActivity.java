package com.khinthirisoe.countcontermvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @BindView(R.id.team_a_score)
    TextView team_a_score;
    @BindView(R.id.team_b_score)
    TextView team_b_score;

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        presenter = new MainPresenter(this);

    }

    @OnClick(R.id.three_points_a)
    public void AddThreePointsForA(Button button) {
        presenter.clickThreePointsForA();
    }

    @OnClick(R.id.two_points_a)
    public void AddTwoPointsA(Button button) {
        presenter.clickTwoPointsForA();
    }

    @OnClick(R.id.one_point_a)
    public void AddOnePointA(Button button) {
        presenter.clickOnePointsForA();
    }

    @OnClick(R.id.three_points_b)
    public void AddThreePointsForB(Button button) {
        presenter.clickThreePointsForB();
    }

    @OnClick(R.id.two_points_b)
    public void AddTwoPointsB(Button button) {
        presenter.clickTwoPointsForB();
    }

    @OnClick(R.id.one_point_b)
    public void AddOnePointB(Button button) {
        presenter.clickOnePointsForB();
    }

    @OnClick(R.id.btn_reset)
    public void BtnReset(Button button) {
        presenter.clickRest();
    }

    @Override
    public void displayTeamA(int score) {
        team_a_score.setText(String.valueOf(score));
    }

    @Override
    public void displayTeamB(int score) {
        team_b_score.setText(String.valueOf(score));
    }
}
