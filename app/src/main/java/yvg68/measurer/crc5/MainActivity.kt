package yvg68.measurer.crc5
// intent, logs
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Посмотри на календарь —\n" +
                "Приближается январь.")


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Это значит, Новый год\n" +
                "Собирается в поход.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Снег сверкает ярко-ярко,\n" +
                "Мне и весело, и жарко.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Это значит, что зимой —\n" +
                "Самый лучший праздник мой.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Мы сегодня так устали —\n" +
                "Дома ёлку наряжали.")
   }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Это значит, Новый год\n" +
                "Обязательно придёт!")
    }


}