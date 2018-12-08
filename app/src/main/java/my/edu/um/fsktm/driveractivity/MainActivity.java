package my.edu.um.fsktm.driveractivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;
    AnimationDrawable animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.TB);
        setSupportActionBar(myToolbar);



        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openSearchingFOrPassengers();
            }
        });
    }


    public  void openSearchingFOrPassengers(){

        Intent intent = new Intent(this, SearchingForPassengers.class);
        startActivity(intent);
    }



    @Override

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu) ;

    }


    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.action_settings:
                Intent editcar = new Intent(this, DetailsEdit.class);

                startActivity(editcar);
                // Edit Car
                break;

            case R.id.stats:

                Intent stats = new Intent(this, Statistics.class);

                startActivity(stats);

                // Statistics
                break;

            case  R.id.feedback:

                Intent feedbc = new Intent(this, feedback.class);

                startActivity(feedbc);

                // Feedback

                break;

            default:


        }



        return super.onOptionsItemSelected(item);


    }


}
