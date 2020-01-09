package com.example.starfit.FoodData;

import java.lang.System;

@androidx.room.Entity(tableName = "feeling")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/starfit/FoodData/Feeling;", "", "id", "", "mode", "remaks", "", "Created_at", "", "(IILjava/lang/String;J)V", "getCreated_at", "()J", "getId", "()I", "getMode", "getRemaks", "()Ljava/lang/String;", "app_debug"})
public final class Feeling {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    private final int mode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String remaks = null;
    private final long Created_at = 0L;
    
    public final int getId() {
        return 0;
    }
    
    public final int getMode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemaks() {
        return null;
    }
    
    public final long getCreated_at() {
        return 0L;
    }
    
    public Feeling(int id, int mode, @org.jetbrains.annotations.NotNull()
    java.lang.String remaks, long Created_at) {
        super();
    }
}