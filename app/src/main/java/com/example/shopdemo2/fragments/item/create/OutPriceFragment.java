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

import com.example.shopdemo2.databinding.FragmentOutpriceCreateItemBinding;

public class OutPriceFragment extends Fragment {
    private FragmentOutpriceCreateItemBinding binding;
    private EditText editTextOutPrice;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentOutpriceCreateItemBinding.inflate(inflater, container, false);
//        init view
        initView();
        return binding.getRoot();
    }
//    init view
    private void initView() {
        editTextOutPrice = binding.editTextOutPrice;
    }
    public String getOutPrice(){
        return editTextOutPrice.getText().toString();
    }
    public void checkOutPrice(String s){
        if(!s.isEmpty() && s.length()>0){
            try {
                Double.parseDouble(s);
            }catch (Exception e){
                Toast.makeText(getActivity(), "Out price is false format", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getActivity(), "Out price must be not empty", Toast.LENGTH_SHORT).show();
        }
    }
}
