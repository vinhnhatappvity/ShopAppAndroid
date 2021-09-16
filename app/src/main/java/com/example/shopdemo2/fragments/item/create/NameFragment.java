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

import com.example.shopdemo2.R;
import com.example.shopdemo2.databinding.FragmentNameCreateItemBinding;

public class NameFragment extends Fragment {
    private FragmentNameCreateItemBinding binding;
    private EditText editTextName;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentNameCreateItemBinding.inflate(inflater, container, false);
//        init view
        initView();
        return binding.getRoot();
    }

//    init view
    private void initView() {
        editTextName = binding.editTextName;
    }
    public String getName(){
        return editTextName.getText().toString();
    }

    public void checkName(String s){
        if(s.isEmpty() && s.length()<=0){
            Toast.makeText(getActivity(), R.string.nameerror, Toast.LENGTH_SHORT).show();
        }
    }
}
