package tech.nadlan.com.slamtkomapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        webView.loadUrl("http://mohamdibrahem.com");
        webView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {

        Log.i("urlWeb",webView.getUrl());

        if(webView.getUrl().equals("http://mohamdibrahem.com/login") || webView.getUrl().equals("http://mohamdibrahem.com/")
                ||webView.getUrl().equals("http://mohamdibrahem.com")||
                webView.getUrl().equals("http://mohamdibrahem.com/dashboard"))
        {
            super.onBackPressed();
        }else {
         webView.goBack();

        }
    }
}
