package ua.edu.lntu.cw_2
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonSignIn = findViewById<Button>(R.id.buttonSignIn)

        buttonSignIn.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            //Перехід до активності Sing In Успішний
            if (email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, SignInSuccessActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Будь-ласка, введіть пошту та пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
