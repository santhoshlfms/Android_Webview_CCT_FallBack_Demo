package demo.democustomcctflow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by sannelson on 4/10/2018.
 */

public class ShoppingWebview extends Activity{

    private WebView webView;
    JavascriptInterface JSInterface;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);

        webView = (WebView) findViewById(R.id.shopContainer);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavaScriptInterface(), "JSInterface");
        webView.loadUrl("https://mobile-site-demo.herokuapp.com/");

    }

    public class JavaScriptInterface {
        JavaScriptInterface() {
        }

        @android.webkit.JavascriptInterface
        public void changeActivity()
        {
            Intent i = new Intent(ShoppingWebview.this, OpenCCTActivity.class);
            startActivity(i);
            finish();
        }
    }

    }

