package polinema.ac.id.uas.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import polinema.ac.id.uas.Adapters.BukuAdapters;
import polinema.ac.id.uas.R;
import polinema.ac.id.uas.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    private BukuAdapters adapters;


    public ExploreFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        // Inflate the layout for this fragment
        //CardView cardView = (CardView) view.findViewById(R.id.cardview1);
        CardView cardView2 = (CardView) view.findViewById(R.id.cardview2);
        CardView cardView3 = (CardView) view.findViewById(R.id.cardview3);
        CardView cardView4 = (CardView) view.findViewById(R.id.cardview4);
        CardView cardView5 = (CardView) view.findViewById(R.id.cardview5);
        CardView cardView6 = (CardView) view.findViewById(R.id.cardview6);
        CardView cardView7 = (CardView) view.findViewById(R.id.cardview7);
        CardView cardView8 = (CardView) view.findViewById(R.id.cardview8);
        CardView cardView9 = (CardView) view.findViewById(R.id.cardview9);
        CardView cardView10 = (CardView) view.findViewById(R.id.cardview10);



        //cardView.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //    Toast.makeText(getActivity().getApplicationContext(), "Berhasil Membyar", Toast.LENGTH_LONG).show();
        //   Intent i = new Intent(getActivity(), pembayaranActivity.class);
        //  startActivity(i);
        //}
        //});

//        cardView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Pembayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//
//        cardView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//
//        cardView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
//        cardView10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), pembayaranActivity.class);
//                startActivity(i);
//            }
//        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
