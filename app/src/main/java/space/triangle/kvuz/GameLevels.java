package space.triangle.kvuz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //команда для кнопки

                //начало конструкции
                try {
                    //создать намерение перейти из текущего в главный
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    //совершить событие, закрыть старую активити
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
                //конец конструкции
            }
        });


        //Кнопка перехода на первый уровень - начало
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                     Intent intent = new Intent(GameLevels.this, Level1.class);
                     startActivity(intent);finish();
                } catch (Exception e) {
                    //empty
                }
            }
        });
        //Кнопка перехода на первый уровень - конец

        //Кнопка перехода на второй уровень - начало
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                    //empty
                }
            }
        });
        //Кнопка перехода на второй уровень - конец

    }

    //Сист. кнопка "Назад" - начало
    @Override
    public void onBackPressed() {
        try {
            //создать намерение перейти из текущего в главный
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            //совершить событие, закрыть старую активити
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //Сист. кнопка "Назад" - конец
}