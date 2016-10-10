package nyc.c4q.rusili.scientific_calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;



/**
 * Created by RafatK *AKA* BlackJack on 10/7/16.
 */

public class KeyPad extends AppCompatActivity{
    TextView idHistory;
    /*Key Pad special functions*/

    public Button ANS;
    public Button DEL;
    public Button CE;
    public Button equals;
    public Button dot;
    public Button leftParenthesis;
    public Button rightParenthesis;

    public Button division;
    public Button multiply;
    public Button subtract;
    public Button addition;

    /* Key Pad numbers */

    public Button num9;
    public Button num8;
    public Button num7;
    public Button num6;
    public Button num5;
    public Button num4;
    public Button num3;
    public Button num2;
    public Button num1;
    public Button num0;
    private List<Button> ButtonList;
    private List<Button> button_numList;

    public double storeVal;
    public String pushStringVal;
    public String storeStringVal = "";



    private List<ButtonValues>  List_ButtonValues = Arrays.asList(
            ButtonValues.num0,   //1
            ButtonValues.num1,   //2
            ButtonValues.num2,   //3
            ButtonValues.num3,   //4
            ButtonValues.num4,   //5
            ButtonValues.num5,   //6
            ButtonValues.num6,   //7
            ButtonValues.num7,   //8
            ButtonValues.num8,   //9
            ButtonValues.num9,   //10

            ButtonValues.ANS,   //11
            ButtonValues.DEL,   //12
            ButtonValues.CE,   //13
            ButtonValues.equals,   //14

            ButtonValues.MULTIPLY,   //15
            ButtonValues.DIVIDE,   //16
            ButtonValues.SUBTRACT,   //17
            ButtonValues.ADD,   //18

            ButtonValues.LeftParenthesis,   //19
            ButtonValues.RightParenthesis,  //20

            ButtonValues.dot   //21
     );


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_horizontal);

        idHistory = (TextView) findViewById(R.id.idHistory);

        num0 = (Button) findViewById(R.id.btn_0);
        num1 = (Button) findViewById(R.id.btn_1);
        num2 = (Button) findViewById(R.id.btn_2);
        num3 = (Button) findViewById(R.id.btn_3);
        num4 = (Button) findViewById(R.id.btn_4);
        num5 = (Button) findViewById(R.id.btn_5);
        num6 = (Button) findViewById(R.id.btn_6);
        num7 = (Button) findViewById(R.id.btn_7);
        num8 = (Button) findViewById(R.id.btn_8);
        num9 = (Button) findViewById(R.id.btn_9);

        ANS = (Button) findViewById(R.id.btn_ans);
        DEL = (Button) findViewById(R.id.btn_DEL);
        CE = (Button) findViewById(R.id.btn_CE);
        equals = (Button) findViewById(R.id.btn_equals);

        multiply = (Button) findViewById(R.id.btn_multiply);
        division = (Button) findViewById(R.id.btn_division);
        subtract = (Button) findViewById(R.id.btn_minus);
        addition = (Button) findViewById(R.id.btn_plus);

        leftParenthesis = (Button) findViewById(R.id.btn_leftBracket);
        rightParenthesis = (Button) findViewById(R.id.btn_rightBracket);

        dot = (Button) findViewById(R.id.btn_dot);

        ButtonList = Arrays.asList(
                num0,
                num1,
                num2,
                num3,
                num4,
                num5,
                num6,
                num7,
                num8,
                num9,

                ANS,
                DEL,
                CE,
                equals,

                multiply,
                division,
                subtract,
                addition,

                leftParenthesis,
                rightParenthesis,

                dot
        );

        button_numList =  Arrays.asList(
                num0,
                num1,
                num2,
                num3,
                num4,
                num5,
                num6,
                num7,
                num8,
                num9 );

    }

        @Override
        protected void onStart () {
            super.onStart();
            for (int i = 0; i < ButtonList.size(); i++) {
                Button button = ButtonList.get(i);
                ButtonValues ButtValue = List_ButtonValues.get(i);
                button.setOnClickListener(buildKeypadListener(ButtValue));
            }
        }



     /* The plan is to store string values and convert to Integer values as needed */

    private View.OnClickListener buildKeypadListener(final ButtonValues ButtValue) {
        return new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        switch(ButtValue){
                            case num0:
                                pushStringVal = storeStringVal +"0";
                                storeStringVal = pushStringVal;

                                break;
                            case num1:
                                pushStringVal = storeStringVal + "1";
                                storeStringVal = pushStringVal;
                                break;
                            case num2:
                                pushStringVal = storeStringVal + "2";
                                storeStringVal = pushStringVal;
                                break;
                            case num3:
                                pushStringVal = storeStringVal + "3";
                                storeStringVal = pushStringVal;
                                break;
                            case num4:
                                pushStringVal = storeStringVal + "4";
                                storeStringVal = pushStringVal;
                                break;
                            case num5:
                                pushStringVal = storeStringVal + "5";
                                storeStringVal = pushStringVal;
                                break;
                            case num6:
                                pushStringVal = storeStringVal + "6";
                                storeStringVal = pushStringVal;
                                break;
                            case num7:
                                pushStringVal = storeStringVal + "7";
                                storeStringVal = pushStringVal;
                                break;
                            case num8:
                                pushStringVal = storeStringVal + "8";
                                storeStringVal = pushStringVal;
                                break;
                            case num9:
                                pushStringVal = storeStringVal + "9";
                                storeStringVal = pushStringVal;
                                break;


                            case ANS:
                                break;
                            case DEL:
                                break;
                            case CE:
                                break;
                            case equals:
                                break;


                            case MULTIPLY:
                                break;
                            case DIVIDE:
                                break;
                            case SUBTRACT:
                                break;
                            case ADD:
                                break;


                            case LeftParenthesis:
                                break;
                            case RightParenthesis:
                                break;
                            case dot:
                                break;
                }
                        idHistory.setText(pushStringVal);

            }
        };
    }
}

