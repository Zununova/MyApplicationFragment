package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {
    EditText etInputName, etInputPassword;
    Button btnLogIn;
    private final String name = "Admin";
    private final String password = "2023";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etInputName = view.findViewById(R.id.et_input_name);
        etInputPassword = view.findViewById(R.id.et_input_password);
        btnLogIn = view.findViewById(R.id.btn_log_in);
        init();
    }

    private void init() {
        btnLogIn.setOnClickListener(v -> {
            if (etInputPassword.getText().toString().equals(password)&& etInputName.getText().toString().equals(name)){
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.main_activity, new SecondFragment())
                        .commit();
            }
            else {
                etInputName.setError("Wrong name or password");
                etInputPassword.setError("wrong name or password");
            }

        });
    }
}