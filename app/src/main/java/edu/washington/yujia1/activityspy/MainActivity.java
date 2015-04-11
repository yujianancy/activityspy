package edu.washington.yujia1.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","onCreate event fired.");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("Main Activity","onCreateOptionsMenu event fired.");
        return true;
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i("Main Activity","onStart event fired.");
    }

    @Override
    public void onRestart(){
        super.onStart();
        Log.i("Main Activity","onRestart event fired.");
    }

    @Override
    public void onResume(){
        super.onStart();
        Log.i("Main Activity","onResume event fired.");
    }

    @Override
    public void onPause(){
        super.onStart();
        Log.i("Main Activity","onPause event fired.");
    }

    @Override
    public void onStop(){
        super.onStart();
        Log.i("Main Activity","onStop event fired.");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        Log.i("Main Activity","onOptionsItemSelected event fired.");
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e("Main Activity","We’re going down, Captain!");
    }
}
