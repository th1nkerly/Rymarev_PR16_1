package com.example.pr20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : ComponentActivity() {
    private lateinit var database: DatabaseReference

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database = FirebaseDatabase.getInstance().reference

        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text1 by remember { mutableStateOf(TextFieldValue()) }
        var text2 by remember { mutableStateOf(TextFieldValue()) }
        var text3 by remember { mutableStateOf(TextFieldValue()) }
        var text4 by remember { mutableStateOf(TextFieldValue()) }
        var text5 by remember { mutableStateOf(TextFieldValue()) }
        var text6 by remember { mutableStateOf(TextFieldValue()) }

        TextField(
            value = text1,
            onValueChange = { text1 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 1") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text2,
            onValueChange = { text2 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 2") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text3,
            onValueChange = { text3 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 3") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text4,
            onValueChange = { text4 = it },
            modifier= Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 4") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text5,
            onValueChange = { text5 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 5") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text6,
            onValueChange = { text6 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Поле ввода 6") }
        )
        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {

                }
            ) {
                Text("Записать данные")
            }
            Button(
                onClick = {

                }
            ) {
                Text("Прочитать данные")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyApp()
}


