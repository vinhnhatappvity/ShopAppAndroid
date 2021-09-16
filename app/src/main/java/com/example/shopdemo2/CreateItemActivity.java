package com.example.shopdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.shopdemo2.databinding.ActivityCreateItemBinding;

public class CreateItemActivity extends AppCompatActivity {
    private ActivityCreateItemBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}