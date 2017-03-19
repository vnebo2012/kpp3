package com.cppminitraktor.nikolay.minitraktor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AlertDialog.Builder ad;

    TextView etText;
    TextView etText2;
    TextView etText3;
    TextView etText4;
    TextView etText5;
    TextView etText6;
    TextView etText7;
    TextView etText8;
    TextView etText9;
    TextView etText10;
    TextView etText41;
    TextView etText91;


    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";


    TextView etNum1;
    TextView etNum2;
    TextView etNum3;
    TextView etNum4;
    TextView etNum5;
    TextView etNum6;
    TextView etNum7;
    TextView etNum8;
    TextView etNum9;
    TextView etNum10;
    TextView etNum11;
    TextView etNum12;
    TextView etNum13;
    TextView etNum14;
    TextView etNum15;
    TextView etNum16;
    TextView etNum61;
    TextView etNum101;

    private TextView txt_k1_1;
    private TextView txt_k1_2;
    private TextView txt_k1_3;
    private TextView txt_k1_4;
    private TextView txt_k1_5;
    private TextView txt_k1_z;

    private TextView k2_1;
    private TextView k2_2;
    private TextView k2_3;
    private TextView k2_4;
    private TextView k2_5;
    private TextView k2_z;

    FloatingActionButton btnMult;

    TextView tvResult1;
    TextView tvResult2;
    TextView tvResult3;
    TextView tvResult4;
    TextView tvResult5;
    TextView tvResult6;
    TextView tvResult7;
    TextView tvResult8;
    TextView tvResult9;
    TextView tvResult10;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult14;
    TextView tvResult15;
    TextView tvResult16;
    TextView tvResult17;
    TextView tvResult18;
    TextView tvResult19;
    TextView tvResult20;
    TextView tvResult21;
    TextView tvResult22;
    TextView tvResult23;
    TextView tvResult24;

    TextView tvResult41;
    TextView tvResult81;
    TextView tvResult121;
    TextView tvResult161;
    TextView tvResult131;
    TextView tvResult132;
    TextView tvResult133;
    TextView tvResult134;
    TextView tvResult135;
    TextView tvResult201;
    TextView tvResult241;

    TextView tvResult220;
    TextView tvResult240;

    TextView tvResult250;
    TextView tvResult260;

    SeekBar seekbar;
    SeekBar seekbar2;
    SeekBar seekbar3;
    SeekBar seekbar4;
    SeekBar seekbar5;
    SeekBar seekbar6;

    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;
    TextView textview6;


    String oper = "";
    Context context;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = (TextView) findViewById(R.id.kpp1_1);
        etText2 = (TextView) findViewById(R.id.kpp1_2);
        etText3 = (TextView) findViewById(R.id.kpp1_3);
        etText4 = (TextView) findViewById(R.id.kpp1_4);
        etText41 = (TextView) findViewById(R.id.kpp1_5);
        etText5 = (TextView) findViewById(R.id.kpp_zad1);


        etText6 = (TextView) findViewById(R.id.kpp2_1);
        etText7 = (TextView) findViewById(R.id.kpp2_2);
        etText8 = (TextView) findViewById(R.id.kpp2_3);
        etText9 = (TextView) findViewById(R.id.kpp2_4);
        etText91 = (TextView) findViewById(R.id.kpp2_5);
        etText10 = (TextView) findViewById(R.id.kpp_zad2);

        loadText();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();

       // Toolbar my_toolbar = (Toolbar)findViewById(R.id.my_toolbar23);
      //  setSupportActionBar(my_toolbar);

        //getSupportActionBar().setTitle(R.string.my_tb_title);


        /*my_toolbar.setNavigationIcon(R.mipmap.ic_12);

        my_toolbar.setNavigationOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this,PlusActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);
            }
        });*/



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        FloatingActionButton fab222 = (FloatingActionButton) findViewById(R.id.fab3);
        fab222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                return;



            }
        });



        txt_k1_1 = (TextView) findViewById(R.id.kpp1_1);
        txt_k1_2 = (TextView) findViewById(R.id.kpp1_2);
        txt_k1_3 = (TextView) findViewById(R.id.kpp1_3);
        txt_k1_4 = (TextView) findViewById(R.id.kpp1_4);
        txt_k1_5 = (TextView) findViewById(R.id.kpp1_5);
        txt_k1_z = (TextView) findViewById(R.id.kpp_zad1);

        k2_1 = (TextView) findViewById(R.id.kpp2_1);
        k2_2 = (TextView) findViewById(R.id.kpp2_2);
        k2_3 = (TextView) findViewById(R.id.kpp2_3);
        k2_4 = (TextView) findViewById(R.id.kpp2_4);
        k2_5 = (TextView) findViewById(R.id.kpp2_5);
        k2_z = (TextView) findViewById(R.id.kpp_zad2);

        txt_k1_1.setText(getIntent().getStringExtra("k11"));
        txt_k1_2.setText(getIntent().getStringExtra("k12"));
        txt_k1_3.setText(getIntent().getStringExtra("k13"));
        txt_k1_4.setText(getIntent().getStringExtra("k14"));
        txt_k1_5.setText(getIntent().getStringExtra("k15"));
        txt_k1_z.setText(getIntent().getStringExtra("k1z"));

        k2_1.setText(getIntent().getStringExtra("k21"));
        k2_2.setText(getIntent().getStringExtra("k22"));
        k2_3.setText(getIntent().getStringExtra("k23"));
        k2_4.setText(getIntent().getStringExtra("k24"));
        k2_5.setText(getIntent().getStringExtra("k25"));
        k2_z.setText(getIntent().getStringExtra("k2z"));


        seekbar = (SeekBar) findViewById(R.id.seekBar1);
        textview = (TextView) findViewById(R.id.reduktor1);

        seekbar2 = (SeekBar) findViewById(R.id.seekBar2);
        textview2 = (TextView) findViewById(R.id.reduktor2);

        seekbar3 = (SeekBar) findViewById(R.id.seekBar3);
        textview3 = (TextView) findViewById(R.id.diametr);

        seekbar4 = (SeekBar) findViewById(R.id.seekBar4);
        textview4 = (TextView) findViewById(R.id.z_most);

        seekbar5 = (SeekBar) findViewById(R.id.seekBar5);
        textview5 = (TextView) findViewById(R.id.oboroti);

        seekbar6 = (SeekBar) findViewById(R.id.seekBar6);
        textview6 = (TextView) findViewById(R.id.tyaga);


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override


            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                float weight = (5.0f - 1.0f) / (float) seekBar.getMax();
                float value = 1.0f + seekBar.getProgress() * weight;
                textview.setText(String.format(Locale.US,"%.1f", value));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (6.5f - 1.0f) / (float) seekBar.getMax();
                float value = 0.5f + seekBar.getProgress() * weight;
                textview2.setText(String.format(Locale.US,"%.1f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (120f - 34f) / (float) seekBar.getMax();
                float value = 34f + seekBar.getProgress() * weight;
                textview3.setText(String.format(Locale.US,"%.0f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (8.15f - 3.0f) / (float) seekBar.getMax();
                float value = 3.0f + seekBar.getProgress() * weight;
                textview4.setText(String.format(Locale.US,"%.2f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (4000f - 800f) / (float) seekBar.getMax();
                float value = 800f + seekBar.getProgress() * weight;
                textview5.setText(String.format(Locale.US,"%.0f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (25f) / (float) seekBar.getMax();
                float value = 1f + seekBar.getProgress() * weight;
                textview6.setText(String.format(Locale.US,"%.2f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });



        // находим элементы
        // находим элементы
        etNum1 = (TextView) findViewById(R.id.reduktor1);///////////
        etNum2 = (TextView) findViewById(R.id.reduktor2);/////////////

        etNum3 = (TextView) findViewById(R.id.kpp1_1);
        etNum4 = (TextView) findViewById(R.id.kpp1_2);


        etNum5 = (TextView) findViewById(R.id.kpp1_3);/////////////
        etNum6 = (TextView) findViewById(R.id.kpp1_4);//////////////
        etNum61 = (TextView) findViewById(R.id.kpp1_5);//////////////


        etNum7 = (TextView) findViewById(R.id.kpp2_1);
        etNum8 = (TextView) findViewById(R.id.kpp2_2);


        etNum9 = (TextView) findViewById(R.id.kpp2_3);////////////
        etNum10 = (TextView) findViewById(R.id.kpp2_4);///////////
        etNum101 = (TextView) findViewById(R.id.kpp2_5);///////////


        etNum11 = (TextView) findViewById(R.id.kpp_zad1);/////////////
        etNum12 = (TextView) findViewById(R.id.kpp_zad2);////////////


        etNum13 = (TextView) findViewById(R.id.diametr);
        etNum14 = (TextView) findViewById(R.id.oboroti);
        etNum15 = (TextView) findViewById(R.id.z_most);

        etNum16 = (TextView) findViewById(R.id.tyaga);

        btnMult = (FloatingActionButton) findViewById(R.id.fab3);

        tvResult1 = (TextView) findViewById(R.id.tvResult1);
        tvResult2 = (TextView) findViewById(R.id.tvResult2);
        tvResult3 = (TextView) findViewById(R.id.tvResult3);
        tvResult4 = (TextView) findViewById(R.id.tvResult4);
        tvResult5 = (TextView) findViewById(R.id.tvResult5);
        tvResult6 = (TextView) findViewById(R.id.tvResult6);
        tvResult7 = (TextView) findViewById(R.id.tvResult7);
        tvResult8 = (TextView) findViewById(R.id.tvResult8);
        tvResult9 = (TextView) findViewById(R.id.tvResult9);
        tvResult10 = (TextView) findViewById(R.id.tvResult10);
        tvResult11 = (TextView) findViewById(R.id.tvResult11);
        tvResult12 = (TextView) findViewById(R.id.tvResult12);
        tvResult13 = (TextView) findViewById(R.id.tvResult13);
        tvResult14 = (TextView) findViewById(R.id.tvResult14);
        tvResult15 = (TextView) findViewById(R.id.tvResult15);
        tvResult16 = (TextView) findViewById(R.id.tvResult16);

        tvResult17 = (TextView) findViewById(R.id.tvResult17);
        tvResult18 = (TextView) findViewById(R.id.tvResult18);
        tvResult19 = (TextView) findViewById(R.id.tvResult19);
        tvResult20 = (TextView) findViewById(R.id.tvResult20);
        tvResult21 = (TextView) findViewById(R.id.tvResult21);
        tvResult22 = (TextView) findViewById(R.id.tvResult22);
        tvResult23 = (TextView) findViewById(R.id.tvResult23);
        tvResult24 = (TextView) findViewById(R.id.tvResult24);

        tvResult41 = (TextView) findViewById(R.id.tvResult41);
        tvResult81 = (TextView) findViewById(R.id.tvResult81);
        tvResult121 = (TextView) findViewById(R.id.tvResult121);
        tvResult161 = (TextView) findViewById(R.id.tvResult161);
        tvResult131 = (TextView) findViewById(R.id.tvResult131);
        tvResult132 = (TextView) findViewById(R.id.tvResult132);
        tvResult133 = (TextView) findViewById(R.id.tvResult133);
        tvResult134 = (TextView) findViewById(R.id.tvResult134);
        tvResult135 = (TextView) findViewById(R.id.tvResult135);
        tvResult201 = (TextView) findViewById(R.id.tvResult201);
        tvResult241 = (TextView) findViewById(R.id.tvResult241);

        tvResult220 = (TextView) findViewById(R.id.tvResult220);
        tvResult240 = (TextView) findViewById(R.id.tvResult240);

        tvResult250 = (TextView) findViewById(R.id.tvResult250);
        tvResult260 = (TextView) findViewById(R.id.tvResult240);


        // прописываем обработчик

        btnMult.setOnClickListener(this);
    }


    public void onClick2(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.kpp1_1);

        helloTextView.setText(3 + "");

        TextView helloTextView2 = (TextView) findViewById(R.id.kpp1_2);

        helloTextView2.setText(4 + "");

    }

    public void goToStartActivity(View v) {
        Intent intent = new Intent(this, StartActivity.class);///this - это активити
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float num4 = 0;
        float num5 = 0;
        float num6 = 0;
        float num7 = 0;
        float num8 = 0;
        float num9 = 0;
        float num10 = 0;
        float num11 = 0;
        float num12 = 0;
        float num13 = 0;
        float num14 = 0;
        float num15 = 0;
        float num16 = 0;
        float num61 = 0;
        float num101 = 0;

        float result1 = 0;
        float result2 = 0;
        float result3 = 0;
        float result4 = 0;
        float result5 = 0;
        float result6 = 0;
        float result7 = 0;
        float result8 = 0;
        float result9 = 0;
        float result10 = 0;
        float result11 = 0;
        float result12 = 0;
        float result13 = 0;
        float result14 = 0;
        float result15 = 0;
        float result16 = 0;

        float result17 = 0;
        float result18 = 0;
        float result19 = 0;
        float result20 = 0;
        float result21 = 0;
        float result22 = 0;
        float result23 = 0;
        float result24 = 0;

        float result41 = 0;
        float result81 = 0;
        float result121 = 0;
        float result161 = 0;
        float result131 = 0;
        float result132 = 0;
        float result133 = 0;
        float result134 = 0;
        float result135 = 0;
        float result201 = 0;
        float result241 = 0;

        float result220 = 0;
        float result240 = 0;

        float result250 = 0;
        float result260 = 0;

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())
                || TextUtils.isEmpty(etNum3.getText().toString())
                || TextUtils.isEmpty(etNum4.getText().toString())
                || TextUtils.isEmpty(etNum5.getText().toString())
                || TextUtils.isEmpty(etNum6.getText().toString())
                || TextUtils.isEmpty(etNum7.getText().toString())
                || TextUtils.isEmpty(etNum8.getText().toString())
                || TextUtils.isEmpty(etNum9.getText().toString())
                || TextUtils.isEmpty(etNum10.getText().toString())
                || TextUtils.isEmpty(etNum11.getText().toString())
                || TextUtils.isEmpty(etNum12.getText().toString())
                || TextUtils.isEmpty(etNum13.getText().toString())
                || TextUtils.isEmpty(etNum14.getText().toString())
                || TextUtils.isEmpty(etNum15.getText().toString())
                || TextUtils.isEmpty(etNum16.getText().toString())
                || TextUtils.isEmpty(etNum61.getText().toString())
                || TextUtils.isEmpty(etNum101.getText().toString())

                ) {
            return;
        }

        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());
        num3 = Float.parseFloat(etNum3.getText().toString());
        num4 = Float.parseFloat(etNum4.getText().toString());
        num5 = Float.parseFloat(etNum5.getText().toString());
        num6 = Float.parseFloat(etNum6.getText().toString());
        num7 = Float.parseFloat(etNum7.getText().toString());
        num8 = Float.parseFloat(etNum8.getText().toString());
        num9 = Float.parseFloat(etNum9.getText().toString());
        num10 = Float.parseFloat(etNum10.getText().toString());
        num11 = Float.parseFloat(etNum11.getText().toString());
        num12 = Float.parseFloat(etNum12.getText().toString());
        num13 = Float.parseFloat(etNum13.getText().toString());
        num14 = Float.parseFloat(etNum14.getText().toString());
        num15 = Float.parseFloat(etNum15.getText().toString());
        num16 = Float.parseFloat(etNum16.getText().toString());
        num61 = Float.parseFloat(etNum61.getText().toString());
        num101 = Float.parseFloat(etNum101.getText().toString());

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе

        switch (v.getId()) {



            case R.id.fab3:
                oper = "*";

                result1 = (float) (((((num14 / (num1 * num2 * num3 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result2 = (float) (((((num14 / (num1 * num2 * num3 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result3 = (float) (((((num14 / (num1 * num2 * num3 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result4 = (float) (((((num14 / (num1 * num2 * num3 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result5 = (float) (((((num14 / (num1 * num2 * num4 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result6 = (float) (((((num14 / (num1 * num2 * num4 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result7 = (float) (((((num14 / (num1 * num2 * num4 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result8 = (float) (((((num14 / (num1 * num2 * num4 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result9 = (float) (((((num14 / (num1 * num2 * num5 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result10 = (float) (((((num14 / (num1 * num2 * num5 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result11 = (float) (((((num14 / (num1 * num2 * num5 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result12 = (float) (((((num14 / (num1 * num2 * num5 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result13 = (float) (((((num14 / (num1 * num2 * num6 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result14 = (float) (((((num14 / (num1 * num2 * num6 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result15 = (float) (((((num14 / (num1 * num2 * num6 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result16 = (float) (((((num14 / (num1 * num2 * num6 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result17 = (float) (((((num14 / (num1 * num2 * num11 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result18 = (float) (((((num14 / (num1 * num2 * num11 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result19 = (float) (((((num14 / (num1 * num2 * num11 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result20 = (float) (((((num14 / (num1 * num2 * num11 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result21 = (float) (((((num14 / (num1 * num2 * num12 * num3 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result22 = (float) (((((num14 / (num1 * num2 * num12 * num4 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result23 = (float) (((((num14 / (num1 * num2 * num12 * num5 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result24 = (float) (((((num14 / (num1 * num2 * num12 * num6 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result41 = (float) (((((num14 / (num1 * num2 * num3 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result81 = (float) (((((num14 / (num1 * num2 * num4 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result121 = (float) (((((num14 / (num1 * num2 * num5 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result161 = (float) (((((num14 / (num1 * num2 * num6 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result131 = (float) (((((num14 / (num1 * num2 * num61 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result132 = (float) (((((num14 / (num1 * num2 * num61 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result133 = (float) (((((num14 / (num1 * num2 * num61 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result134 = (float) (((((num14 / (num1 * num2 * num61 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result135 = (float) (((((num14 / (num1 * num2 * num61 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result201 = (float) (((((num14 / (num1 * num2 * num11 * num101 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result241 = (float) (((((num14 / (num1 * num2 * num12 * num61 * num15)) * 3.14) * num13) / 100) * 60) / 1000;


                result220 = (float) ((float) ((num16)*(num15*num1*num2*num3*num7)*0.9)/(num13*2*0.1));
                result240 = (float) ((float) ((num16)*(num15*num1*num2*num6*num10)*0.9)/(num13*2*0.1));
                result250 = (float) ((float) ((num16)*(num15*num1*num2*num61*num10)*0.9)/(num13*2*0.1));

               // result250 = (float) ((float) ((num16)*(num15*num1*num2*num3)*0.9)/(num13*2*0.1));
              //  result260 = (float) ((float) ((num16)*(num15*num1*num2*num6)*0.9)/(num13*2*0.1));


                long mills = 42L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);

                break;

            default:
                break;
        }

        // формируем строку вывода
        //tvResult.setText(num1 + " " + oper + " " + num2 + oper+num3+oper+num4+" = " + result);







        /*if (Float.parseFloat(etNum7.getText().toString()) == 1)

        {
            tvResult1.setText("(1)" + String.format("%.1f", result1));
            tvResult2.setText("" + " -- ");
            tvResult3.setText("" + " -- ");
            tvResult4.setText("" + " -- ");
            tvResult5.setText("(2)" + String.format("%.1f", result5));
            tvResult6.setText("" + " -- ");
            tvResult7.setText("" + " -- ");
            tvResult8.setText("" + " -- ");
            tvResult9.setText("(3)" + String.format("%.1f", result9));
            tvResult10.setText("" + " -- ");
            tvResult11.setText("" + " -- ");
            tvResult12.setText("" + " -- ");
            tvResult13.setText("(4)" + String.format("%.1f", result13));
            tvResult14.setText("" + " -- ");
            tvResult15.setText("" + " -- ");
            tvResult16.setText("" + " -- ");

            tvResult21.setText("" + " -- ");
            tvResult22.setText("" + " -- ");
            tvResult23.setText("" + " -- ");
            tvResult24.setText("" + " -- ");

            tvResult18.setText("" + " -- ");
            tvResult19.setText("" + " -- ");
            tvResult20.setText("" + " -- ");

            tvResult17.setText("(задний ход)" + String.format("%.1f", result17));


            tvResult250.setText(String.format("%.2f", result250));
            tvResult260.setText(String.format("%.2f", result260));




        } else
        {*/
            tvResult1.setText("(1-1)" + String.format("%.1f", result1));
            tvResult2.setText("(1-2)" + String.format("%.1f", result2));
            tvResult3.setText("(1-3)" + String.format("%.1f", result3));
            tvResult4.setText("(1-4)" + String.format("%.1f", result4));
            tvResult41.setText("(1-5)" + String.format("%.1f", result41));

            tvResult6.setText("(2-2)" + String.format("%.1f", result6));
            tvResult7.setText("(2-3)" + String.format("%.1f", result7));
            tvResult8.setText("(2-4)" + String.format("%.1f", result8));
            tvResult81.setText("(2-5)" + String.format("%.1f", result81));

            tvResult10.setText("(3-2)" + String.format("%.1f", result10));
            tvResult11.setText("(3-3)" + String.format("%.1f", result11));
            tvResult12.setText("(3-4)" + String.format("%.1f", result12));
            tvResult121.setText("(3-5)" + String.format("%.1f", result121));

            tvResult14.setText("(4-2)" + String.format("%.1f", result14));
            tvResult15.setText("(4-3)" + String.format("%.1f", result15));
            tvResult16.setText("(4-4)" + String.format("%.1f", result16));
            tvResult161.setText("(4-5)" + String.format("%.1f", result161));

            tvResult5.setText("(2-1)" + String.format("%.1f", result5));

            tvResult9.setText("(3-1)" + String.format("%.1f", result9));

            tvResult13.setText("(4-1)" + String.format("%.1f", result13));

            tvResult131.setText("(5-1)" + String.format("%.1f", result131));
            tvResult132.setText("(5-2)" + String.format("%.1f", result132));
            tvResult133.setText("(5-3)" + String.format("%.1f", result133));
            tvResult134.setText("(5-4)" + String.format("%.1f", result134));
            tvResult135.setText("(5-5)" + String.format("%.1f", result135));

            tvResult17.setText("(з1-1)" + String.format("%.1f", result17));
            tvResult18.setText("(з1-2)" + String.format("%.1f", result18));
            tvResult19.setText("(з1-3)" + String.format("%.1f", result19));
            tvResult20.setText("(з1-4)" + String.format("%.1f", result20));
            tvResult201.setText("(з1-5)" + String.format("%.1f", result201));

            tvResult21.setText("(з2-1)" + String.format("%.1f", result21));
            tvResult22.setText("(з2-2)" + String.format("%.1f", result22));
            tvResult23.setText("(з2-3)" + String.format("%.1f", result23));
            tvResult24.setText("(з2-4)" + String.format("%.1f", result24));
            tvResult241.setText("(з2-5)" + String.format("%.1f", result241));

            tvResult220.setText(String.format("%.2f", result220));
            tvResult240.setText(String.format("%.2f", result240));
            tvResult250.setText(String.format("%.2f", result250));
      //  }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.market) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
            startActivity(intent);

        } else if (id == R.id.you_tube) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCevOw6a0SiaFm-TGHcogQEg"));
            startActivity(intent);




        }

        return super.onOptionsItemSelected(item);
    }



    //region сохранение данных
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        //Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        //  Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();


    }


}
