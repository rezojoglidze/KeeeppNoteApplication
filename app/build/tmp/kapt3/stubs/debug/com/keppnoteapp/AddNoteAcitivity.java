package com.keppnoteapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/keppnoteapp/AddNoteAcitivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "noteEditText", "Landroid/widget/EditText;", "titleEditText", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class AddNoteAcitivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText noteEditText;
    private android.widget.EditText titleEditText;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID = "EXTRA_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TITLE_REPLY = "title.REPLY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NOTE_REPLY = "note.REPLY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_DATE_REPLY = "date.REPLY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_COLOR_REPLY = "color.REPLY";
    public static final com.keppnoteapp.AddNoteAcitivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public AddNoteAcitivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/keppnoteapp/AddNoteAcitivity$Companion;", "", "()V", "EXTRA_COLOR_REPLY", "", "EXTRA_DATE_REPLY", "EXTRA_ID", "EXTRA_NOTE_REPLY", "EXTRA_TITLE_REPLY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}