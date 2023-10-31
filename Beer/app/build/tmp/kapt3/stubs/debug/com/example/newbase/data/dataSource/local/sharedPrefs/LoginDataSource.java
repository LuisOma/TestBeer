package com.example.newbase.data.dataSource.local.sharedPrefs;

import android.content.SharedPreferences;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/newbase/data/dataSource/local/sharedPrefs/LoginDataSource;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getUserData", "", "saveLoginData", "", "user", "Companion", "app_debug"})
public final class LoginDataSource {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource.Companion Companion = null;
    private static final java.lang.String PREF_KEY_USER = "logged_in_user";
    
    @javax.inject.Inject
    public LoginDataSource(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void saveLoginData(@org.jetbrains.annotations.NotNull
    java.lang.String user) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/newbase/data/dataSource/local/sharedPrefs/LoginDataSource$Companion;", "", "()V", "PREF_KEY_USER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}