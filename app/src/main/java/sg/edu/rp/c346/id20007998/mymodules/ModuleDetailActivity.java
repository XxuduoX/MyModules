package sg.edu.rp.c346.id20007998.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvCode=findViewById(R.id.moduleCode);
        tvName=findViewById(R.id.moduleName);
        tvYear=findViewById(R.id.academicYear);
        tvSem=findViewById(R.id.semester);
        tvCredit=findViewById(R.id.moduleCredit);
        tvVenue=findViewById(R.id.venue);
        btnBack=findViewById(R.id.Back);

        Intent intendRecieved=getIntent();
        String code=intendRecieved.getStringExtra("code");
        tvCode.setText("Module Code: "+code);

        String name=intendRecieved.getStringExtra("name");
        tvName.setText("Module Name: "+name);

        int year=intendRecieved.getIntExtra("year",0);
        tvYear.setText("Academic Year: "+year);

        int sem=intendRecieved.getIntExtra("sem",0);
        tvSem.setText("Semester: "+sem);

        int credit=intendRecieved.getIntExtra("credit",0);
        tvCredit.setText("Module Credit: "+credit);

        String venue=intendRecieved.getStringExtra("venue");
        tvVenue.setText("Venue: "+venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}