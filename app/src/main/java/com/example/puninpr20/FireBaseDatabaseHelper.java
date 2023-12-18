package com.example.puninpr20;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBaseDatabaseHelper {

    private DatabaseReference mDatabase;

    public FireBaseDatabaseHelper() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void addData(String data) {
        // Генерируем уникальный ключ для новых данных
        String key = mDatabase.child("data").push().getKey();

        // Создаем объект и добавляем его в базу данных
        Dataltem item = new Dataltem(key, data);
        mDatabase.child("data").child(key).setValue(item);
    }

    public DatabaseReference getDataReference() {
        return mDatabase.child("data");
    }

}