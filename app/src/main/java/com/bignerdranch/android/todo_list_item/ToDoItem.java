package com.bignerdranch.android.todo_list_item;

import java.util.Date;

/**
 * Created by miked on 9/25/2016.
 */

public class ToDoItem {
    String text;
    Date created;

    public ToDoItem(String text){
        this.text = text;
        this.created = new Date();
    }
    public Date getCreated(){
        return created;
    }
    public String getText(){
        return text;
    }
}
