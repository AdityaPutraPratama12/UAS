package polinema.ac.id.uas.Adapters;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import polinema.ac.id.uas.Models.Buku;
import polinema.ac.id.uas.R;

public class BukuAdapters extends BaseQuickAdapter<Buku, BaseViewHolder> {

    public BukuAdapters(@Nullable List<Buku> data) {
        super(R.layout.item_buku,data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Buku item) {
        ImageView img = helper.getView(R.id.cover_buku);
        helper.setText(R.id.text_judul, item.getJudul())
                .setText(R.id.text_harga, String.valueOf(item.getHarga()));
        img.setImageResource(item.getGambar());
    }
}
