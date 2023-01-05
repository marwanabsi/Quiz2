package edu.birzeit.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText nameText;
    private EditText SlaryText;
    private ListView listView;
    private Spinner spinner;
    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defin();
        clickAdd();
    }



    private void defin() {
        nameText = findViewById(R.id.nameText);
        SlaryText = findViewById(R.id.salaryText);
        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        buttonAdd = findViewById(R.id.buttonAdd);

        ArrayList<String> Status = new ArrayList<String>();
        Status.add("Part Time ");
        Status.add("Full Time ");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, Status );
        spinner.setAdapter(adapter);

    }
    private void clickAdd() {
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!nameText.equals("") && !SlaryText.equals("")){

                    String statues = spinner.getSelectedItem().toString();

                    Employee employee = new Employee(nameText.getText().toString(),
                            SlaryText.getText().toString(),
                            statues
                            );

                    ArrayList<String> r2 = new ArrayList<String>() ;

                    r2.add(employee.toString());
                    ArrayAdapter<String> ad2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item,r2
                    );
                    listView.setAdapter(ad2);

                }

                else
                    Toast.makeText(MainActivity.this,"Please Enter Data ",Toast.LENGTH_SHORT).show();
            }
        });
    }


}