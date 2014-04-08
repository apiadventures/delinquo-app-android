package tv.twentyonemedia.delinquo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;
import android.content.Intent;

public class BrowseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String i =(String) b.get("URL");
            TextView view = (TextView) findViewById(R.id.browser_label);
            view.setText(i);

        }

    }
}
