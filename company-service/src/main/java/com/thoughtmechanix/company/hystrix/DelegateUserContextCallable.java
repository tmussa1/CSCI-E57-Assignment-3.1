package com.thoughtmechanix.company.hystrix;

import com.thoughtmechanix.company.utils.UserContext;
import com.thoughtmechanix.company.utils.UserContextHolder;

import java.util.concurrent.Callable;

public class DelegateUserContextCallable<V> implements Callable<V> {

    private final Callable<V> delegate;
    private UserContext userContext;

    public DelegateUserContextCallable(Callable delegate, UserContext userContext) {
        this.delegate = delegate;
        this.userContext = userContext;
    }

    @Override
    public V call() throws Exception {
        UserContextHolder.setContext(userContext);
        try {
            return delegate.call();
        } finally {
            userContext = null;
        }
    }

    public static <V> Callable<V> create(Callable<V> delegate,
                                         UserContext userContext) {
        return new DelegateUserContextCallable<V>(delegate, userContext);
    }
}
