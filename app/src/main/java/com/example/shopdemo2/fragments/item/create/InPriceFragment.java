package com.example.shopdemo2.fragments.item.create;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.shopdemo2.databinding.FragmentInpriceCreateItemBinding;

import java.text.DateFormat;
import java.text.DecimalFormat;

public class InPriceFragment extends Fragment {
    private FragmentInpriceCreateItemBinding binding;
    private EditText editTextInPrice;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentInpriceCreateItemBinding.inflate(inflater, container, false);
//        init view
        initView();
        return binding.getRoot();
    }

    //    init view
    private void initView() {
        editTextInPrice = binding.editTextInPrice;
    }
    public String getInPrice(){
        return editTextInPrice.getText().toString();
    }
    public void checkInPrice(String s){
        try {
            Double.parseDouble(s);
        }catch (Exception e){
            Toast.makeText(getActivity(), "In price is false format", Toast.LENGTH_SHORT).show();
        }
    }
}
