package com.ishwar.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplanModeChangedReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Running on Receive function", Toast.LENGTH_SHORT).show()
        val isAirplaneModeEnable=intent?.getBooleanExtra("state",false)
        if(isAirplaneModeEnable == true){
            Toast.makeText(context, "Airplane mode enable", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "Airplane mode disable", Toast.LENGTH_LONG).show()
        }
    }
}