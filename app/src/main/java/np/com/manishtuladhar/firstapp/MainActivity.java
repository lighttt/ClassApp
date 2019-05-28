package np.com.manishtuladhar.firstapp;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image;
        image = (ImageView)findViewById(R.id.imgView);

       // Defined a button
        Button click;
        click = (Button) findViewById(R.id.button);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setImageResource(R.drawable.xyz);
                Toast.makeText(MainActivity.this, "You have change the image", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
