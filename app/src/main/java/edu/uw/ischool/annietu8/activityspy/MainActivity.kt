package edu.uw.ischool.annietu8.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    private val TAG: String = "Activity Spy HW"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // R is short for resource
        Log.i(TAG, "onCreate event fired")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onDestroy event fired")
        Log.e(TAG,"We're going down, Captain!")
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }
}