package com.clonecode.foody.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.clonecode.foody.data.database.entities.FavoritesEntity
import com.clonecode.foody.data.database.entities.FoodJokeEntity
import com.clonecode.foody.data.database.entities.RecipesEntity
import com.clonecode.foody.models.FoodJoke

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 2,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}