package jp.suntech.s22029.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClearResi = findViewById(R.id.btClearResi);
        btClearResi.setOnClickListener(listener);

        Button btClearName = findViewById(R.id.btClearName);
        btClearName.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText input_resi = findViewById(R.id.etResi);
            EditText input_name = findViewById(R.id.etName);
            int id = v.getId();
            if(id == R.id.btClick){
                String resi = input_resi.getText().toString();
                String name = input_name.getText().toString();
                String show = resi + "にお住いの" + name + "さん、こんにちは！";
                Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();
            }
            else if(id == R.id.btClearResi){
                input_resi.setText("");
            }
            else if(id == R.id.btClearName){
                input_name.setText("");
            }

        }
    }
}