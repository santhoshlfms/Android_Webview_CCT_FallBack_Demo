package demo.democustomcctflow;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by sannelson on 4/10/2018.
 */

public class OpenCCTActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cct);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        customTabsIntent.intent.setData(Uri.parse("https://www.paypal.com/us/home"));
        startActivityForResult(customTabsIntent.intent,100);

    }
}
