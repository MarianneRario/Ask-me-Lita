package mariannerario.com.askmelita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.ask_button);
        final ImageView firstBall = findViewById(R.id.firstBall);
        final int [] balls = {
                R.drawable.magic_ball1,
                R.drawable.magic_ball2,
                R.drawable.magic_ball3,
                R.drawable.magic_ball4,
                R.drawable.magic_ball5,
                R.drawable.magic_ball7,
                R.drawable.magic_ball9,
                R.drawable.magic_ball10,
                R.drawable.magic_ball12,
                R.drawable.magic_ball11,
                R.drawable.magic_ball6,
                R.drawable.magic_ball8
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumber = new Random();
                int number = randomNumber.nextInt(12);
                Log.d("Ball", "Random number " + number);
                firstBall.setImageResource(balls[number]);


            }
        });
    }
}
