package com.example.retrofit.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.model.DataList
import com.example.retrofit.network.ApiService
import kotlinx.coroutines.launch

class DataViewModel: ViewModel() {
    var dataListResponse : List<DataList> by mutableStateOf(listOf())
    private var errorMessage : String by mutableStateOf("")

    fun getDataList(){
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try{
                val dataList = apiService.getData()
                dataListResponse = dataList
            }
            catch (e:Exception){
                errorMessage = e.message.toString()
            }
        }
    }

}