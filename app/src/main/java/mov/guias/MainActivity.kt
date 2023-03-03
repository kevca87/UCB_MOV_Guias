package mov.guias

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private val btnLight: Button
        get() = findViewById(R.id.btnLight)
    private val btnDark: Button
        get() = findViewById(R.id.btnDark)
    private val layoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDark.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.DKGRAY)
        }
        btnLight.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
}