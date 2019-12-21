package polinema.ac.id.uas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import polinema.ac.id.uas.R;
import polinema.ac.id.uas.R;
import polinema.ac.id.uas.fragment.AccountFragment;
import polinema.ac.id.uas.fragment.ExploreFragment;
import polinema.ac.id.uas.fragment.Explorer2Fragment;
import polinema.ac.id.uas.fragment.MyBookingsFragment;
import polinema.ac.id.uas.fragment.TalktoUsFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new Explorer2Fragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_explore:
                fragment = new Explorer2Fragment();
                break;
            case R.id.action_boking:
                fragment = new MyBookingsFragment();
                break;
            case R.id.action_chat:
                fragment = new TalktoUsFragment();
                break;
            case R.id.action_account:
                fragment = new AccountFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

}
