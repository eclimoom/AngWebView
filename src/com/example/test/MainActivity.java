package com.example.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint({ "SetJavaScriptEnabled", "JavascriptInterface" })
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);

		final String[] paths = {"scripts/libs/angular.min.js", "scripts/test.js" };
		final String params = "{'cid':'HBDM-0001999','host':'http://192.168.4.139:73'}";
		webView.setWebViewClient(new WebViewClient() {
		    @Override
	        public void onPageStarted(WebView view, String url, Bitmap favicon) {
	            Log.d("TAG", "ddd");
	    		String str = new TestAngularParams().birthJSByFilePathName(paths,params);
	    		view.loadUrl(str); 
	        }
		});
		webView.loadUrl("file:///android_asset/test.html");
	}
}
