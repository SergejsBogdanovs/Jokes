package lv.st.sbogdano.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokesActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView jokeTextView = findViewById(R.id.jokeTv);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(EXTRA_JOKE)) {
            String joke = intent.getStringExtra(EXTRA_JOKE);
            jokeTextView.setText(joke);
        } else {
            Toast.makeText(this, R.string.no_jokes, Toast.LENGTH_SHORT).show();
        }

    }
}
