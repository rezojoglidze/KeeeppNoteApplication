package com.keppnoteapp.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0013J\u001c\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0017J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0014\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000\u00a2\u0006\u0002\b\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/keppnoteapp/Adapters/WordListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/keppnoteapp/Adapters/WordListAdapter$WordViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mainActivity", "Lcom/keppnoteapp/MainActivity;", "getMainActivity", "()Lcom/keppnoteapp/MainActivity;", "setMainActivity", "(Lcom/keppnoteapp/MainActivity;)V", "onItemClick", "Lkotlin/Function0;", "", "words", "", "Lcom/keppnoteapp/RoomDatabase/Entity/Word;", "getItemCount", "", "getWordAtPosition", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "clickCallBack", "setWords", "setWords$app_debug", "WordViewHolder", "app_debug"})
public final class WordListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.keppnoteapp.Adapters.WordListAdapter.WordViewHolder> {
    private java.util.List<com.keppnoteapp.RoomDatabase.Entity.Word> words;
    @org.jetbrains.annotations.Nullable()
    private com.keppnoteapp.MainActivity mainActivity;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick;
    
    @org.jetbrains.annotations.Nullable()
    public final com.keppnoteapp.MainActivity getMainActivity() {
        return null;
    }
    
    public final void setMainActivity(@org.jetbrains.annotations.Nullable()
    com.keppnoteapp.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.keppnoteapp.Adapters.WordListAdapter.WordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.keppnoteapp.Adapters.WordListAdapter.WordViewHolder holder, int position) {
    }
    
    public final void setWords$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.keppnoteapp.RoomDatabase.Entity.Word> words) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.keppnoteapp.RoomDatabase.Entity.Word getWordAtPosition(int position) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickCallBack) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public WordListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/keppnoteapp/Adapters/WordListAdapter$WordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/keppnoteapp/Adapters/WordListAdapter;Landroid/view/View;)V", "before_Update_Background_Layout", "Landroid/widget/LinearLayout;", "getBefore_Update_Background_Layout", "()Landroid/widget/LinearLayout;", "before_Update_Date", "Landroid/widget/TextView;", "getBefore_Update_Date", "()Landroid/widget/TextView;", "before_Update_Note", "getBefore_Update_Note", "before_Update_Title", "getBefore_Update_Title", "updateSaveButton", "Landroid/widget/Button;", "getUpdateSaveButton", "()Landroid/widget/Button;", "update_Note_Layout", "getUpdate_Note_Layout", "updated_Note", "Landroid/widget/EditText;", "getUpdated_Note", "()Landroid/widget/EditText;", "updated_Title", "getUpdated_Title", "word", "Lcom/keppnoteapp/RoomDatabase/Entity/Word;", "getWord", "()Lcom/keppnoteapp/RoomDatabase/Entity/Word;", "setWord", "(Lcom/keppnoteapp/RoomDatabase/Entity/Word;)V", "app_debug"})
    public final class WordViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout before_Update_Background_Layout = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView before_Update_Title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView before_Update_Note = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView before_Update_Date = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout update_Note_Layout = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText updated_Title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText updated_Note = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button updateSaveButton = null;
        @org.jetbrains.annotations.NotNull()
        public com.keppnoteapp.RoomDatabase.Entity.Word word;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getBefore_Update_Background_Layout() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBefore_Update_Title() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBefore_Update_Note() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBefore_Update_Date() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getUpdate_Note_Layout() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getUpdated_Title() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getUpdated_Note() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getUpdateSaveButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.keppnoteapp.RoomDatabase.Entity.Word getWord() {
            return null;
        }
        
        public final void setWord(@org.jetbrains.annotations.NotNull()
        com.keppnoteapp.RoomDatabase.Entity.Word p0) {
        }
        
        public WordViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}