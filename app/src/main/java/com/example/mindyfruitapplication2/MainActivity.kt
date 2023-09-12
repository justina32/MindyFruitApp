package com.example.mindyfruitapplication2

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindyfruitapplication2.ui.theme.MindyFruitApplication2Theme
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : ComponentActivity() {
    companion object {
        const val BANANA_PATH = "api/fruit/banana"
        val FRUIT_LIST = listOf("Apple", "Banana", "Orange","Persimmon","Strawberry","Pear","Durian"
            ,"Blackberry","Lingonberry","Kiwi","Lychee","Pineapple","Fig","Gooseberry","Passionfruit",
            "Plum","Orange","GreenApple","Raspberry","Watermelon")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MindyFruitApplication2Theme {
                FruitFamilyTreeScreen(fruitList = FRUIT_LIST)
            }
        }
    }


fun initData(): View.OnClickListener? {
    Thread {
        getDataFromServer()
    }.start()
    return null
}

fun getDataFromServer() {
    try {
        // 创建一个 OkHttpClient 对象
        val client = OkHttpClient()

// 构建一个 HTTP 请求，指定请求 URL 为 "api/fruit/all"
        val request = Request.Builder()
            .url(BANANA_PATH)
            .build()

// 使用创建的 client 对象发送请求，并获取响应对象
        val response = client.newCall(request).execute()

// 从响应对象中获取响应数据（以字符串格式返回）
        val responseData = response.body()?.string()
        print(responseData)
    } catch (e: Throwable) {
        print("error")

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MindyFruitApplication2Theme {
        Greeting("Android")
    }
}

    @Composable
    fun FruitFamilyTreeScreen(fruitList: List<String>) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                "Let's Eat Fruit",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 35.sp,
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
            ) {
                items(fruitList) { fruit ->
                    Text(
                        text = fruit,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 16.dp)
                    )
                }
            }
        }
    }
}

