package polinema.ac.id.uas.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import polinema.ac.id.uas.R;
import polinema.ac.id.uas.activities.AboutActivity;
import polinema.ac.id.uas.activities.LoginActivity;
import polinema.ac.id.uas.activities.RegistrasiActivity;
import polinema.ac.id.uas.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {


    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        Button Login = (Button) view.findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), LoginActivity.class);
                startActivity(in);
            }
        });

        Button registrasi = (Button) view.findViewById(R.id.registrasi);
        registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), RegistrasiActivity.class);
                startActivity(in);
            }
        });

        Button pembayaran = (Button) view.findViewById(R.id.pembayaran);
        pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(in);
            }
        });

        Button contact = (Button) view.findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), polinema.ac.id.uas.fragment.TalktoUsFragment.class);
                startActivity(in);
            }
        });

        Button about = (Button) view.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AboutActivity.class);
                startActivity(in);
            }
        });
        return view;
    }

}
