package com.moringaschool.weekone;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ShareData {
    private static String pass ;
    public static ArrayList<AppTexts> AllMessages = new ArrayList<AppTexts>();
    public static  String origin;

    public static ArrayList<AppTexts> getAllMessages() {
        return AllMessages;
    }

    public static void setAllMessages(AppTexts Messages) {
        AllMessages.add(Messages);
    }

    public  static  boolean clicked ;
    public static void setPass(String passed) {
        pass = passed;
        clicked = true;
    }

    public static String getPass() {
        return pass;
    }


}
