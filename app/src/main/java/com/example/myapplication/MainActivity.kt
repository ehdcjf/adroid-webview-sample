package com.example.myapplication
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.apply{
            javaScriptEnabled = true;
            domStorageEnabled = true;
            setSupportMultipleWindows(true)

        }
        webView.webViewClient = WebViewClient()
        webView.loadUrl("http://192.168.222.132:3000")
    }
}