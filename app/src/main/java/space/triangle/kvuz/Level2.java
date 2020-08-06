package space.triangle.kvuz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Level2 extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal1);

        //скрытие панели состояния на экране
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //кнопка - назад
        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //команда для кнопки

                //начало конструкции
                try {
                    //создать намерение перейти из текущего в главный
                    Intent intent = new Intent(Level2.this, GameLevels.class);
                    //совершить событие, закрыть старую активити
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
                //конец конструкции
            }
        });

    }



    //Сист. кнопка "Назад" - начало
    @Override
    public void onBackPressed() {
        try {
            //создать намерение перейти из текущего в главный
            Intent intent = new Intent(Level2.this, GameLevels.class);
            //совершить событие, закрыть старую активити
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //Сист. кнопка "Назад" - конец
}
