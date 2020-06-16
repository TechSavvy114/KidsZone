package sdk.its;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService9 extends Service {
    MediaPlayer mediaPlayer;
    public MyService9() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void onCreate()
    {

        super.onCreate();
        mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.nine);

    }

    public void onStart(Intent intent,int x)
    {
        mediaPlayer.start();
        Toast.makeText(getApplicationContext(),"On Start",Toast.LENGTH_LONG).show();
    }
}
