package np.com.manishtuladhar.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NumberShapeAcitivty extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){

            int x = 1;
            int triangularNumber = 1;

            while(triangularNumber<number){
                x++;
                triangularNumber = triangularNumber + x;
            }

            if(triangularNumber == number){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void testnumber(View view)
    {
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);
        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(usersNumber.getText().toString());

        String message ="";

        if(myNumber.isSquare())
        {
            if (myNumber.isTriangular())
            {
                message = myNumber.number + "is both triangular and square!";
            }

            else{
              message = myNumber.number + "is square but no triangular!";
            }
        }
        else
        {
            if(myNumber.isTriangular()){
                message = myNumber.number + "is triangular!";
            }
            else{
                message = myNumber.number + "is neither triangular nor square!";
            }
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbershape);
    }
}
