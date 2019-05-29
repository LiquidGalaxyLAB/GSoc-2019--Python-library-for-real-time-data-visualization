package gsoc.mihaela.claudia.diosan.gsoc_2019_python_library_for_real_time_data_visualization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccountActivity extends AppCompatActivity {

    Button btnBack;
    Button btnRegisterAsDonor;
    Button btnRegisterAsVolunteer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnBack = (Button) findViewById(R.id.btn_back);
        btnRegisterAsDonor = (Button) findViewById(R.id.register_as_donor_button);
        btnRegisterAsVolunteer = (Button) findViewById(R.id.register_as_volunteer_button);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnRegisterAsDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CreateAccountActivity.this, RegisterAsDonorActivity.class);
                startActivity(intent1);
            }
        });

        btnRegisterAsVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CreateAccountActivity.this, RegisterAsVolunteerActivity.class);
                startActivity(intent1);
            }
        });
    }

}
