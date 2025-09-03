package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica1.ui.theme.Practica1Theme
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.displayCutout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Practica1Theme {
                CenteredInfo()
            }
        }
    }
}

@Composable
fun CenteredInfo() {
    Box(
        modifier = Modifier
            .fillMaxSize() // Ocupa toda la pantalla
            .consumeWindowInsets(WindowInsets.displayCutout) // Ignora notch/barras
            .padding(0.dp),
        contentAlignment = Alignment.Center // Centra todo
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Nombre
            Text(
                text = "Carlos Adrian Treviño",
                color = Color(0xFF8B0000), // rojo oscuro
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            // Espacio entre nombre y número
            Spacer(modifier = Modifier.height(12.dp))

            // Número de control
            Text(
                text = "Número de control: 21130838",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredInfoPreview() {
    Practica1Theme {
        CenteredInfo()
    }
}
