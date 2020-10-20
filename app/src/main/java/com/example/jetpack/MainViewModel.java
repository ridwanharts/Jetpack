package com.example.jetpack;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {

    int result;
    private MutableLiveData<List<User>> users;

    public LiveData<List<User>> getUsers(Context context){
        if (users == null){
            users = new MutableLiveData<List<User>>();
            loadUsers(context);
        }
        return users;
    }

    private void loadUsers(Context context){
        Toast.makeText(context, "LoadUsers", Toast.LENGTH_SHORT).show();
    }

    public void calculate(String width, String height, String length){
        result = Integer.parseInt(width) *
                        Integer.parseInt(height) *
                        Integer.parseInt(length);
    }
}
