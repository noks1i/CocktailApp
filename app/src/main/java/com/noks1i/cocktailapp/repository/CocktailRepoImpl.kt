package com.noks1i.cocktailapp.repository

import com.noks1i.cocktailapp.data.model.CocktailEntry
import com.noks1i.cocktailapp.data.model.CocktailList
import com.noks1i.cocktailapp.data.remote.CocktailDataSource

class CocktailRepoImpl(private val dataSource: CocktailDataSource) : CocktailRepo {
    override suspend fun getCocktails(): CocktailList = dataSource.getCocktail()
    override suspend fun getDetailsById(id: String): CocktailEntry = dataSource.getDetailsById(id)
    override suspend fun getRandomCocktail(): CocktailEntry = dataSource.getRandomCocktail()
}