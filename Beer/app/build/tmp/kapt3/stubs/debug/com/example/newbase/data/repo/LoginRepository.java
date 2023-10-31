package com.example.newbase.data.repo;

import com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/newbase/data/repo/LoginRepository;", "", "loginDataSource", "Lcom/example/newbase/data/dataSource/local/sharedPrefs/LoginDataSource;", "(Lcom/example/newbase/data/dataSource/local/sharedPrefs/LoginDataSource;)V", "getUserData", "", "saveLoginData", "", "user", "app_debug"})
public final class LoginRepository {
    private final com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource loginDataSource = null;
    
    @javax.inject.Inject
    public LoginRepository(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource loginDataSource) {
        super();
    }
    
    public final void saveLoginData(@org.jetbrains.annotations.NotNull
    java.lang.String user) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserData() {
        return null;
    }
}