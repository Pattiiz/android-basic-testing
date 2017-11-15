package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.userNameInput);
        etEmail = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {
        //TODO
        Toast.makeText(this, etName.getText().toString() + ", "  + etEmail.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void onRevertClick(View view) {
        //TODO
        etName.setText("");
        etEmail.setText("");
    }
}
