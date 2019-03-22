package c.digitalhouse.testecolorido;

import android.graphics.Color;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String textInput = editText.getText().toString().trim();
                textView.setText(" ");


            }


            @Override
            public void afterTextChanged(Editable s) {

                if (editText.length() >= 3) {
                    textView.setTextColor(Color.BLUE);
                    button.setEnabled(true);

                    if (editText.length() >= 10) {
                        textView.setTextColor(Color.GREEN);
                    }

                } else {
                    button.setEnabled(false);
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(editText.getEditableText());





            }
        });


    }

    public void executarAcao(View view) {


    }


}
