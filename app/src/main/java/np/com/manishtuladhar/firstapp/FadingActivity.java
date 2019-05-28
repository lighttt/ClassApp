package np.com.manishtuladhar.firstapp;


import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class FadingActivity extends AppCompatActivity {

    String TAG ="Fadingactivity";
    public ImageView bart, homer;

    public void fade(View view) {
        //f since it takes float value and ms
    bart.animate().alpha(0f).setDuration(2000);
    homer.animate().alpha(1f).setDuration(2000);

        //bart.animate().translationYBy(1000f).setDuration(2000);
       // bart.animate().translationXBy(-1000f).setDuration(2000);

       // bart.animate().rotation(1800f).setDuration(2000);

        //bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

//        bart.animate()
//                .translationXBy(1000f)
//                .translationYBy(1000f)
//                .rotationBy(3600)
//                .setDuration(2000);
    }

    public void fade2(View view){
        homer.animate().alpha(0f).setDuration(2000);
         bart.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fading);

        bart = (ImageView)findViewById(R.id.bart);
        homer = (ImageView)findViewById(R.id.homer);

//        bart.setTranslationX(-1000f);
//        bart.setTranslationY(-1000f);


    }
}
