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

import com.example.shopdemo2.databinding.FragmentCreateCreateItemBinding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CreateFragment extends Fragment {
    private FragmentCreateCreateItemBinding binding;
    private EditText editTextCreate;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCreateCreateItemBinding.inflate(inflater, container, false);
//        init view
        initView();
        return binding.getRoot();
    }

//    init view
    private void initView() {
        editTextCreate = binding.editTextDate;
    }

    public String getCreate(){
        return editTextCreate.getText().toString();
    }
    public void checkFormatDate(String s){
        if(!s.isEmpty() && s.length() >0){
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(s);
            }catch (Exception e){
                Toast.makeText(getActivity(), "Date is false format", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getActivity(), "Create must be not empty", Toast.LENGTH_SHORT).show();
        }
    }

}
