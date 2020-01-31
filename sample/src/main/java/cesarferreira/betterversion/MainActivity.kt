package cesarferreira.betterversion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.code
import kotlinx.android.synthetic.main.activity_main.name

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        code.text = "versionCode: ${BuildConfig.VERSION_CODE}"
        name.text = "versionName: ${BuildConfig.VERSION_NAME}"
    }
}
