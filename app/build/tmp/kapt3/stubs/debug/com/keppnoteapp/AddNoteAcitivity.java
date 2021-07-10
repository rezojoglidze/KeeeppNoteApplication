package com.keppnoteapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0015J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\b\u0010 \u001a\u00020\u0017H\u0014J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/keppnoteapp/AddNoteAcitivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/hardware/SensorEventListener;", "()V", "noteEditText", "Landroid/widget/EditText;", "running", "", "getRunning", "()Z", "setRunning", "(Z)V", "sensorManager", "Landroid/hardware/SensorManager;", "getSensorManager", "()Landroid/hardware/SensorManager;", "setSensorManager", "(Landroid/hardware/SensorManager;)V", "stepCounter", "", "Ljava/lang/Float;", "titleEditText", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "Companion", "app_debug"})
public final class AddNoteAcitivity extends androidx.appcompat.app.AppCompatActivity implements android.hardware.SensorEventListener {
    private android.widget.EditText noteEditText;
    private android.widget.EditText titleEditText;
    private java.lang.Float stepCounter;
    private boolean running;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.SensorManager sensorManager;
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
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_STEP_COUNTER = "stepCounter.REPLY";
    public static final com.keppnoteapp.AddNoteAcitivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getRunning() {
        return false;
    }
    
    public final void setRunning(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.hardware.SensorManager getSensorManager() {
        return null;
    }
    
    public final void setSensorManager(@org.jetbrains.annotations.Nullable()
    android.hardware.SensorManager p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.SensorEvent event) {
    }
    
    public AddNoteAcitivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/keppnoteapp/AddNoteAcitivity$Companion;", "", "()V", "EXTRA_COLOR_REPLY", "", "EXTRA_DATE_REPLY", "EXTRA_ID", "EXTRA_NOTE_REPLY", "EXTRA_STEP_COUNTER", "EXTRA_TITLE_REPLY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}