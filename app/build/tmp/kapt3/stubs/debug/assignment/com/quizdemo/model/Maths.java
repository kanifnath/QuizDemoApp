package assignment.com.quizdemo.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lassignment/com/quizdemo/model/Maths;", "", "q1", "Lassignment/com/quizdemo/model/Question1;", "q2", "Lassignment/com/quizdemo/model/Question2;", "q3", "Lassignment/com/quizdemo/model/Question3;", "questionVisible", "", "(Lassignment/com/quizdemo/model/Question1;Lassignment/com/quizdemo/model/Question2;Lassignment/com/quizdemo/model/Question3;Ljava/lang/Integer;)V", "getQ1", "()Lassignment/com/quizdemo/model/Question1;", "setQ1", "(Lassignment/com/quizdemo/model/Question1;)V", "getQ2", "()Lassignment/com/quizdemo/model/Question2;", "setQ2", "(Lassignment/com/quizdemo/model/Question2;)V", "getQ3", "()Lassignment/com/quizdemo/model/Question3;", "setQ3", "(Lassignment/com/quizdemo/model/Question3;)V", "getQuestionVisible", "()Ljava/lang/Integer;", "setQuestionVisible", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lassignment/com/quizdemo/model/Question1;Lassignment/com/quizdemo/model/Question2;Lassignment/com/quizdemo/model/Question3;Ljava/lang/Integer;)Lassignment/com/quizdemo/model/Maths;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Maths {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "q1")
    private assignment.com.quizdemo.model.Question1 q1;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "q2")
    private assignment.com.quizdemo.model.Question2 q2;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "q3")
    private assignment.com.quizdemo.model.Question3 q3;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer questionVisible;
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question1 getQ1() {
        return null;
    }
    
    public final void setQ1(@org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question1 p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question2 getQ2() {
        return null;
    }
    
    public final void setQ2(@org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question2 p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question3 getQ3() {
        return null;
    }
    
    public final void setQ3(@org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question3 p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQuestionVisible() {
        return null;
    }
    
    public final void setQuestionVisible(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public Maths(@org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question1 q1, @org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question2 q2, @org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question3 q3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer questionVisible) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question1 component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question2 component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final assignment.com.quizdemo.model.Question3 component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final assignment.com.quizdemo.model.Maths copy(@org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question1 q1, @org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question2 q2, @org.jetbrains.annotations.Nullable()
    assignment.com.quizdemo.model.Question3 q3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer questionVisible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}