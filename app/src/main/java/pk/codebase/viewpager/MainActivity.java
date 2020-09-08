package pk.codebase.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.myToolBar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.myViewPager);

        setSupportActionBar(toolbar);

        setUpViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new ChatFragment(),"Chats");
        viewPagerAdapter.addFragment(new StatusFragment(), "Status");
        viewPagerAdapter.addFragment(new CallsFragment(), "Calls");
        viewPager.setAdapter(viewPagerAdapter);
    }
}