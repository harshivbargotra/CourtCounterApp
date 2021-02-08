package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    public void inc3A(View view)
    {
        ScoreTeamA=ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);
    }
    public void inc3B(View view)
    {
        ScoreTeamB=ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }

    public void inc2A(View view)
    {
        ScoreTeamA=ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }
    public void inc2B(View view)
    {
        ScoreTeamB=ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }

    public void freeA(View view)
    {
        ScoreTeamA=ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    public void freeB(View view)
    {
        ScoreTeamB=ScoreTeamB+1;
        displayForTeamB(ScoreTeamB);
    }

    public void reset(View v)
    {
        EditText team1 = (EditText) findViewById(R.id.team1);
        team1.setText("");
        EditText team2 = (EditText) findViewById(R.id.team2);
        team2.setText("");
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}