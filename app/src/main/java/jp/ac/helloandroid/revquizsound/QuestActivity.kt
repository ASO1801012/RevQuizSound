package jp.ac.helloandroid.revquizsound

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quest.*

class QuestActivity : AppCompatActivity() {
    private lateinit var soundPool:SoundPool
    private var sound1Id=0;
    private var sound2Id=0;
    private var sound3Id=0;
    private var sound4Id=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest)
    }


    override fun onResume() {
        super.onResume();
        soundPool= SoundPool(500,AudioManager.STREAM_ALARM,0);
        sound1Id=soundPool.load(this,R.raw.quiz2,1);
        sound2Id=soundPool.load(this,R.raw.quiz1,1);
        sound3Id=soundPool.load(this,R.raw.kansei,1);
        sound4Id=soundPool.load(this,R.raw.yooo,1);

        btn1.setOnClickListener{
            soundPool.play(sound1Id,1.0f,100f,0,0,1.0f);
        }

        btn2.setOnClickListener{
            soundPool.play(sound1Id,1.0f,100f,0,0,1.0f);
        }

        btn3.setOnClickListener{
            soundPool.play(sound1Id,1.0f,100f,0,0,1.0f);
        }

        btn3.setOnClickListener{
            soundPool.play(sound1Id,1.0f,100f,0,0,1.0f);
        }

    }

    override fun onPause() {
        super.onPause();
        soundPool.release();
    }
}
