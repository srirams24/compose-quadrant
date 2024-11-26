package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrant(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {

//    Row {
//        ComposableCard(
//            title = stringResource(R.string.card1_title_text),
//            description = stringResource(R.string.card1_description_text),
//            modifier = Modifier
//                .background(color = colorResource(R.color.card1_color))
//                .weight(1F)
//                .fillMaxSize()
//        )
//        ComposableCard(
//            title = stringResource(R.string.card2_title_text),
//            description = stringResource(R.string.card2_description_text),
//            modifier = Modifier
//                .background(color = colorResource(R.color.card2_color))
//                .weight(1F)
//                .fillMaxSize()
//        )
//    }


    Row {
        ComposableCard(
            title = stringResource(R.string.card3_title_text),
            description = stringResource(R.string.card3_description_text),
            modifier = Modifier
                .background(color = colorResource(R.color.card3_color))
                .weight(1F)
                .fillMaxSize()
        )
        ComposableCard(
            title = stringResource(R.string.card4_title_text),
            description = stringResource(R.string.card4_description_text),
            modifier = Modifier
                .background(color = colorResource(R.color.card4_color))
                .weight(1F)
                .fillMaxSize()
        )
    }
}

@Composable
fun ComposableCard(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description, textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}