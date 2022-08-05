package com.example.pictproba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    public class ekran2{
        ImageView my1= findViewById(R.id.imageView3);
        ImageView my2= findViewById(R.id.imageView4);
        ImageView my3=findViewById(R.id.imageView5);
        ImageView[]display={my1,my2,my3};
        public ImageView[] getDisp(){
            return display;
        }
    }


    //public ImageView ekran[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


public void MyClick(View view){
    ekran2 myekran=new ekran2();

   ImageView iuu[]= myekran.getDisp();
   iuu[2].setImageResource(R.drawable.shest);



}
//31.07.2022Короче пока идея массива из объектов ImageView до конца не оформлена))Пока ничего не работает и нихрена непонятно
//01.08.2022 В общем ,сегодня выяснил одну интересную вещь,оказывается метод findviewbyid это метод класса Activity
    //именно поэтому я и не мог вот так запросто взять и вызвать его в созданном мною классе...до тех пор,пока не сделал
    //свой класс наследником Activity и после этого процесс пошёл))

    //02.08.2022 Выяснилось еще много интересного))При попытке запустить метод созданного мной класса наследника программа
    //вылетает,причём она вылетает,даже если в процедуре кнопки я создаю просто экземпляр моего класса,даже не вызывая метод.
    //проблему я решил так:создал мой класс прямо внутри класса MainActivity,пока могу сказать ,что при создании объекта
    //и при вызове его метода вылетать перестало.Уже прогресс))

    //05.08.2022 В общем необходимо как то создать методы управления моим массивом объектов,наподобие управления
    //символами в строке,по аналогии с моим калькулятором.С чего начать?Наверное с последовательного заполнения массива
    //одним значением по мере нажатия кнопки...
}