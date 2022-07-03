package pontinisystems.myearnings.features.share.publicAndroid.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lpontinisystems/myearnings/features/share/publicAndroid/data/database/dao/StockDao;", "", "delete", "", "data", "Lpontinisystems/myearnings/features/share/publicAndroid/data/database/entities/StockEntity;", "(Lpontinisystems/myearnings/features/share/publicAndroid/data/database/entities/StockEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStockWithEarnings", "", "Lpontinisystems/myearnings/features/share/publicAndroid/data/database/relations/StockWithEarningsEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "selectAll", "publAndroid_debug"})
public abstract interface StockDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM `stock`")
    @androidx.room.Transaction()
    public abstract java.lang.Object selectAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM earning")
    @androidx.room.Transaction()
    public abstract java.lang.Object getStockWithEarnings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<pontinisystems.myearnings.features.share.publicAndroid.data.database.relations.StockWithEarningsEntity>> continuation);
}