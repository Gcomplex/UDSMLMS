package com.vanjohn.complexz.udsmlms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity  implements View.OnClickListener{
    Button etbregister;
    EditText etpassword, etusername, etage,etname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etbregister=(Button) findViewById(R.id.etbregister);
        etage=(EditText) findViewById(R.id.etage);
        etname=(EditText)findViewById(R.id.etname);
        etusername=(EditText)findViewById(R.id.etusername);
        etpassword=(EditText) findViewById(R.id.etpassword);

        etbregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.etbregister:
                String name=etname.getText().toString();
                String username=etusername.getText().toString();
                String password=etpassword.getText().toString();
                int age=Integer.parseInt(etage.getText().toString());

                User registerData= new User(username,name,password,age);

                break;
        }
    }
}
