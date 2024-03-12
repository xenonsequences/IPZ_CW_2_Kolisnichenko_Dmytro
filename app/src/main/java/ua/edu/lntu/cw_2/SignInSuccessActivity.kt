package ua.edu.lntu.cw_2
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_success)

        val textViewSuccessMessage = findViewById<TextView>(R.id.textViewSuccessMessage)
        val textViewUserEmail = findViewById<TextView>(R.id.textViewUserEmail)
        val buttonSignOut = findViewById<Button>(R.id.buttonSignOut)

        // Отримання Email з Intent
        val email = intent.getStringExtra("email")

        textViewUserEmail.text = "Email: $email"

        buttonSignOut.setOnClickListener {
            // Перехід на стан "Sign In" і видалення даних
            val intent = Intent(this, SignInActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }
}
