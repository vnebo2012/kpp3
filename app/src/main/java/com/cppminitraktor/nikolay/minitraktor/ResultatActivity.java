package com.cppminitraktor.nikolay.minitraktor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Locale;


public class ResultatActivity extends AppCompatActivity {

    private Button button123;
    private Button button124;
    private Button button125;

    private TextView final_text1;
    private TextView final_text2;
    private TextView final_text3;
    private TextView final_text4;
    private TextView final_text5;
    private TextView final_text6;
    private TextView final_text7;

    private TextView final_text11;
    private TextView final_text21;
    private TextView final_text31;
    private TextView final_text41;
    private TextView final_text51;
    private TextView final_text61;

    private TextView final_text12;
    private TextView final_text22;
    private TextView final_text32;
    private TextView final_text42;
    private TextView final_text52;
    private TextView final_text62;

    private TextView final_text71;
    private TextView final_text72;

    final Context context2 = this;
    boolean flag = true;
    //Context context2;
    ScrollView myScroll;

    TextView etText1;
    TextView etText2;
    TextView etText3;
    TextView etText4;
    TextView etText5;
    TextView etText6;
    TextView etText7;
    TextView etText8;
    TextView etText9;
    TextView etText10;
    TextView etText11;
    TextView etText12;
    TextView etText13;
    TextView etText14;
    TextView etText15;

    TextView etText16;
    TextView etText17;
    TextView etText18;

    TextView etText19;
    TextView etText20;
    TextView etText21;

    TextView textView105;

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
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";
    final String SAVED_TEXT14 = "saved_text14";
    final String SAVED_TEXT15 = "saved_text15";

    final String SAVED_TEXT16 = "saved_text16";
    final String SAVED_TEXT17 = "saved_text17";
    final String SAVED_TEXT18 = "saved_text18";

    final String SAVED_TEXT19 = "saved_text19";
    final String SAVED_TEXT20 = "saved_text20";
    final String SAVED_TEXT21 = "saved_text21";



    final String MY_SETTINGS = "saved_text_pervaya27";



    private TextView txt_k1_1;
    private TextView txt_k1_2;
    private TextView txt_k1_3;
    private TextView txt_k1_4;
    private TextView txt_k1_5;
    private TextView txt_k1_z;

    private EditText k2_1;
    private EditText k2_2;
    private EditText k2_3;
    private EditText k2_4;
    private EditText k2_5;
    private EditText k2_z;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited_pervaya27", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);


            final TextView bill1 = (TextView) findViewById(R.id.textView9);
            final TextView bill2 = (TextView) findViewById(R.id.textView11);
            final TextView bill3 = (TextView) findViewById(R.id.textView14);
            final TextView bill4 = (TextView) findViewById(R.id.textView15);
            final TextView bill5 = (TextView) findViewById(R.id.textView13);

            final TextView bill6 = (TextView) findViewById(R.id.textView91);
            final TextView bill7 = (TextView) findViewById(R.id.textView111);
            final TextView bill8 = (TextView) findViewById(R.id.textView141);
            final TextView bill9 = (TextView) findViewById(R.id.textView151);
            final TextView bill10= (TextView) findViewById(R.id.textView131);

            final TextView bill11 = (TextView) findViewById(R.id.textView92);
            final TextView bill12 = (TextView) findViewById(R.id.textView112);
            final TextView bill13 = (TextView) findViewById(R.id.textView142);
            final TextView bill14 = (TextView) findViewById(R.id.textView152);
            final TextView bill15 = (TextView) findViewById(R.id.textView132);

            final TextView bill16 = (TextView) findViewById(R.id.button170);
            final TextView bill17 = (TextView) findViewById(R.id.button171);
            final TextView bill18 = (TextView) findViewById(R.id.button172);

            final TextView bill19 = (TextView) findViewById(R.id.textView105);
            final TextView bill20 = (TextView) findViewById(R.id.textView205);
            final TextView bill21 = (TextView) findViewById(R.id.textView305);

            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {

                                    bill1.setText(1 + "");
                                    bill2.setText(1 + "");
                                    bill3.setText(1 + "");
                                    bill4.setText(1 + "");
                                    bill5.setText(1 + "");

                                    bill6.setText(1 + "");
                                    bill7.setText(1 + "");
                                    bill8.setText(1 + "");
                                    bill9.setText(1 + "");
                                    bill10.setText(1 + "");

                                    bill11.setText(1 + "");
                                    bill12.setText(1 + "");
                                    bill13.setText(1 + "");
                                    bill14.setText(1 + "");
                                    bill15.setText(1 + "");

                                    bill19.setText(1 + "");
                                    bill20.setText(1 + "");
                                    bill21.setText(1 + "");

                                    bill16.setText("new" + "");
                                    bill17.setText("new" + "");
                                    bill18.setText("new" + "");

                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();


            long mills = 70L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
            // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_pervaya27", true);
            e.commit(); // не забудьте подтвердить изменения
        }





        etText1 = (TextView) findViewById(R.id.textView9);
        etText2 = (TextView) findViewById(R.id.textView11);
        etText3 = (TextView) findViewById(R.id.textView14);
        etText4 = (TextView) findViewById(R.id.textView15);
        etText5 = (TextView) findViewById(R.id.textView13);

        etText6 = (TextView) findViewById(R.id.textView91);
        etText7 = (TextView) findViewById(R.id.textView111);
        etText8 = (TextView) findViewById(R.id.textView141);
        etText9 = (TextView) findViewById(R.id.textView151);
        etText10 = (TextView) findViewById(R.id.textView131);

        etText11 = (TextView) findViewById(R.id.textView92);
        etText12 = (TextView) findViewById(R.id.textView112);
        etText13 = (TextView) findViewById(R.id.textView142);
        etText14 = (TextView) findViewById(R.id.textView152);
        etText15 = (TextView) findViewById(R.id.textView132);

        etText19 = (TextView) findViewById(R.id.textView105);
        etText20 = (TextView) findViewById(R.id.textView205);
        etText21 = (TextView) findViewById(R.id.textView305);

        etText16 = (Button) findViewById(R.id.button170);
        etText17 = (Button) findViewById(R.id.button171);
        etText18 = (Button) findViewById(R.id.button172);

        loadText1();
        loadText2();
        loadText3();
        loadText4();
        loadText5();

        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();

        loadText11();
        loadText12();
        loadText13();
        loadText14();
        loadText15();

        loadText16();
        loadText17();
        loadText18();

        loadText19();
        loadText20();
        loadText21();

        button123 = (Button) findViewById(R.id.button170);
        final_text1 = (TextView) findViewById(R.id.button170);
        final_text2 = (TextView) findViewById(R.id.textView9);
        final_text3 = (TextView) findViewById(R.id.textView11);
        final_text4 = (TextView) findViewById(R.id.textView14);
        final_text5 = (TextView) findViewById(R.id.textView15);
        final_text6 = (TextView) findViewById(R.id.textView13);
        final_text7 = (TextView) findViewById(R.id.textView105);

        button123.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);
                                                 // final EditText userInput = (EditText) promptsView.findViewById(R.id.editText12);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("Ok",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                                                                         imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText12);
                                                                         final EditText userInput2 = (EditText) promptsView.findViewById(R.id.editText1);
                                                                         final EditText userInput3 = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         final EditText userInput4 = (EditText) promptsView.findViewById(R.id.editText3);
                                                                         final EditText userInput5 = (EditText) promptsView.findViewById(R.id.editText4);
                                                                         final EditText userInput6 = (EditText) promptsView.findViewById(R.id.editText5);
                                                                         final EditText userInput7 = (EditText) promptsView.findViewById(R.id.editText41);


                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Нет названия КПП!", Toast.LENGTH_SHORT);


                                                                             toast.show();
                                                                             dialog.cancel();
                                                                         } else {
                                                                             if (userInput2.getText().length() == 0)
                                                                             {
                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                         "Заполните строку 1", Toast.LENGTH_SHORT);


                                                                                 toast.show();
                                                                                 dialog.cancel();
                                                                             } else {
                                                                                 if (userInput3.getText().length() == 0)
                                                                                 {
                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                             "Заполните строку 2", Toast.LENGTH_SHORT);


                                                                                     toast.show();
                                                                                     dialog.cancel();
                                                                                 } else {
                                                                                     if (userInput4.getText().length() == 0)
                                                                                     {
                                                                                         Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                 "Заполните строку 3", Toast.LENGTH_SHORT);


                                                                                         toast.show();
                                                                                         dialog.cancel();
                                                                                     } else {

                                                                                         if (userInput5.getText().length() == 0)
                                                                                         {
                                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                     "Заполните строку 4", Toast.LENGTH_SHORT);


                                                                                             toast.show();
                                                                                             dialog.cancel();
                                                                                         } else {
                                                                                             if (userInput6.getText().length() == 0)
                                                                                             {
                                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                         "Заполните строку Z", Toast.LENGTH_SHORT);


                                                                                                 toast.show();
                                                                                                 dialog.cancel();
                                                                                             } else {
                                                                                                 if (userInput7.getText().length() == 0)
                                                                                                 {
                                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                             "Заполните строку 5", Toast.LENGTH_SHORT);


                                                                                                     toast.show();
                                                                                                     dialog.cancel();
                                                                                                 } else {

                                                                                                     final_text1.setText(userInput.getText());
                                                                                                     final_text2.setText(userInput2.getText());
                                                                                                     final_text3.setText(userInput3.getText());
                                                                                                     final_text4.setText(userInput4.getText());
                                                                                                     final_text5.setText(userInput5.getText());
                                                                                                     final_text6.setText(userInput6.getText());
                                                                                                     final_text7.setText(userInput7.getText());
                                                                                                 }
                                                                                             }} }}}}}})
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button124 = (Button) findViewById(R.id.button171);
        final_text11 = (TextView) findViewById(R.id.button171);
        final_text21 = (TextView) findViewById(R.id.textView91);
        final_text31 = (TextView) findViewById(R.id.textView111);
        final_text41 = (TextView) findViewById(R.id.textView141);
        final_text51 = (TextView) findViewById(R.id.textView151);
        final_text61 = (TextView) findViewById(R.id.textView131);
        final_text71 = (TextView) findViewById(R.id.textView205);

        button124.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                                                                         imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText12);
                                                                         final EditText userInput2 = (EditText) promptsView.findViewById(R.id.editText1);
                                                                         final EditText userInput3 = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         final EditText userInput4 = (EditText) promptsView.findViewById(R.id.editText3);
                                                                         final EditText userInput5 = (EditText) promptsView.findViewById(R.id.editText4);
                                                                         final EditText userInput6 = (EditText) promptsView.findViewById(R.id.editText5);
                                                                         final EditText userInput7 = (EditText) promptsView.findViewById(R.id.editText41);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Нет названия КПП!", Toast.LENGTH_SHORT);


                                                                             toast.show();
                                                                             dialog.cancel();
                                                                         } else {
                                                                             if (userInput2.getText().length() == 0)
                                                                             {
                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                         "Заполните строку 1", Toast.LENGTH_SHORT);


                                                                                 toast.show();
                                                                                 dialog.cancel();
                                                                             } else {
                                                                                 if (userInput3.getText().length() == 0)
                                                                                 {
                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                             "Заполните строку 2", Toast.LENGTH_SHORT);


                                                                                     toast.show();
                                                                                     dialog.cancel();
                                                                                 } else {
                                                                                     if (userInput4.getText().length() == 0)
                                                                                     {
                                                                                         Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                 "Заполните строку 3", Toast.LENGTH_SHORT);


                                                                                         toast.show();
                                                                                         dialog.cancel();
                                                                                     } else {

                                                                                         if (userInput5.getText().length() == 0)
                                                                                         {
                                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                     "Заполните строку 4", Toast.LENGTH_SHORT);


                                                                                             toast.show();
                                                                                             dialog.cancel();
                                                                                         } else {
                                                                                             if (userInput6.getText().length() == 0)
                                                                                             {
                                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                         "Заполните строку Z", Toast.LENGTH_SHORT);


                                                                                                 toast.show();
                                                                                                 dialog.cancel();
                                                                                             } else {
                                                                                                 if (userInput7.getText().length() == 0)
                                                                                                 {
                                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                             "Заполните строку 5", Toast.LENGTH_SHORT);


                                                                                                     toast.show();
                                                                                                     dialog.cancel();
                                                                                                 } else {

                                                                                                     final_text11.setText(userInput.getText());
                                                                                                     final_text21.setText(userInput2.getText());
                                                                                                     final_text31.setText(userInput3.getText());
                                                                                                     final_text41.setText(userInput4.getText());
                                                                                                     final_text51.setText(userInput5.getText());
                                                                                                     final_text61.setText(userInput6.getText());
                                                                                                     final_text71.setText(userInput7.getText());
                                                                                                 }
                                                                                             }} }}}}}})
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button125 = (Button) findViewById(R.id.button172);
        final_text12 = (TextView) findViewById(R.id.button172);
        final_text22 = (TextView) findViewById(R.id.textView92);
        final_text32 = (TextView) findViewById(R.id.textView112);
        final_text42 = (TextView) findViewById(R.id.textView142);
        final_text52 = (TextView) findViewById(R.id.textView152);
        final_text62 = (TextView) findViewById(R.id.textView132);
        final_text72 = (TextView) findViewById(R.id.textView305);

        button125.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                                                                         imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText12);
                                                                         final EditText userInput2 = (EditText) promptsView.findViewById(R.id.editText1);
                                                                         final EditText userInput3 = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         final EditText userInput4 = (EditText) promptsView.findViewById(R.id.editText3);
                                                                         final EditText userInput5 = (EditText) promptsView.findViewById(R.id.editText4);
                                                                         final EditText userInput6 = (EditText) promptsView.findViewById(R.id.editText5);
                                                                         final EditText userInput7 = (EditText) promptsView.findViewById(R.id.editText41);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Нет названия КПП!", Toast.LENGTH_SHORT);


                                                                             toast.show();
                                                                             dialog.cancel();
                                                                         } else {
                                                                             if (userInput2.getText().length() == 0)
                                                                             {
                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                         "Заполните строку 1", Toast.LENGTH_SHORT);


                                                                                 toast.show();
                                                                                 dialog.cancel();
                                                                             } else {
                                                                                 if (userInput3.getText().length() == 0)
                                                                                 {
                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                             "Заполните строку 2", Toast.LENGTH_SHORT);


                                                                                     toast.show();
                                                                                     dialog.cancel();
                                                                                 } else {
                                                                                     if (userInput4.getText().length() == 0)
                                                                                     {
                                                                                         Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                 "Заполните строку 3", Toast.LENGTH_SHORT);


                                                                                         toast.show();
                                                                                         dialog.cancel();
                                                                                     } else {

                                                                                         if (userInput5.getText().length() == 0)
                                                                                         {
                                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                     "Заполните строку 4", Toast.LENGTH_SHORT);


                                                                                             toast.show();
                                                                                             dialog.cancel();
                                                                                         } else {
                                                                                             if (userInput6.getText().length() == 0)
                                                                                             {
                                                                                                 Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                         "Заполните строку Z", Toast.LENGTH_SHORT);


                                                                                                 toast.show();
                                                                                                 dialog.cancel();
                                                                                             } else {
                                                                                                 if (userInput7.getText().length() == 0)
                                                                                                 {
                                                                                                     Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                             "Заполните строку 5", Toast.LENGTH_SHORT);


                                                                                                     toast.show();
                                                                                                     dialog.cancel();
                                                                                                 } else {

                                                                                                     final_text12.setText(userInput.getText());
                                                                                                     final_text22.setText(userInput2.getText());
                                                                                                     final_text32.setText(userInput3.getText());
                                                                                                     final_text42.setText(userInput4.getText());
                                                                                                     final_text52.setText(userInput5.getText());
                                                                                                     final_text62.setText(userInput6.getText());
                                                                                                     final_text72.setText(userInput7.getText());
                                                                                                 }
                                                                                             }} }}}}}})
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );



        FloatingActionButton fab22 = (FloatingActionButton) findViewById(R.id.fab2);
        fab22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long mills = 42L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);
                Intent intent = new Intent(ResultatActivity.this, MainActivity.class);

                intent.putExtra("k11", txt_k1_1.getText().toString());
                intent.putExtra("k12", txt_k1_2.getText().toString());
                intent.putExtra("k13", txt_k1_3.getText().toString());
                intent.putExtra("k14", txt_k1_4.getText().toString());
                intent.putExtra("k15", txt_k1_5.getText().toString());
                intent.putExtra("k1z", txt_k1_z.getText().toString());

                intent.putExtra("k21", k2_1.getText().toString());
                intent.putExtra("k22", k2_2.getText().toString());
                intent.putExtra("k23", k2_3.getText().toString());
                intent.putExtra("k24", k2_4.getText().toString());
                intent.putExtra("k25", k2_5.getText().toString());
                intent.putExtra("k2z", k2_z.getText().toString());
                startActivity(intent);


                return;


            }
        });

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txt_k1_1 = (TextView) findViewById(R.id.txt_k1_1);
        txt_k1_2 = (TextView) findViewById(R.id.txt_k1_2);
        txt_k1_3 = (TextView) findViewById(R.id.txt_k1_3);
        txt_k1_4 = (TextView) findViewById(R.id.txt_k1_4);
        txt_k1_5 = (TextView) findViewById(R.id.txt_k1_5);
        txt_k1_z = (TextView) findViewById(R.id.txt_k1_z);

        k2_1 = (EditText) findViewById(R.id.k111t);
        k2_2 = (EditText) findViewById(R.id.k112t);
        k2_3 = (EditText) findViewById(R.id.k113t);
        k2_4 = (EditText) findViewById(R.id.k114t);
        k2_5 = (EditText) findViewById(R.id.k115t);
        k2_z = (EditText) findViewById(R.id.k1_zt);


        txt_k1_1.setText(getIntent().getStringExtra("k1"));
        txt_k1_2.setText(getIntent().getStringExtra("k2"));
        txt_k1_3.setText(getIntent().getStringExtra("k3"));
        txt_k1_4.setText(getIntent().getStringExtra("k4"));
        txt_k1_5.setText(getIntent().getStringExtra("k5"));
        txt_k1_z.setText(getIntent().getStringExtra("kz"));

    }

    public void onClick_nazad1(View view) {
        Intent intent = new Intent(ResultatActivity.this, StartActivity.class);
        startActivity(intent);
    }

    public void sendData2(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("k11", txt_k1_1.getText().toString());
        intent.putExtra("k12", txt_k1_2.getText().toString());
        intent.putExtra("k13", txt_k1_3.getText().toString());
        intent.putExtra("k14", txt_k1_4.getText().toString());
        intent.putExtra("k15", txt_k1_5.getText().toString());
        intent.putExtra("k1z", txt_k1_z.getText().toString());

        intent.putExtra("k21", k2_1.getText().toString());
        intent.putExtra("k22", k2_2.getText().toString());
        intent.putExtra("k23", k2_3.getText().toString());
        intent.putExtra("k24", k2_4.getText().toString());
        intent.putExtra("k25", k2_5.getText().toString());
        intent.putExtra("k2z", k2_z.getText().toString());
        startActivity(intent);
    }

    public void onClick10t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(3.49 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(2.04 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.33 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");


        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(4.71 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: м412");

    }

    public void onClick_vaz2101t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(3.75 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(2.30 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.49 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(3.87 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ВАЗ 2101");

    }

    public void onClick_gaz_51t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(6.40 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(3.09 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.69 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(7.82 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 51");

    }


    public void onClick_gaz_52_3t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(6.48 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(3.09 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.71 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(7.90 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 52-53");
    }

    public void onClick_volgat(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga1t = (TextView) findViewById(R.id.k111t);
        volga1t.setText(3.50 + "");

        TextView volga2t = (TextView) findViewById(R.id.k112t);
        volga2t.setText(2.26 + "");

        TextView volga3t = (TextView) findViewById(R.id.k113t);
        volga3t.setText(1.45 + "");

        TextView volga4t = (TextView) findViewById(R.id.k114t);
        volga4t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_zt = (TextView) findViewById(R.id.k1_zt);
        volga_zt.setText(3.54 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Волга 2410");
    }

    public void onClick_vaz2108t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga11t = (TextView) findViewById(R.id.k111t);
        volga11t.setText(3.63 + "");

        TextView volga12t = (TextView) findViewById(R.id.k112t);
        volga12t.setText(1.95 + "");

        TextView volga13t = (TextView) findViewById(R.id.k113t);
        volga13t.setText(1.35 + "");

        TextView volga14t = (TextView) findViewById(R.id.k114t);
        volga14t.setText(0.94 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_1zt = (TextView) findViewById(R.id.k1_zt);
        volga_1zt.setText(3.53 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ВАЗ 2108");
    }

    public void onClick_vaz_okat(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga111t = (TextView) findViewById(R.id.k111t);
        volga111t.setText(3.70 + "");

        TextView volga112t = (TextView) findViewById(R.id.k112t);
        volga112t.setText(2.06 + "");

        TextView volga113t = (TextView) findViewById(R.id.k113t);
        volga113t.setText(1.27 + "");

        TextView volga114t = (TextView) findViewById(R.id.k114t);
        volga114t.setText(0.90 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_11zt = (TextView) findViewById(R.id.k1_zt);
        volga_11zt.setText(3.67 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Ока");
    }

    public void onClick_uralt(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga1111t = (TextView) findViewById(R.id.k111t);
        volga1111t.setText(3.60 + "");

        TextView volga1112t = (TextView) findViewById(R.id.k112t);
        volga1112t.setText(2.28 + "");

        TextView volga1113t = (TextView) findViewById(R.id.k113t);
        volga1113t.setText(1.56 + "");

        TextView volga1114t = (TextView) findViewById(R.id.k114t);
        volga1114t.setText(1.19 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_111zt = (TextView) findViewById(R.id.k1_zt);
        volga_111zt.setText(4.20 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Мото Урал");
    }

    public void onClick_uazt(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga2111t = (TextView) findViewById(R.id.k111t);
        volga2111t.setText(3.78 + "");

        TextView volga2112t = (TextView) findViewById(R.id.k112t);
        volga2112t.setText(2.60 + "");

        TextView volga2113t = (TextView) findViewById(R.id.k113t);
        volga2113t.setText(1.55 + "");

        TextView volga2114t = (TextView) findViewById(R.id.k114t);
        volga2114t.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_211zt = (TextView) findViewById(R.id.k1_zt);
        volga_211zt.setText(4.12 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: УАЗ");
    }

    public void onClick_uaz_rkt(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga21112t = (TextView) findViewById(R.id.k111t);
        volga21112t.setText(1.94 + "");

        TextView volga21122t = (TextView) findViewById(R.id.k112t);
        volga21122t.setText(1.0 + "");

        TextView volga21132t = (TextView) findViewById(R.id.k113t);
        volga21132t.setText(1.0 + "");

        TextView volga21142t = (TextView) findViewById(R.id.k114t);
        volga21142t.setText(1.0 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_211z2t = (TextView) findViewById(R.id.k1_zt);
        volga_211z2t.setText(1.0 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: РК УАЗ");
    }

    public void onClick_niva_rkt(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView niva121112t = (TextView) findViewById(R.id.k111t);
        niva121112t.setText(2.13 + "");

        TextView niva121122t = (TextView) findViewById(R.id.k112t);
        niva121122t.setText(1.2 + "");

        TextView niva121132t = (TextView) findViewById(R.id.k113t);
        niva121132t.setText(1.0 + "");

        TextView niva121142t = (TextView) findViewById(R.id.k114t);
        niva121142t.setText(1.0 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView niva_1211z2t = (TextView) findViewById(R.id.k1_zt);
        niva_1211z2t.setText(1.0 + "");

        TextView nivavibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        nivavibor_1t.setText("Вторая КПП: РК Нива");
    }

    public void onClick_gaz69t(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView volga1121112t = (TextView) findViewById(R.id.k111t);
        volga1121112t.setText(3.11 + "");

        TextView volga1121122t = (TextView) findViewById(R.id.k112t);
        volga1121122t.setText(1.8 + "");

        TextView volga1121132t = (TextView) findViewById(R.id.k113t);
        volga1121132t.setText(1.0 + "");

        TextView volga1121142t = (TextView) findViewById(R.id.k114t);
        volga1121142t.setText(1.0 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView volga_11211z2t = (TextView) findViewById(R.id.k1_zt);
        volga_11211z2t.setText(3.74 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 69");
    }

    public void onClick_m408_8(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView oka8 = (TextView) findViewById(R.id.k111t);
        oka8.setText(3.81 + "");

        TextView oka82 = (TextView) findViewById(R.id.k112t);
        oka82.setText(2.42 + "");

        TextView oka83 = (TextView) findViewById(R.id.k113t);
        oka83.setText(1.45 + "");

        TextView oka84 = (TextView) findViewById(R.id.k114t);
        oka84.setText(1.0 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView oka85 = (TextView) findViewById(R.id.k1_zt);
        oka85.setText(4.71 + "");

        TextView oka86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        oka86.setText("Вторая КПП: М408");
    }

    public void onClick_net_kpp(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView zaz8 = (TextView) findViewById(R.id.k111t);
        zaz8.setText(1.0 + "");

        TextView zaz82 = (TextView) findViewById(R.id.k112t);
        zaz82.setText(1.0 + "");

        TextView zaz83 = (TextView) findViewById(R.id.k113t);
        zaz83.setText(1.0 + "");

        TextView zaz84 = (TextView) findViewById(R.id.k114t);
        zaz84.setText(1.0 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView zaz85 = (TextView) findViewById(R.id.k1_zt);
        zaz85.setText(1.0 + "");

        TextView zaz86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        zaz86.setText("Второй КПП: Нет");
    }

    public void onClick_golf_82(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView golf8 = (TextView) findViewById(R.id.k111t);
        golf8.setText(3.45 + "");

        TextView golf82 = (TextView) findViewById(R.id.k112t);
        golf82.setText(1.94 + "");

        TextView golf83 = (TextView) findViewById(R.id.k113t);
        golf83.setText(1.28 + "");

        TextView golf84 = (TextView) findViewById(R.id.k114t);
        golf84.setText(0.90 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(0.74 + "");

        TextView golf85 = (TextView) findViewById(R.id.k1_zt);
        golf85.setText(3.66 + "");

        TextView golf86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        golf86.setText("Вторая КПП: Golf 2");
    }

    public void onClick_mers8(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView mers8 = (TextView) findViewById(R.id.k111t);
        mers8.setText(3.82 + "");

        TextView mers82 = (TextView) findViewById(R.id.k112t);
        mers82.setText(2.19 + "");

        TextView mers83 = (TextView) findViewById(R.id.k113t);
        mers83.setText(1.39 + "");

        TextView mers84 = (TextView) findViewById(R.id.k114t);
        mers84.setText(1.00 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(0.81 + "");

        TextView mers85 = (TextView) findViewById(R.id.k1_zt);
        mers85.setText(3.70 + "");

        TextView mers86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        mers86.setText("Вторая КПП: Mercedes");
    }

    public void onClick_zaz966_2(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView golf8 = (TextView) findViewById(R.id.k111t);
        golf8.setText(3.73 + "");

        TextView golf82 = (TextView) findViewById(R.id.k112t);
        golf82.setText(2.29 + "");

        TextView golf83 = (TextView) findViewById(R.id.k113t);
        golf83.setText(1.39 + "");

        TextView golf84 = (TextView) findViewById(R.id.k114t);
        golf84.setText(0.96 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView golf85 = (TextView) findViewById(R.id.k1_zt);
        golf85.setText(4.12 + "");

        TextView golf86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        golf86.setText("Вторая КПП: ЗАЗ 966");

        /// 1п.: 3.73:1
        /// 2п.: 2.29:1
        ///  3п.: 1.39:1
        ///  4п.: 0.96:1
    }

    public void onClick_zaz_968m(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView golf8 = (TextView) findViewById(R.id.k111t);
        golf8.setText(3.8 + "");

        TextView golf82 = (TextView) findViewById(R.id.k112t);
        golf82.setText(2.12 + "");

        TextView golf83 = (TextView) findViewById(R.id.k113t);
        golf83.setText(1.4 + "");

        TextView golf84 = (TextView) findViewById(R.id.k114t);
        golf84.setText(0.96 + "");

        TextView kppM412_5t = (TextView) findViewById(R.id.k115t);
        kppM412_5t.setText(1.00 + "");

        TextView golf85 = (TextView) findViewById(R.id.k1_zt);
        golf85.setText(4.12 + "");

        TextView golf86 = (TextView) findViewById(R.id.vibor_2_kpp2);
        golf86.setText("Вторая КПП: ЗАЗ 968М");
    }
    public void onClick_new1(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView zaz = (TextView) findViewById(R.id.k111t);
        TextView textView001 = (TextView) findViewById(R.id.textView9);
        float num001 = Float.parseFloat(textView001.getText().toString());
        float w = num001;
        zaz.setText(String.format(Locale.US, "%.2f", w) + "");


        TextView zaz2 = (TextView) findViewById(R.id.k112t);
        TextView textView002 = (TextView) findViewById(R.id.textView11);
        float num002 = Float.parseFloat(textView002.getText().toString());
        float w2 = num002;
        zaz2.setText(String.format(Locale.US, "%.2f", w2) + "");

        TextView zaz3 = (TextView) findViewById(R.id.k113t);
        TextView textView003 = (TextView) findViewById(R.id.textView14);
        float num003 = Float.parseFloat(textView003.getText().toString());
        float w3 = num003;
        zaz3.setText(String.format(Locale.US, "%.2f", w3) + "");

        TextView zaz4 = (TextView) findViewById(R.id.k114t);
        TextView textView004 = (TextView) findViewById(R.id.textView15);
        float num004 = Float.parseFloat(textView004.getText().toString());
        float w4 = num004;
        zaz4.setText(String.format(Locale.US, "%.2f", w4) + "");

        TextView zaz7 = (TextView) findViewById(R.id.k115t);
        TextView textView007 = (TextView) findViewById(R.id.textView105);
        float num007 = Float.parseFloat(textView007.getText().toString());
        float w7 = num007;
        zaz7.setText(String.format(Locale.US, "%.2f", w7) + "");

        TextView zaz5 = (TextView) findViewById(R.id.k1_zt);
        TextView textView005 = (TextView) findViewById(R.id.textView13);
        float num005 = Float.parseFloat(textView005.getText().toString());
        float w5 = num005;
        zaz5.setText(String.format(Locale.US, "%.2f", w5) + "");

        TextView zaz6 = (TextView) findViewById(R.id.vibor_2_kpp2);
        TextView textView006 = (TextView) findViewById(R.id.button170);
        String num006 = new String(textView006.getText().toString());
        String w6 = num006;
        zaz6.setText("Вторая КПП: " + w6);

    }
    public void onClick_new2(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView zaz = (TextView) findViewById(R.id.k111t);
        TextView textView001 = (TextView) findViewById(R.id.textView91);
        float num001 = Float.parseFloat(textView001.getText().toString());
        float w = num001;
        zaz.setText(String.format(Locale.US, "%.2f", w) + "");


        TextView zaz2 = (TextView) findViewById(R.id.k112t);
        TextView textView002 = (TextView) findViewById(R.id.textView111);
        float num002 = Float.parseFloat(textView002.getText().toString());
        float w2 = num002;
        zaz2.setText(String.format(Locale.US, "%.2f", w2) + "");

        TextView zaz3 = (TextView) findViewById(R.id.k113t);
        TextView textView003 = (TextView) findViewById(R.id.textView141);
        float num003 = Float.parseFloat(textView003.getText().toString());
        float w3 = num003;
        zaz3.setText(String.format(Locale.US, "%.2f", w3) + "");

        TextView zaz4 = (TextView) findViewById(R.id.k114t);
        TextView textView004 = (TextView) findViewById(R.id.textView151);
        float num004 = Float.parseFloat(textView004.getText().toString());
        float w4 = num004;
        zaz4.setText(String.format(Locale.US, "%.2f", w4) + "");

        TextView zaz7 = (TextView) findViewById(R.id.k115t);
        TextView textView007 = (TextView) findViewById(R.id.textView205);
        float num007 = Float.parseFloat(textView007.getText().toString());
        float w7 = num007;
        zaz7.setText(String.format(Locale.US, "%.2f", w7) + "");

        TextView zaz5 = (TextView) findViewById(R.id.k1_zt);
        TextView textView005 = (TextView) findViewById(R.id.textView131);
        float num005 = Float.parseFloat(textView005.getText().toString());
        float w5 = num005;
        zaz5.setText(String.format(Locale.US, "%.2f", w5) + "");

        TextView zaz6 = (TextView) findViewById(R.id.vibor_2_kpp2);
        TextView textView006 = (TextView) findViewById(R.id.button171);
        String num006 = new String(textView006.getText().toString());
        String w6 = num006;
        zaz6.setText("Вторая КПП: " + w6);

    }
    public void onClick_new3(View view) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        TextView zaz = (TextView) findViewById(R.id.k111t);
        TextView textView001 = (TextView) findViewById(R.id.textView92);
        float num001 = Float.parseFloat(textView001.getText().toString());
        float w = num001;
        zaz.setText(String.format(Locale.US, "%.2f", w) + "");


        TextView zaz2 = (TextView) findViewById(R.id.k112t);
        TextView textView002 = (TextView) findViewById(R.id.textView112);
        float num002 = Float.parseFloat(textView002.getText().toString());
        float w2 = num002;
        zaz2.setText(String.format(Locale.US, "%.2f", w2) + "");

        TextView zaz3 = (TextView) findViewById(R.id.k113t);
        TextView textView003 = (TextView) findViewById(R.id.textView142);
        float num003 = Float.parseFloat(textView003.getText().toString());
        float w3 = num003;
        zaz3.setText(String.format(Locale.US, "%.2f", w3) + "");

        TextView zaz4 = (TextView) findViewById(R.id.k114t);
        TextView textView004 = (TextView) findViewById(R.id.textView152);
        float num004 = Float.parseFloat(textView004.getText().toString());
        float w4 = num004;
        zaz4.setText(String.format(Locale.US, "%.2f", w4) + "");

        TextView zaz7 = (TextView) findViewById(R.id.k115t);
        TextView textView007 = (TextView) findViewById(R.id.textView305);
        float num007 = Float.parseFloat(textView007.getText().toString());
        float w7 = num007;
        zaz7.setText(String.format(Locale.US, "%.2f", w7) + "");

        TextView zaz5 = (TextView) findViewById(R.id.k1_zt);
        TextView textView005 = (TextView) findViewById(R.id.textView132);
        float num005 = Float.parseFloat(textView005.getText().toString());
        float w5 = num005;
        zaz5.setText(String.format(Locale.US, "%.2f", w5) + "");

        TextView zaz6 = (TextView) findViewById(R.id.vibor_2_kpp2);
        TextView textView006 = (TextView) findViewById(R.id.button172);
        String num006 = new String(textView006.getText().toString());
        String w6 = num006;
        zaz6.setText("Вторая КПП: " + w6);

    }

    void saveText1() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText1.getText().toString());
        ed.commit();
    }
    void loadText1() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText1.setText(savedText);
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
    void saveText11() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }
    void saveText12() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT12, etText12.getText().toString());
        ed.commit();
    }
    void loadText12() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT12, "");
        etText12.setText(savedText);
    }
    void saveText13() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT13, etText13.getText().toString());
        ed.commit();
    }
    void loadText13() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT13, "");
        etText13.setText(savedText);
    }
    void saveText14() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT14, etText14.getText().toString());
        ed.commit();
    }
    void loadText14() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT14, "");
        etText14.setText(savedText);
    }
    void saveText15() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT15, etText15.getText().toString());
        ed.commit();
    }
    void loadText15() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT15, "");
        etText15.setText(savedText);
    }
    void saveText16() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT16, etText16.getText().toString());
        ed.commit();
    }
    void loadText16() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT16, "");
        etText16.setText(savedText);
    }
    void saveText17() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT17, etText17.getText().toString());
        ed.commit();
    }
    void loadText17() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT17, "");
        etText17.setText(savedText);
    }
    void saveText18() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT18, etText18.getText().toString());
        ed.commit();
    }
    void loadText18() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT18, "");
        etText18.setText(savedText);
    }
    void saveText19() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT19, etText19.getText().toString());
        ed.commit();
    }
    void loadText19() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT19, "");
        etText19.setText(savedText);
    }
    void saveText20() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT20, etText20.getText().toString());
        ed.commit();
    }
    void loadText20() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT20, "");
        etText20.setText(savedText);
    }
    void saveText21() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT21, etText21.getText().toString());
        ed.commit();
    }
    void loadText21() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT21, "");
        etText21.setText(savedText);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        saveText1();
        saveText2();
        saveText3();
        saveText4();
        saveText5();

        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();

        saveText11();
        saveText12();
        saveText13();
        saveText14();
        saveText15();

        saveText16();
        saveText17();
        saveText18();
        saveText19();
        saveText20();
        saveText21();





    }
}


