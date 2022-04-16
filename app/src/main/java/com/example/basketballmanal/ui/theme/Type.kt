package com.example.basketballmanal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basketballmanal.R

// Set of Material typography styles to start with
val NewFont = FontFamily(
    Font(R.font.dosis_bold, FontWeight.Bold) ,
    Font(R.font.dosis_regular)
)
val Typography = Typography(
   h1 = TextStyle(
       fontFamily = NewFont,
       fontWeight = FontWeight.Bold,
       fontSize = 25.sp
   ),
    body1 = TextStyle(
        fontFamily = NewFont,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )

    )


    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
