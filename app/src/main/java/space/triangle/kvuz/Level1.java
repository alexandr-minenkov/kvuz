package space.triangle.kvuz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level1 extends AppCompatActivity{
    //--------------------------------------------------------------------------------------------------
    Dialog dialog;
    //--------------------------------------------------------------------------------------------------
    int gamePoints = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);
        List<Integer> mImageResources = new ArrayList<>();
        List<Integer> mPointsResources = new ArrayList<>();
        mImageResources.add(R.drawable.as);
        mImageResources.add(R.drawable.ay);
        mImageResources.add(R.drawable.bargy);
        mImageResources.add(R.drawable.belgyt);
        mImageResources.add(R.drawable.bgaa);
        mImageResources.add(R.drawable.bgai);
        mImageResources.add(R.drawable.bgam);
        mImageResources.add(R.drawable.bgaty);
        mImageResources.add(R.drawable.bgey);
        mImageResources.add(R.drawable.bgmy);
        mImageResources.add(R.drawable.bgpy);
        mImageResources.add(R.drawable.bgty);
        mImageResources.add(R.drawable.bguir);
        mImageResources.add(R.drawable.bguki);
        mImageResources.add(R.drawable.bgy);
        mImageResources.add(R.drawable.bgyfk);
        mImageResources.add(R.drawable.bnty);
        mImageResources.add(R.drawable.brgty);
        mImageResources.add(R.drawable.brgy);
        mImageResources.add(R.drawable.bry);
        mImageResources.add(R.drawable.ggay);
        mImageResources.add(R.drawable.ggmy);
        mImageResources.add(R.drawable.ggty);
        mImageResources.add(R.drawable.ggy);
        mImageResources.add(R.drawable.grgmy);
        mImageResources.add(R.drawable.grgy);
        mImageResources.add(R.drawable.ipd);
        mImageResources.add(R.drawable.mgey);
        mImageResources.add(R.drawable.mgly);
        mImageResources.add(R.drawable.mgpy);
        mImageResources.add(R.drawable.mgy);
        mImageResources.add(R.drawable.mitso);
        mImageResources.add(R.drawable.pgy);
        mImageResources.add(R.drawable.polesgy);
        mImageResources.add(R.drawable.vgavm);
        mImageResources.add(R.drawable.vgmy);
        mImageResources.add(R.drawable.vgty);
        mImageResources.add(R.drawable.vgy);

        mPointsResources.add(188);
        mPointsResources.add(341);
        mPointsResources.add(252);
        mPointsResources.add(231);
        mPointsResources.add(254);
        mPointsResources.add(303);
        mPointsResources.add(257);
        mPointsResources.add(190);
        mPointsResources.add(307);
        mPointsResources.add(341);
        mPointsResources.add(279);
        mPointsResources.add(258);
        mPointsResources.add(339);
        mPointsResources.add(294);
        mPointsResources.add(322);
        mPointsResources.add(249);
        mPointsResources.add(256);
        mPointsResources.add(264);
        mPointsResources.add(283);
        mPointsResources.add(242);
        mPointsResources.add(199);
        mPointsResources.add(323);
        mPointsResources.add(255);
        mPointsResources.add(274);
        mPointsResources.add(319);
        mPointsResources.add(281);
        mPointsResources.add(188);
        mPointsResources.add(269);
        mPointsResources.add(341);
        mPointsResources.add(256);
        mPointsResources.add(253);
        mPointsResources.add(222);
        mPointsResources.add(251);
        mPointsResources.add(270);
        mPointsResources.add(214);
        mPointsResources.add(350);
        mPointsResources.add(247);
        mPointsResources.add(275);
        Level1Func(mImageResources, mPointsResources);
        //скрытие панели состояния на экране
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//--------------------------------------------------------------------------------------------------
        //Вызов начального диалогового окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //прозрачный фон диалогового окна
        dialog.setCancelable(false);

        //кнопка закрытия диалог. окна - начало
        TextView btnclose = (TextView)dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent); finish();
                } catch (Exception e) {

                }

                dialog.dismiss(); //закрытие диалог. окна
            }
        });
        //кнопка закрытия диалог. окна - конец

        //кнопка "продолжить" для диалог. окна
        Button btncontinue = (Button)dialog.findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); //закрытие диалог. окна
            }
        });
        dialog.show();

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //команда для кнопки

                //начало конструкции
                try {
                    //создать намерение перейти из текущего в главный
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    //совершить событие, закрыть старую активити
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
                //конец конструкции
            }
        });
//--------------------------------------------------------------------------------------------------
    }

    public void Level1Func(final List<Integer> mImageResources, final List<Integer> mPointsResources){
        Random mRandom = new Random();
        final ImageButton mRndViewLeft, mRndViewRight;

        final TextView level;
        level = (TextView)findViewById(R.id.text_level);
        level.setText("Уровень: 1");

        final TextView Points, GamePointsView;
        final int randomPoints = (int)(Math.random()*(340 - 190) + 190);
        Points = (TextView)findViewById(R.id.text_mark);
        Points.setText("Балл\n" + randomPoints);
        GamePointsView = (TextView)findViewById(R.id.text_points);
        GamePointsView.setText("Очки: " + gamePoints);
        int randomResource;

        do{
            randomResource = mRandom.nextInt(mImageResources.size());
        }while(mPointsResources.get(randomResource) == randomPoints);
        mRndViewLeft = (ImageButton)findViewById(R.id.imageButton);
        mRndViewLeft.setImageResource(mImageResources.get(randomResource));

        final int leftPoints = mPointsResources.get(randomResource);

        if(mPointsResources.get(randomResource) > randomPoints){
            do{
                randomResource = mRandom.nextInt(mImageResources.size());
            }while (mPointsResources.get(randomResource) >= randomPoints);
        }
        else {
            do{
                randomResource = mRandom.nextInt(mImageResources.size());
            }while (mPointsResources.get(randomResource) <= randomPoints);
        }

        mRndViewRight = (ImageButton)findViewById(R.id.imageButton2);
        mRndViewRight.setImageResource(mImageResources.get(randomResource));

        final int rightPoints = mPointsResources.get(randomResource);

        View.OnClickListener oMyButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButton: {

                        //сделать визуал реакцию на ответ
                        if(leftPoints <= randomPoints) {
                            gamePoints = gamePoints + 2;
                        }
                        else {
                            if (gamePoints != 0) {
                                --gamePoints;
                            }
                        }
                        if(gamePoints < 10){
                            Level1Func(mImageResources, mPointsResources);
                        }
                        else{
                            createOneButtonAlertDialog("Поздравляю! 1-й уровень пройден)");
                        }

                    } break;
                    case R.id.imageButton2: {
                        //сделать визуал реакцию на ответ
                        if(rightPoints <= randomPoints) {
                            gamePoints = gamePoints + 2;
                        }
                        else {
                            if (gamePoints != 0) {
                                --gamePoints;
                            }
                        }
                        if(gamePoints < 10){
                            Level1Func(mImageResources, mPointsResources);
                        }
                        else{
                            createOneButtonAlertDialog("Поздравляю! 1-й уровень пройден)");
                        }

                    } break;
                }
            }
        };

        mRndViewLeft.setOnClickListener(oMyButton);
        mRndViewRight.setOnClickListener(oMyButton);

    }

    private void createOneButtonAlertDialog(/*String title, */String content) {
        // объект Builder для создания диалогового окна
        AlertDialog.Builder builder = new AlertDialog.Builder(Level1.this);
        /*// добавляем различные компоненты в диалоговое окно
        builder.setTitle(title);*/
        builder.setMessage(content);
        // устанавливаем кнопку, которая отвечает за позитивный ответ
        builder.setPositiveButton("OK",
                // устанавливаем слушатель
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        // по нажатию создаем всплывающее окно с типом нажатой конпки
                        /*showMessage("Переход на новый уровень");*/
                    }
                });
        // объект Builder создал диалоговое окно и оно готово появиться на экране
        // вызываем этот метод, чтобы показать AlertDialog на экране пользователя
        builder.show();

    }

    /*private void showMessage(String textInMessage) {
        Toast.makeText(getApplicationContext(), textInMessage, Toast.LENGTH_LONG).show();
    }*/

    //Сист. кнопка "Назад" - начало
    @Override
    public void onBackPressed() {
        try {
            //создать намерение перейти из текущего в главный
            Intent intent = new Intent(Level1.this, GameLevels.class);
            //совершить событие, закрыть старую активити
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //Сист. кнопка "Назад" - конец

}