package com.moringaschool.weekone;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareData {
    private static String pass ;
public  static  boolean clicked ;
    public static void setPass(String passed) {
        pass = passed;
        clicked = true;
    }

    public static String getPass() {
        return pass;
    }


}
