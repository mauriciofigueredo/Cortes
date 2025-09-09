package com.mst.cortes.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mst.cortes.components.FloatButton
import com.mst.cortes.components.MainTextField
import com.mst.cortes.components.MainTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = { Text("Cortes", color = MaterialTheme.colorScheme.outline )},
//                colors = TopAppBarDefaults.topAppBarColors(
//                   containerColor = MaterialTheme.colorScheme.inverseSurface,
//                    titleContentColor = MaterialTheme.colorScheme.primary
//                )
//            )
//        }, containerColor = MaterialTheme.colorScheme.outline,
//        floatingActionButton = {
//            FloatButton {
//                navController.navigate("Add")
//            }
//        },
//
//    ){
//        HomeContent(it)
//    }

    Column {
        CenterAlignedTopAppBar(
            title = { Text("Cortes", color = MaterialTheme.colorScheme.outline )},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.inverseSurface,
                titleContentColor = MaterialTheme.colorScheme.primary
            )
        )

        MainTitle(title = "Cargar trabajo", color = Color.White)

        Column(


            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(15.dp))
        {
//        MainTextField(
//            value = "", onValueChange = {}, label = "Cuenta", keyboardOptions = KeyboardType.Number)

            println("Paso fin2")
            MainTitle(title = "Cargar trabajo", color = Color.Gray)
            println("Paso fin3")
        }


    }

}


