package mov.guias

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val toolBar: Toolbar
        get() = findViewById(R.id.toolbar)

    private val btnSnackbar : Button
        get() = findViewById(R.id.btnSnackbar)

    private val layoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar.let {
            setSupportActionBar(toolBar)
        }

        btnSnackbar.setOnClickListener {
            val mySnackbar = Snackbar.make(findViewById(R.id.layoutPrincipal), R.string.app_name, Snackbar.LENGTH_LONG)
            mySnackbar.setAction(R.string.undo_string, MyUndoListener())
            mySnackbar.show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu_item1 -> {
                Log.d("TEST", "PRESS ICON MENU")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}