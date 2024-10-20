package com.example.appmultiplaformadsm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmultiplaformadsm.ui.theme.AppMultiplaformaDSMTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppMultiplaformaDSMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPaddig ->
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column (
        Modifier
            .background(Color(0xFF9956F6))
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Row(
            Modifier
                .padding(20.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                "LDSM - Form Compose",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
        Row(
            Modifier
                .padding(10.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {

            Text(
                "Formulário Login",
                color = Color.White
            )

        }
        Row(
            Modifier
                .padding(15.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Column(
                Modifier
                    .fillMaxWidth(0.2f)
            ){
                Text(
                    "E-mail",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
                Row(
                    Modifier
                        .padding(20.dp)
                ){

                }

                Text("Senha",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            }
            Column (
                Modifier
                    .fillMaxWidth(0.8f)

            ) {
                Row(
                    Modifier
                        .padding(8.dp)
                ){

                }
                TextField(
                    value = "",
                    onValueChange = { },
                    label = { },
                    modifier = Modifier.height(15.dp)
                )

                Row(
                    Modifier
                        .padding(20.dp)
                ){

                }
                TextField(
                    value = "",
                    onValueChange = { },
                    label = { },
                    modifier = Modifier.height(15.dp)
                )


            }

        }
        Row(
            Modifier
                .padding(28.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center

        ){
            Button(
                onClick = { },
            ) {
                Text("Entrar",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }


    }

}

@Preview
@Composable
fun AppPreview(){
    AppMultiplaformaDSMTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPaddig ->
            App()
        }
    }
}
