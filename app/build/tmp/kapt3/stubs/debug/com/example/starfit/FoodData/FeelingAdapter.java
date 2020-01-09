package com.example.starfit.FoodData;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001b\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u00a2\u0006\u0002\b\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/starfit/FoodData/FeelingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/starfit/FoodData/FeelingAdapter$FeelingViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "feelings", "", "Lcom/example/starfit/FoodData/Feeling;", "inflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFeeling", "setFeeling$app_debug", "FeelingViewHolder", "app_debug"})
public final class FeelingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.starfit.FoodData.FeelingAdapter.FeelingViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.example.starfit.FoodData.Feeling> feelings;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.starfit.FoodData.FeelingAdapter.FeelingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.starfit.FoodData.FeelingAdapter.FeelingViewHolder holder, int position) {
    }
    
    public final void setFeeling$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.starfit.FoodData.Feeling> feelings) {
    }
    
    public FeelingAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/starfit/FoodData/FeelingAdapter$FeelingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/starfit/FoodData/FeelingAdapter;Landroid/view/View;)V", "TextViewDate", "Landroid/widget/TextView;", "getTextViewDate", "()Landroid/widget/TextView;", "TextviewMode", "getTextviewMode", "TextviewRemarks", "getTextviewRemarks", "app_debug"})
    public final class FeelingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView TextviewMode = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView TextviewRemarks = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView TextViewDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextviewMode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextviewRemarks() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewDate() {
            return null;
        }
        
        public FeelingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}