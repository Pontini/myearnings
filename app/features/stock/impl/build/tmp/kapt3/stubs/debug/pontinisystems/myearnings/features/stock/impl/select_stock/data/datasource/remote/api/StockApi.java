package pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ/\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lpontinisystems/myearnings/features/stock/impl/select_stock/data/datasource/remote/api/StockApi;", "", "detailsFavoriteStock", "Lokhttp3/ResponseBody;", "symbol", "", "apikey", "function", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchForSymbol", "keywords", "impl_debug"})
public abstract interface StockApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/query")
    public abstract java.lang.Object searchForSymbol(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "keywords")
    java.lang.String keywords, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "function")
    java.lang.String function, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/query")
    public abstract java.lang.Object detailsFavoriteStock(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "symbol")
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "function")
    java.lang.String function, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}