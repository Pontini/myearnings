package pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lpontinisystems/myearnings/features/stock/impl/select_stock/data/datasource/StockDataSource;", "", "searchBySymbol", "Lkotlinx/coroutines/flow/Flow;", "", "impl_debug"})
public abstract interface StockDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> searchBySymbol();
}