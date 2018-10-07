package justina.santos.com.santosjustinalab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class activity2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    public void process(View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.act1)
        {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.map)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5954569,120.9928622"));
            chooser = Intent.createChooser(i, "Select map application:");
            startActivity(chooser);
        }
    }
}
