package polinema.ac.id.uas.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import polinema.ac.id.uas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TalktoUsFragment extends Fragment {


    public TalktoUsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_talkto_us, container, false);
        // Inflate the layout for this fragment
        ImageView ImageView1 = (ImageView) view.findViewById(R.id.images1);
        ImageView ImageView2 = (ImageView) view.findViewById(R.id.images2);
        ImageView ImageView3 = (ImageView) view.findViewById(R.id.images3);
        ImageView ImageView4 = (ImageView) view.findViewById(R.id.images4);


        ImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Berhasil", Toast.LENGTH_LONG).show();
            }
        });
        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Berhasil", Toast.LENGTH_LONG).show();

            }
        });
        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Berhasil", Toast.LENGTH_LONG).show();

            }
        });
        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getContext(), "Berhasil", Toast.LENGTH_LONG).show();

            }
        });


        return view;
    }

}
