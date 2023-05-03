package com.example.retrofit.network

import com.example.retrofit.model.DataList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getData(): List<DataList>

    companion object{
        private var apiService : ApiService? = null
        fun getInstance() : ApiService {
            if(apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }

}


//https://jsonplaceholder.typicode.com/posts