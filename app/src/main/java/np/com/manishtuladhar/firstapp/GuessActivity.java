package np.com.manishtuladhar.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class GuessActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){

        EditText guessEditText = (EditText)findViewById(R.id.et_guess);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt > randomNumber)
        {
            makeToast("Lower!");
        }
        else if (guessInt < randomNumber)
        {
            makeToast("Higher!");
        }
        else {

            makeToast("Thats right! Guess a new one!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlow);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
}
