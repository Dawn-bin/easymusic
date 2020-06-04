package com.example.easymusic;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class MusicIntentService extends IntentService {

    public MusicIntentService() {
        super(null);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
//            Intent intentInfo = new Intent();
//            intentInfo.setAction("UI_info");
//            intentInfo.putExtra("music_id", music_Id);
//            intentInfo.putExtra("music_song", music_song);
//            intentInfo.putExtra("music_singer", music_singer);
//            intentInfo.putExtra("music_duration", music_duration);
            intent.setAction("UI_info");
            sendBroadcast(intent);
        }
    }
}
