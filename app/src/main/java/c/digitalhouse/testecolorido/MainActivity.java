package c.digitalhouse.testecolorido;

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
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        editText = findViewById( R.id.editText );
        textView = findViewById( R.id.textView );
        button = findViewById( R.id.button );

        editText.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String textInput = editText.getText().toString().trim();
                textView.setText( s );
                button.setEnabled( !textInput.isEmpty() );

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (editText.length() > 3) {
                    button.setEnabled( true );
                } else {
                    button.setEnabled( false );
                }

            }
        } );


    }

    public void executarAcao(View view) {


    }
}
