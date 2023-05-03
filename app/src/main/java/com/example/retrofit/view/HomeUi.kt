package com.example.retrofit.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.retrofit.model.DataList


@Composable
fun DataItem(data : DataList){
    Card (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.DarkGray)
    ){
        Column (
            modifier = Modifier.padding(8.dp)
        ){
            Text(
                text = data.userId.toString(),
                color = Color.White
            )
            Text(
                text = data.id.toString(),
                color = Color.White
            )
            Text(
                text = data.title,
                color = Color.White
            )
            Text(
                text = data.body,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    val data = DataList("Jatin",333,"Kumar",2424)
    DataItem(data)
}