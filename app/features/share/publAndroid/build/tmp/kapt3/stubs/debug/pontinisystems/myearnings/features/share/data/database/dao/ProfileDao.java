package pontinisystems.myearnings.features.share.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lpontinisystems/myearnings/features/share/data/database/dao/ProfileDao;", "", "insert", "", "data", "Lpontinisystems/myearnings/features/share/data/database/entities/ProfileEntity;", "(Lpontinisystems/myearnings/features/share/data/database/entities/ProfileEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publAndroid_debug"})
public abstract interface ProfileDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
}