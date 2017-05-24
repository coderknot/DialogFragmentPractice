package com.example.guest.dialogfragmentpractice;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        MoodDialogFragment moodDialogFragment = new MoodDialogFragment ();
        moodDialogFragment.show(fm, "Sample Fragment");
    }
}
