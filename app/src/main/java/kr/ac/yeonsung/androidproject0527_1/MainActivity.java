package kr.ac.yeonsung.androidproject0527_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView auto = findViewById(R.id.auto);
        MultiAutoCompleteTextView multi = findViewById(R.id.multi);

        String[] items = {"CSI-NewYork", "CSI-Maimi", "CSI-Lasvegas", "Friends", "Frange", "France", "GoodDoctor", "goodbye", "junk"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
        auto.setAdapter(adapter);

        MultiAutoCompleteTextView.CommaTokenizer tokenizer = new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setTokenizer(tokenizer);
        multi.setAdapter(adapter);

    }
}