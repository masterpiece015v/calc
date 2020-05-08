package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //桁数シークバーのイベント登録
        seekBar.setOnSeekBarChangeListener(SeekBarEvent())
    }

    //桁数シークバーのイベントクラス
    inner class SeekBarEvent: SeekBar.OnSeekBarChangeListener{
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            textSeekWindow.text = p1.toString()
            //TODO("Not yet implemented")
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {
            //TODO("Not yet implemented")
        }

        override fun onStopTrackingTouch(p0: SeekBar?) {
            //TODO("Not yet implemented")
        }

    }
}
