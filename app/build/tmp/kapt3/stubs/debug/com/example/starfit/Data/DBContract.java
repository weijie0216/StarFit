package com.example.starfit.Data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/starfit/Data/DBContract;", "", "()V", "UserEntry", "app_debug"})
public final class DBContract {
    public static final com.example.starfit.Data.DBContract INSTANCE = null;
    
    private DBContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/starfit/Data/DBContract$UserEntry;", "Landroid/provider/BaseColumns;", "()V", "Companion", "app_debug"})
    public static final class UserEntry implements android.provider.BaseColumns {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String TABLE_NAME = "users";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String COLUMN_NAME = "name";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String COLUMN_EMAIL = "email";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String COLUMN_PASSWORD = "password";
        public static final com.example.starfit.Data.DBContract.UserEntry.Companion Companion = null;
        
        public UserEntry() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/starfit/Data/DBContract$UserEntry$Companion;", "", "()V", "COLUMN_EMAIL", "", "getCOLUMN_EMAIL", "()Ljava/lang/String;", "COLUMN_NAME", "getCOLUMN_NAME", "COLUMN_PASSWORD", "getCOLUMN_PASSWORD", "TABLE_NAME", "getTABLE_NAME", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTABLE_NAME() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCOLUMN_NAME() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCOLUMN_EMAIL() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCOLUMN_PASSWORD() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}