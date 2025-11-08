package com.example.tugasnavigasi.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.tugasnavigasi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    onSubmit: (String, String, String, String) -> Unit,
    onSelesaiDialog: () -> Unit,
    onBeranda: () -> Unit
){
    var nama by rememberSaveable { mutableStateOf("") }
    var gender by rememberSaveable { mutableStateOf("") }
    var status by rememberSaveable { mutableStateOf("") }
    var alamat by rememberSaveable { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }

    val valid = nama.isNotBlank() && gender.isNotBlank() && status.isNotBlank() && alamat.isNotBlank()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Formulir Pendaftaran") })
        }
    )
