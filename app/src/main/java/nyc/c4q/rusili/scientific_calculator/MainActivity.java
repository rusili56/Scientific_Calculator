package nyc.c4q.rusili.scientific_calculator;


import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            int Orientation = getResources().getConfiguration().orientation;

            switch(Orientation){
                    case  Configuration.ORIENTATION_LANDSCAPE:
                            Log.d(TAG,"Orientation is LANDSCAPE" );
                            setContentView(R.layout.calculator);
                            LaunchHorizontalKeypad(this);
                            break;
                    case Configuration.ORIENTATION_PORTRAIT:
                            Log.d(TAG, "Orientation is Portrait");
                            setContentView(R.layout.calculator);
                            LaunchVerticalKeypad(this);
                            break;
                    case Configuration.ORIENTATION_UNDEFINED:
                            Log.d(TAG, "Orientation is Undefined");
                            finish();
                            break;
                    default:
                            Log.d(TAG, "Orientation skipped to default");
                            finish();
                            break;
            }





    }
    @Override
        public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
                super.onSaveInstanceState(outState, outPersistentState);
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                int Orientation = getResources().getConfiguration().orientation;
                switch(Orientation){
                        case  Configuration.ORIENTATION_LANDSCAPE:
                                Log.d(TAG,"Orientation Destroyed on LANDSCAPE");
                                StopHorizontalKeypad(this);
                                LaunchVerticalKeypad(this);
                                break;
                        case Configuration.ORIENTATION_PORTRAIT:
                                Log.d(TAG,"Orientation Destroyed on PORTRAIT");
                                StopVerticalKeypad(this);
                                LaunchHorizontalKeypad(this);
                                break;
                        case Configuration.ORIENTATION_UNDEFINED:
                                Log.d(TAG,"Orientation Destroyed UNDEFINED");
                                break;
                        default:
                                Log.d(TAG,"Orientation Destroyed on Default");
                                break;
                }

        }

        private void LaunchHorizontalKeypad(Context context){
                Intent intent = new Intent(context, KeyPadHorizontal.class);
                context.startActivity(intent);
        }

        private void LaunchVerticalKeypad(Context context){
                Intent intent = new Intent(context, KeyPadVertical.class);
                context.startActivity(intent);
        }

        private void StopHorizontalKeypad(Context context){
                Intent intent = new Intent(context, KeyPadHorizontal.class);
                context.stopService(intent);
                finish();
        }

        private void StopVerticalKeypad(Context context){
                Intent intent = new Intent(context, KeyPadVertical.class);
                context.stopService(intent);
                finish();
        }


//  ----------------------------NOT SURE IF NECESSARY (TESTING)-------------------------------------
//    @Override
//    protected void onStart() {
//        super.onStart();
//        int Orientation = getResources().getConfiguration().orientation;
//
//        switch(Orientation){
//            case  Configuration.ORIENTATION_LANDSCAPE:
//                Log.d(TAG,"Orientation is LANDSCAPE" );
//                LaunchHorizontalKeypad(this);
//                break;
//            case Configuration.ORIENTATION_PORTRAIT:
//                Log.d(TAG, "Orientation is Portrait");
//                LaunchVerticalKeypad(this);
//                break;
//            case Configuration.ORIENTATION_UNDEFINED:
//                Log.d(TAG, "Orientation is Undefined");
//                break;
//            default:
//                Log.d(TAG, "Orientation skipped to default");
//                break;
//        }
//    }


}


