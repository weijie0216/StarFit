package com.example.starfit.FoodData;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/starfit/FoodData/FeelingDao;", "", "deleteFeeling", "", "feeling", "Lcom/example/starfit/FoodData/Feeling;", "(Lcom/example/starfit/FoodData/Feeling;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRecords", "Landroidx/lifecycle/LiveData;", "", "getOneRecord", "search_id", "", "insertFeeling", "updateFeeling", "app_debug"})
public abstract interface FeelingDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertFeeling(@org.jetbrains.annotations.NotNull()
    com.example.starfit.FoodData.Feeling feeling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateFeeling(@org.jetbrains.annotations.NotNull()
    com.example.starfit.FoodData.Feeling feeling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteFeeling(@org.jetbrains.annotations.NotNull()
    com.example.starfit.FoodData.Feeling feeling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * From feeling")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.starfit.FoodData.Feeling>> getAllRecords();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * From feeling WHERE id = :search_id")
    public abstract com.example.starfit.FoodData.Feeling getOneRecord(int search_id);
}