package pontinisystems.myearnings.features.share.data.database;

import java.lang.System;

@androidx.room.Database(entities = {pontinisystems.myearnings.features.share.data.database.entities.StockEntity.class, pontinisystems.myearnings.features.share.data.database.entities.EarningEntity.class, pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity.class}, version = 500)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lpontinisystems/myearnings/features/share/data/database/DataBaseBuilder;", "Landroidx/room/RoomDatabase;", "()V", "profileDao", "Lpontinisystems/myearnings/features/share/data/database/dao/ProfileDao;", "stockDao", "Lpontinisystems/myearnings/features/share/data/database/dao/StockDao;", "Companion", "publAndroid_debug"})
public abstract class DataBaseBuilder extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final pontinisystems.myearnings.features.share.data.database.DataBaseBuilder.Companion Companion = null;
    public static final int DB_VERSION = 500;
    
    public DataBaseBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract pontinisystems.myearnings.features.share.data.database.dao.StockDao stockDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract pontinisystems.myearnings.features.share.data.database.dao.ProfileDao profileDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpontinisystems/myearnings/features/share/data/database/DataBaseBuilder$Companion;", "", "()V", "DB_VERSION", "", "publAndroid_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}