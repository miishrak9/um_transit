package my.edu.um.fsktm.driveractivity;

import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class editCarDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_car_details);
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.action_settings);
        setSupportActionBar(myChildToolbar);


        ActionBar ab = getSupportActionBar();

       ab.setDisplayHomeAsUpEnabled(true);
    }
}
