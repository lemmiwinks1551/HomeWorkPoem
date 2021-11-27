package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

/**
Последовательность работы с устройством:
 1. Открыть приложение
 2. Закрыть приложение
 */

const val TAG = "MainActivity"https://github.com/lemmiwinks1551/HomeWorkPoem.git
const val KEY = "random text"

lateinit var randomTextView: TextView
lateinit var randomButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d(TAG,"onCreate")

        Log.d(TAG,"Ты видел деву на скале\n")
        Log.d(TAG,"В одежде белой над волнами\n")

        randomTextView = findViewById(R.id.hello_world_text_view)
        randomButton = findViewById((R.id.new_text_button))

        if (savedInstanceState != null){
            randomTextView.text = savedInstanceState.getString(KEY)
        }

        randomButton.setOnClickListener {
            randomize()
        }
    }

    override fun onStart() {
        super.onStart()

        //Log.d(TAG,"onStart")

        Log.d(TAG,"Когда, бушуя в бурной мгле,\n")
        Log.d(TAG,"Играло море с берегами,\n")
    }

    override fun onResume() {
        super.onResume()

        //Log.d(TAG,"onResume")

        Log.d(TAG,"Когда луч молний озарял,\n")
        Log.d(TAG,"Ее всечасно блеском алым,\n")
    }

    override fun onPause() {
        super.onPause()
        //Log.d(TAG,"onPause")

        Log.d(TAG,"И ветер бился и летал")
        Log.d(TAG,"С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        //Log.d(TAG,"onStop")

        Log.d(TAG,"Прекрасно море в бурной мгле")
        Log.d(TAG,"И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        //Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Log.d(TAG,"onDestroy")

        Log.d(TAG,"Но верь мне: дева на скале")
        Log.d(TAG,"Прекрасней волн, небес и бури.")

    }

    fun randomize() {
        randomTextView.text = Random.nextInt(100).toString()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState.putString(KEY, randomTextView.text.toString())
    }
}