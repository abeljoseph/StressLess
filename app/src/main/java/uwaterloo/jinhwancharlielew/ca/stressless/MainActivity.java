package uwaterloo.jinhwancharlielew.ca.stressless;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        Intent secondPageIntent = new Intent(this, Main2Activity.class);
        startActivity(secondPageIntent);
    }

}
