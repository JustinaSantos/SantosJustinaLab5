package justina.santos.com.santosjustinalab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH","OnCreate() is running!");
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","OnStart() is running!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH","OnResume() is running!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH","OnPause() is running!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH","OnStop() is running!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH","OnRestart() is running!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "OnDestroy() is running!");
    }

    public void process(View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.act2)
        {
            i = new Intent(this, activity2.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.map)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5877573,120.9749392"));
            chooser = Intent.createChooser(i, "Select map application:");
            startActivity(chooser);
        }
    }
}
