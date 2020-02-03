package com.example.umpirebuddy10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ballButton = findViewById<Button>(R.id.ballButton)
        val strikeButton = findViewById<Button>(R.id.strikeButton)
        val ballsCountView = findViewById<TextView>(R.id.ballsCountView)
        val strikesCountView = findViewById<TextView>(R.id.strikesCountView)

        var ballCount = 0;
        var strikeCount = 0;

        ballButton.setOnClickListener {
            ballCount += 1
            ballsCountView.text = ballCount.toString()
        }

        strikeButton.setOnClickListener {
            strikeCount += 1
            strikesCountView.text = strikeCount.toString()
        }

        resetButton.setOnClickListener {
            ballCount =0
            ballsCountView.text = ballCount.toString()
            strikeCount =0
            strikesCountView.text = strikeCount.toString()
        }

        exitButton.setOnClickListener {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }



    }

}
