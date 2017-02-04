package misao.inputnameanddisplayintoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View v)
    {
        EditText et_name = (EditText)findViewById(R.id.et_name);

        String name = et_name.getText().toString();

        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();
    }
}
