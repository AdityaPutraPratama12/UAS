package polinema.ac.id.uas.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import polinema.ac.id.uas.R;

public class pembayaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
        CardView cardView = (CardView) findViewById(R.id.cardview1);
        CardView cardView2 = (CardView) findViewById(R.id.cardview2);
        CardView cardView3 = (CardView) findViewById(R.id.cardview3);
        CardView cardView4 = (CardView) findViewById(R.id.cardview4);
        CardView cardView5 = (CardView) findViewById(R.id.cardview5);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "berhasil membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(pembayaranActivity.this, UangActivity.class);
                startActivity(i);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "berhasil membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(pembayaranActivity.this, UangActivity.class);
                startActivity(i);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "Proses Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(pembayaranActivity.this, UangActivity.class);
                startActivity(i);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "Proses Membayar ",Toast.LENGTH_LONG).show();
                Intent i = new Intent(pembayaranActivity.this, UangActivity.class);
                startActivity(i);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "Proses Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(pembayaranActivity.this, UangActivity.class);
                startActivity(i);
            }
        });
    }
}
