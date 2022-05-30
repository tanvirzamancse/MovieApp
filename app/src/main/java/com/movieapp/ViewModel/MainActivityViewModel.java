package com.movieapp.ViewModel;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.movieapp.Model.TopRatedMovieResult;
import com.movieapp.Repository.RemoteServer.TopRatedMovieRepository;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private TopRatedMovieRepository mRepo;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mRepo=TopRatedMovieRepository.getTopRatedMovieRepository(application);
    }
    public LiveData<List<TopRatedMovieResult>> getMovieList(){
        return mRepo.getMovieResult();
    }
}
