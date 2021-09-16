package com.example.shopdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shopdemo2.databinding.ActivityMainBinding;
import com.example.shopdemo2.fragments.item.create.CreateFragment;
import com.example.shopdemo2.fragments.item.create.InPriceFragment;
import com.example.shopdemo2.fragments.item.create.NameFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Button buttonCreated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        init view
        initView();
//        action view
        actionView();
    }

//    action view
    private void actionView() {
        // click on buttonCreated
        clickOnButtonCreated();
    }

    //    init view
    private void initView() {
        buttonCreated = binding.buttonCreated;
    }

//    my functions

    private void clickOnButtonCreated() {
        buttonCreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonCreated_onClick(view);
            }
        });
    }

    private void buttonCreated_onClick(View view) {
//        create name fragment
        NameFragment nameFragment = (NameFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentName);
        nameFragment.checkName(nameFragment.getName());
//        create create fragment
        CreateFragment createFragment = (CreateFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentCreate);
        createFragment.checkFormatDate(createFragment.getCreate());
//        create in price
        InPriceFragment inPriceFragment = (InPriceFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentInPrice);
        inPriceFragment.checkInPrice(inPriceFragment.getInPrice());
    }
}