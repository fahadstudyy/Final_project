package com.example.ssvlvotings.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ssvlvotings.R;
import com.example.ssvlvotings.currentuser;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {
    TextView name;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment_activity,container,false);
        name = v.findViewById(R.id.Firstname);
        name.setText(currentuser.firstname);
        return v;

    }
}
