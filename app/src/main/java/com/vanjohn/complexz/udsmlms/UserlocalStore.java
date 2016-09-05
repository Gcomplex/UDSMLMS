package com.vanjohn.complexz.udsmlms;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dell on 8/16/2016.
 */
public class UserlocalStore {
    public  static final  String SP_NAME="userDetails";
    SharedPreferences userlocaldatabase;
    public UserlocalStore(Context context){
        userlocaldatabase=context.getSharedPreferences(SP_NAME,0);

    }
    public void storeuserdata(User user){
        SharedPreferences.Editor spEditor=userlocaldatabase.edit();
        spEditor.putString("name",user.name);
        spEditor.putString("username",user.username);
        spEditor.putString("password",user.password);
        spEditor.putInt("age",user.age);
        spEditor.commit();
    }
    public User getloggedin(){
        String name=userlocaldatabase.getString("name","");
        String password=userlocaldatabase.getString("password","");
        String username=userlocaldatabase.getString("username","");
        int age=userlocaldatabase.getInt("age",-1);
        User storeduser= new User(username,password,name,age);
        return storeduser;
    }
    public void setUserloggedin( boolean loggedIn){
        SharedPreferences.Editor spEditor=userlocaldatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();

    }
    public void clearuserdata(){
        SharedPreferences.Editor spEditor=userlocaldatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
    public boolean getuserloggedin(){
        if(userlocaldatabase.getBoolean("loggedIn",false)==true){
            return true;
        }else {
            return false;
        }
    }
}
