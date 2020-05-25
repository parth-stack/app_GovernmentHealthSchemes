package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class facilities extends AppCompatActivity {

    Button location;
    WebView portal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        location=findViewById(R.id.hospital);
        portal=findViewById(R.id.webview);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Hospitals Near Me"));
                startActivity(mapIntent);
            }
        });
        portal.setWebViewClient(new WebViewClient());
        portal.getSettings().setJavaScriptEnabled(true);
        portal.loadUrl("https://hospitals.pmjay.gov.in/Search/empnlWorkFlow.htm?actionFlag=ViewRegisteredHosptlsNew");
    }
}
