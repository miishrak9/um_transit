package my.edu.um.fsktm.driveractivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class SearchingForPassengers extends AppCompatActivity {

    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching_for_passengers);


        ImageView loading = (ImageView)findViewById(R.id.imageView);
        animation = (AnimationDrawable)loading.getDrawable();

    }


    public void start(View v){

        animation.start();
    }

    public void stop(View v){

        animation.stop();
    }
}

