package by.epam.testrepository

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("I want some coffee")

        if (BuildConfig.DEBUG){
            Log.wtf(javaClass.simpleName, "wtfff")

        }
        Log.wtf(javaClass.simpleName, "wtfff2")

    }
}