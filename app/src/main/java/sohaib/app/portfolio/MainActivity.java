package sohaib.app.portfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.button:
                Toast.makeText(getBaseContext(),"This is My " + getResources().getString(R.string.media_streamer)+" App",Toast.LENGTH_LONG).show();
                break;

            case R.id.button2:
                Toast.makeText(getBaseContext(),"This is My " + getResources().getString(R.string.super_duo1),Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(getBaseContext(),"This is My " +getResources().getString(R.string.super_duo2),Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(getBaseContext(), "This is My "+ getResources().getString(R.string.ant_terminator)+" App",Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(getBaseContext(),"This is My "+  getResources().getString(R.string.xyz_reader)+" App",Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(getBaseContext(),"This is My "+  getResources().getString(R.string.capstone)+" App",Toast.LENGTH_LONG).show();
                break;







        }



    }
}
