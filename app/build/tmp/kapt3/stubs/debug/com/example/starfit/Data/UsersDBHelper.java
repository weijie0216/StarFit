package com.example.starfit.Data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0018\u001a\u00020\b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/starfit/Data/UsersDBHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deleteUser", "", "name", "", "insertUser", "user", "Lcom/example/starfit/Data/UserModel;", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onDowngrade", "oldVersion", "", "newVersion", "onUpgrade", "readAllUsers", "Ljava/util/ArrayList;", "readUser", "email", "Companion", "app_debug"})
public final class UsersDBHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "FeedReader.db";
    private static final java.lang.String SQL_CREATE_ENTRIES = "CREATE TABLE users (name TEXT PRIMARY KEY,email TEXT,password TEXT)";
    private static final java.lang.String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS users";
    public static final com.example.starfit.Data.UsersDBHelper.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    @java.lang.Override()
    public void onDowngrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    public final boolean insertUser(@org.jetbrains.annotations.NotNull()
    com.example.starfit.Data.UserModel user) throws android.database.sqlite.SQLiteConstraintException {
        return false;
    }
    
    public final boolean deleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name) throws android.database.sqlite.SQLiteConstraintException {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.starfit.Data.UserModel> readUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.starfit.Data.UserModel> readAllUsers() {
        return null;
    }
    
    public UsersDBHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/starfit/Data/UsersDBHelper$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME", "()Ljava/lang/String;", "DATABASE_VERSION", "", "getDATABASE_VERSION", "()I", "SQL_CREATE_ENTRIES", "SQL_DELETE_ENTRIES", "app_debug"})
    public static final class Companion {
        
        public final int getDATABASE_VERSION() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}