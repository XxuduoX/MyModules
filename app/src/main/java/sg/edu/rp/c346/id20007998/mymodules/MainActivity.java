package sg.edu.rp.c346.id20007998.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView module1;
    TextView module2;
    TextView module3;
    TextView module4;
    TextView module5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        module1=findViewById(R.id.module1);
        module2=findViewById(R.id.module2);
        module3=findViewById(R.id.module3);
        module4=findViewById(R.id.module4);
        module5=findViewById(R.id.module5);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C206");
                i.putExtra("name", "Software Development Process");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("credit", 4);
                i.putExtra("venue", "W67M");

                startActivity(i);
            }
        });


        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C235");
                i.putExtra("name", "IT Security and Management");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("credit", 4);
                i.putExtra("venue", "W67M");

                startActivity(i);
            }
        });

        module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C203");
                i.putExtra("name", "Web Appln Development in php");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("credit", 4);
                i.putExtra("venue", "W67M");

                startActivity(i);
            }
        });

        module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C346");
                i.putExtra("name", "Mobile App Development");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("credit", 4);
                i.putExtra("venue", "E62E");

                startActivity(i);
            }
        });

        module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C218");
                i.putExtra("name", "UI/UX Design for Apps");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("credit", 4);
                i.putExtra("venue", "W64G");

                startActivity(i);
            }
        });



    }
}