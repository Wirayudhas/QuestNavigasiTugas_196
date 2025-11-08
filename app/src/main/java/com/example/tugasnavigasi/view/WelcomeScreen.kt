package com.example.tugasnavigasi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.tugasnavigasi.R

@Composable
fun WelcomeScreen(onMasuk: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_medium)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(dimensionResource(id = R.dimen.padding_small)))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Selamat Datang",
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
                )
                Spacer(Modifier.height(dimensionResource(id = R.dimen.padding_small)))

                Image(
                    painter = painterResource(id = R.drawable.Roblox),
                    contentDescription = "Roblox mancing",
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Fit
                )
            }

            Button(
                onClick = onMasuk,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Masuk")
            }
        }
    }
}
