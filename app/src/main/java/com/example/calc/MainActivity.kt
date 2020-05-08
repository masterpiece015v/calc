package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var total : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 0 の設定
        btn0.setOnClickListener {
            setDisplay( 0 )
        }
        // 1 の設定
        btn1.setOnClickListener {
            setDisplay( 1 )
        }
        // 2 の設定
        btn2.setOnClickListener {
            setDisplay( 2 )
        }
        // 3 の設定
        btn3.setOnClickListener {
            setDisplay( 3 )
        }
        // 4 の設定
        btn4.setOnClickListener {
            setDisplay( 4 )
        }
        // 5 の設定
        btn5.setOnClickListener {
            setDisplay( 5 )
        }
        // 6 の設定
        btn6.setOnClickListener {
            setDisplay( 6 )
        }
        // 7 の設定
        btn7.setOnClickListener {
            setDisplay( 7 )
        }
        // 8 の設定
        btn8.setOnClickListener {
            setDisplay( 8 )
        }
        // 9 の設定
        btn9.setOnClickListener {
            setDisplay( 9 )
        }
        //桁数シークバーのイベント登録
        seekBar.setOnSeekBarChangeListener(SeekBarEvent())
    }
    fun add( value1 : String , value2 : String){
        
    }
    //ディスプレイに数字を書き込む
    fun setDisplay(value : Int){
        if( textDisplay.text == "0" ){
            textDisplay.text = value.toString()
        }else{
            textDisplay.text = textDisplay.text.toString() + value.toString()
        }
    }
    //ディスプレイの値を取得する
    fun getTextDisplay():Double{
        return textDisplay.text.toString().toDouble()
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
