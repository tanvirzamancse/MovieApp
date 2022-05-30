package com.movieapp.View.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;;
import com.movieapp.Model.MovieDetails.TopRatedMovieDetails;
import com.movieapp.R;
import com.movieapp.Repository.RemoteServer.TopRatedMovieDetailsRepo;
import com.movieapp.ViewModel.MovieDetailsActivityViewModel;
import java.util.List;
public class  MovieDetailsActivity extends AppCompatActivity {
    public static int id;
    private MovieDetailsActivityViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
//        Intent intent=getIntent();
//        id=intent.getIntExtra("id",0);
//
//        mViewModel=new ViewModelProvider(this).get(MovieDetailsActivityViewModel.class);

    }
}