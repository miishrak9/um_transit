package my.edu.um.fsktm.driveractivity;

import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class editCarDetails extends AppCompatActivity {

    private TextView textViewCarModel;
    private TextView textViewCarPlate;
    private TextView textViewCarColor;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_car_details);

        textViewCarModel = (TextView) findViewById(R.id.textView_car_model);
        textViewCarPlate = (TextView) findViewById(R.id.textView_car_plate);
        textViewCarColor = (TextView) findViewById(R.id.textView_car_color);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

        public void openDialog(){

        }

        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.action_settings);
        setSupportActionBar(myChildToolbar);


        ActionBar ab = getSupportActionBar();

       ab.setDisplayHomeAsUpEnabled(true);
    }
}
