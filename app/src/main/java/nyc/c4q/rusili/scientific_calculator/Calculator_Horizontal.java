package nyc.c4q.rusili.scientific_calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/**
 * Created by rusili on 10/5/16.
 */

public class Calculator_Horizontal extends AppCompatActivity {
    boolean isDeg = true;
    TextView tvDeg;
    TextView tvRad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_horizontal);
        tvDeg = (TextView) findViewById(R.id.idDeg);
        tvRad = (TextView) findViewById(R.id.idRad);

    }

    public void onSwitch(View view) {
        if (isDeg){
            tvDeg.setText("DEG");
            tvDeg.setTextColor(Color.parseColor("#f7f7f7"));
            tvDeg.setBackgroundColor(Color.parseColor("#767676"));
            tvRad.setText(":::::");
            tvRad.setTextColor(Color.parseColor("#505050"));
            tvRad.setBackgroundColor(Color.parseColor("#f7f7f7"));
            isDeg = false;
        } else {
            tvRad.setText("RAD");
            tvRad.setTextColor(Color.parseColor("#f7f7f7"));
            tvRad.setBackgroundColor(Color.parseColor("#767676"));
            tvDeg.setText(":::::");
            tvDeg.setTextColor(Color.parseColor("#505050"));
            tvDeg.setBackgroundColor(Color.parseColor("#f7f7f7"));
            isDeg = true;
        }


    }
}
