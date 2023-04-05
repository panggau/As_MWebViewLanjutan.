package com.panggaudavid181103375.webviewlanjutan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    private WebView _WebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _WebView1 = (WebView) findViewById(R.id.WebView1);

        WebViewClient WebViewCilent = new WebViewClient();
        _WebView1.setWebViewClient(WebViewCilent);

        WebChromeClient WebChromeClient = new WebChromeClient();
        _WebView1.setWebChromeClient(WebChromeClient);

        WebSettings WebSettings = _WebView1.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        WebSettings.setDomStorageEnabled(true);

        WebAppInterface WebAppInterface = new WebAppInterface(this, MainActivity.this);
        _WebView1.addJavascriptInterface(WebAppInterface,"Android");

        String url = "https://stmikpontianak.net/011100862/webview_lanjutan.html";
        _WebView1.loadUrl(url);
    }
}