package tw.org.iii.iiiandroid02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lottery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottery = findViewById(R.id.lottery);
        lottery.setText("" + (int)(Math.random()*49+1));
        Log.v("DCH", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("DCH", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("DCH", "onResume");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.v("DCH", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("DCH", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DCH", "onDestroy");
    }

    protected void onRestart() {
        super.onRestart();
        Log.v("DCH", "onRestart");
    }


    public void gotoPage2(View view) {
        Log.v("DCH","Click");

        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }
}
