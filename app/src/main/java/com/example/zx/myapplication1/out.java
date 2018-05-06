package com.example.zx.myapplication1;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class out implements View.OnClickListener {
    private Activity act;
    public out(Activity act)

    {
        this.act = act;
    }
    @Override
    public void onClick(View source)
    {
        EditText abc = (EditText) act.findViewById(R.id.abc);
        abc.setText("外部类");
    }
}
