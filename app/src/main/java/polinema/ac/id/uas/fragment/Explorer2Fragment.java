package polinema.ac.id.uas.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.uas.Adapters.BukuAdapters;
import polinema.ac.id.uas.MainActivity;
import polinema.ac.id.uas.activities.pembayaranActivity;
import polinema.ac.id.uas.Models.Buku;
import polinema.ac.id.uas.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 */
public class Explorer2Fragment extends Fragment {

    private List<Buku> bukuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BukuAdapters bukuAdapters;

//    private OnFragmentInteractionListener mListener;

    public Explorer2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explorer2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_buku);

        bukuList.add(new Buku("Dunia Shopie", R.drawable.shopie, 100000));
        bukuList.add(new Buku("Sejarah Tuhan", R.drawable.sejarahtuhan, 120000));
        bukuList.add(new Buku("Animal Farm", R.drawable.animalfarm, 80000));
        bukuList.add(new Buku("Perempuan Titik Nol", R.drawable.titik0, 60000));
        bukuList.add(new Buku("Tidak ada Perempuan di Surga", R.drawable.nawal1, 75000));
        bukuList.add(new Buku("Sapiens", R.drawable.sapiens, 115000));
        bukuList.add(new Buku("Sebuah Seni Untuk Bersihkan Bodoh Amat", R.drawable.sebuahseni, 70000));
        bukuList.add(new Buku("Anak Semua Bangsa", R.drawable.asb, 100000));
        bukuList.add(new Buku("Madilog Tan Malaka", R.drawable.madilog, 100000));


        bukuAdapters = new BukuAdapters(bukuList);
        bukuAdapters.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                startActivity(new Intent(getActivity(), pembayaranActivity.class));
            }
        });
        recyclerView.setAdapter(bukuAdapters);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
    // TODO: Rename method, update argument and hook method into UI event

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
