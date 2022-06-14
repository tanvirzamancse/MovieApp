package com.movieapp.View.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import android.os.Bundle;
import com.movieapp.Model.TopRatedMovieResult;
import com.movieapp.R;
import com.movieapp.View.Adapter.TopRatedMovieAdapter;
import com.movieapp.ViewModel.MainActivityViewModel;
import com.movieapp.databinding.ActivityMainBinding;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mViewModel;
    private ActivityMainBinding binding;
    private TopRatedMovieAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        binding.movieView.setLayoutManager(gridLayoutManager);

        mViewModel=new ViewModelProvider(this).get(MainActivityViewModel.class);
        mViewModel.getMovieList().observe(this, new Observer<List<TopRatedMovieResult>>() {
            @Override
            public void onChanged(List<TopRatedMovieResult> topRatedMovieResults) {
                mAdapter=new TopRatedMovieAdapter(getApplicationContext(),topRatedMovieResults);
                binding.movieView.setAdapter(mAdapter);
            }
        });
    }
}