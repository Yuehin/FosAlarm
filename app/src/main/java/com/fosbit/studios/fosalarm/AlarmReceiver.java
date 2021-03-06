package com.fosbit.studios.fosalarm;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Tatson on 05-Apr-17.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive( final Context context, Intent intent ) {
        AlarmJobIntentService.enqueueWork( context, intent );
        setResultCode( Activity.RESULT_OK );
    }
}
