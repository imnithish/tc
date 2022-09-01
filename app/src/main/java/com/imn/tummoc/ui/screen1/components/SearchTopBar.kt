package com.imn.tummoc.ui.screen1.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imn.tummoc.R
import org.w3c.dom.Text

@Composable
fun SearchTopBar(modifier: Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = 2.dp
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
            Icon(
                modifier=Modifier.size(36.dp),
                painter = painterResource(id = R.drawable.baseline_keyboard_arrow_left_24),
                contentDescription = ""
            )
            Column(
                modifier = Modifier.weight(1f),
            ) {
                SearchTopBarItem(
                    "Source",
                    "Kalamassery, Ernamkulam, Kerala. India",
                    Color.Magenta
                )
                Spacer(modifier = Modifier.height(16.dp))
                SearchTopBarItem(
                    "Destination",
                    "Fort Kochi, Ernamkulam, Kerala. India",
                    Color.Black
                )
            }
        }

    }

}

@Composable
fun SearchTopBarItem(
    t1: String,
    t2: String,
    c: Color
) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Canvas(modifier = Modifier.size(6.dp), onDraw = {
            drawCircle(c)
        })
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = t1, fontSize = 12.sp)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = t2, fontSize = 18.sp, overflow = TextOverflow.Ellipsis, maxLines = 1)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(id = R.drawable.baseline_favorite_border_24),
            contentDescription = ""
        )
    }
}

@Preview
@Composable
fun SearchTopBarItemPreview() {
    SearchTopBarItem(
        "Departure",
        "Build a mobile app and replicate below screen 1 and 2 to the ",
        Color.Red
    )
}