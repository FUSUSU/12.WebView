package com.example.teo.a12webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = (WebView) findViewById(R.id.webView1);
        //Load full web
        mywebview.loadUrl("http://www.javatpoint.com/");

        //Trường hợp lấy xml từ mạng vể rồi load lên.
        //String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        //mywebview.loadData(data, "text/html", "UTF-8");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
