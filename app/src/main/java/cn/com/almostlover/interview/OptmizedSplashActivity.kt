package cn.com.almostlover.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug

class OptmizedSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Debug.startMethodTracing("interview")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optmized_splash)
        Debug.stopMethodTracing()
    }
}
