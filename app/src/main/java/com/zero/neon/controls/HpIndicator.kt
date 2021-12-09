package com.zero.neon.controls

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zero.neon.R

@Composable
fun HpIndicator(hp: Int, modifier: Modifier = Modifier) {

    val buttonPaddingEnd = dimensionResource(id = R.dimen.button_padding)
    val buttonPaddingTop = buttonPaddingEnd * 2
    val height = 60.dp

    Box(
        modifier = modifier
            .padding(start = buttonPaddingEnd, top = buttonPaddingTop)
            .height(height = height)
    ) {
        Image(
            painter = painterResource(id = R.drawable.hp_indicator),
            contentDescription = stringResource(id = R.string.game_hp_indicator),
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "${hp}hp",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}