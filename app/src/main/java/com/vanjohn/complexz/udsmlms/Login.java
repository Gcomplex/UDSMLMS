package com.vanjohn.complexz.udsmlms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button etblogin;
    EditText etpassword,etusername;
    TextView etRegisterLink;
    UserlocalStore userlocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etblogin=(Button) findViewById(R.id.etblogin);
        etpassword=(EditText) findViewById(R.id.etpassword);
        etusername=(EditText) findViewById(R.id.etusername);
        etRegisterLink=(TextView)findViewById(R.id.etRegisterLink);

        etblogin.setOnClickListener(this);
        etRegisterLink.setOnClickListener(this);
        userlocalStore=new UserlocalStore(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.etblogin:
                startActivity(new Intent(this,navigation.class));
                break;
            case R.id.etRegisterLink:

                userlocalStore.setUserloggedin(true);
               // userlocalStore.storeuserdata(user);
                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}
