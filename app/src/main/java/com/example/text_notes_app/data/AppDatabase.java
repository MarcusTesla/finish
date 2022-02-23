package com.example.text_notes_app.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.text_notes_app.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
