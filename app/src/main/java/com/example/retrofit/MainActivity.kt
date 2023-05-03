package com.example.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.retrofit.model.DataList
import com.example.retrofit.ui.theme.RetrofitTheme
import com.example.retrofit.view.DataItem
import com.example.retrofit.viewmodel.DataViewModel

class MainActivity : ComponentActivity() {

    private val dataViewModel by viewModels<DataViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {
                        Id()
                        DataList(dataList = dataViewModel.dataListResponse)
                        dataViewModel.getDataList()
                    }
                }
            }
        }
    }
}

@Composable
fun Id(){
    Text(text = "Retrofit")
}

@Composable
fun DataList(dataList: List<DataList>){
    LazyColumn{
        itemsIndexed(items = dataList){ _, item ->
            DataItem(data = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RetrofitTheme {
        val data = DataList("Jatin",333,"Kumar",2424)
        DataList(dataList = listOf(data))
    }
}