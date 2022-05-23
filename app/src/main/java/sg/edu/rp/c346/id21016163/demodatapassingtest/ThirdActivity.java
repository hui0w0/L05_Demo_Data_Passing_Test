package sg.edu.rp.c346.id21016163.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char word = intentReceived.getCharExtra("char", 'o');
        tvAnswer.setText("Character value received is: " + word);

    }
}