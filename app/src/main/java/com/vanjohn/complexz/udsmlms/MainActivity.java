package com.vanjohn.complexz.udsmlms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button etblogout;
    EditText  etusername, etage,etname;
    UserlocalStore userlocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etage=(EditText) findViewById(R.id.etage);
        etname=(EditText)findViewById(R.id.etname);
        etusername=(EditText)findViewById(R.id.etusername);
        etblogout=(Button) findViewById(R.id.etblogout);

        etblogout.setOnClickListener(this);
        userlocalStore=new UserlocalStore(this);
    }
    @Override
    protected void onStart(){
        super.onStart();
        if (authenticate()==true){
            displayUserdetails();
        }
        else{
            startActivity(new Intent(MainActivity.this,Login.class));
        }

    }
    private boolean authenticate(){
        return userlocalStore.getuserloggedin();

    }
    private void displayUserdetails(){
        User user=userlocalStore.getloggedin();
        etusername.setText(user.username);
        etname.setText(user.name);
        etage.setText(user.age);

    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.etblogout:
                userlocalStore.clearuserdata();
                userlocalStore.setUserloggedin(false);

                startActivity(new Intent(this,Login.class));
                break;

        }
    }

}
