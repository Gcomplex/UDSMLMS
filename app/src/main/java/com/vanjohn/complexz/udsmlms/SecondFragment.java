package com.vanjohn.complexz.udsmlms;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dell on 8/24/2016.
 */
public class SecondFragment  extends Fragment{
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview=inflater.inflate(R.layout.event,container,false);
        return myview;
    }
}
