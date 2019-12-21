package polinema.ac.id.uas.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import polinema.ac.id.uas.R;
import polinema.ac.id.uas.activities.b10Activity;
import polinema.ac.id.uas.activities.b11Activity;
import polinema.ac.id.uas.activities.b1Activity;
import polinema.ac.id.uas.activities.b2Activity;
import polinema.ac.id.uas.activities.b3Activity;
import polinema.ac.id.uas.activities.b4Activity;
import polinema.ac.id.uas.activities.b5Activity;
import polinema.ac.id.uas.activities.b6Activity;
import polinema.ac.id.uas.activities.b7Activity;
import polinema.ac.id.uas.activities.b8Activity;
import polinema.ac.id.uas.activities.b9Activity;
import polinema.ac.id.uas.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyBookingsFragment extends Fragment {


    public MyBookingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_bookings, container, false);

        ImageView ImageView1 = (ImageView) view.findViewById(R.id.images1);
        ImageView ImageView2 = (ImageView) view.findViewById(R.id.images2);
        ImageView ImageView3 = (ImageView) view.findViewById(R.id.images3);
        ImageView ImageView4 = (ImageView) view.findViewById(R.id.images4);
        ImageView ImageView5 = (ImageView) view.findViewById(R.id.images5);
        ImageView ImageView6 = (ImageView) view.findViewById(R.id.images6);
        ImageView ImageView7 = (ImageView) view.findViewById(R.id.images7);
        ImageView ImageView8 = (ImageView) view.findViewById(R.id.images8);
        ImageView ImageView9 = (ImageView) view.findViewById(R.id.images9);
        ImageView ImageView10 = (ImageView) view.findViewById(R.id.images10);
        ImageView ImageView11 = (ImageView) view.findViewById(R.id.images11);
        CardView cardView1 = (CardView) view.findViewById(R.id.cardview1);
        CardView cardView2 = (CardView) view.findViewById(R.id.cardview2);
        CardView cardView3 = (CardView) view.findViewById(R.id.cardview3);
        CardView cardView4 = (CardView) view.findViewById(R.id.cardview4);
        CardView cardView5 = (CardView) view.findViewById(R.id.cardview5);

        ImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Malang", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b1Activity.class);
                startActivity(i);
            }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b2Activity.class);
                startActivity(i);
            }
        });

        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Jakarta", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b3Activity.class);
                startActivity(i);
            }
        });

        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Kota Batu", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b4Activity.class);
                startActivity(i);
            }
        });

        ImageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Semarang", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b5Activity.class);
                startActivity(i);
            }
        });

        ImageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Jogjakarta", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b6Activity.class);
                startActivity(i);
            }
        });

        ImageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Bali", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), b7Activity.class);
                startActivity(i);
            }
        });

        ImageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b8Activity.class);
                startActivity(i);
            }
        });

        ImageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b9Activity.class);
                startActivity(i);
            }
        });

        ImageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b10Activity.class);
                startActivity(i);
            }
        });

        ImageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), b11Activity.class);
                startActivity(i);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Memilih Metode Pembayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Memilih Metode Pembayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });
        return view;
    }

}
