package com.movieapp.Repository.RemoteServer;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagedList;

import com.movieapp.Model.TopRatedMovieModel;
import com.movieapp.Model.TopRatedMovieResult;
import com.movieapp.Network.ApiService;
import com.movieapp.Network.RetrofitClient;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TopRatedMovieRepository {

    private  static TopRatedMovieRepository repositoryInstance;
    private static Context mContext;
    private TopRatedMovieModel topRatedMovieModel;
    private List<TopRatedMovieResult> topRatedMovieResult;
    private static MutableLiveData mLiveData;

    public static TopRatedMovieRepository getTopRatedMovieRepository(Context context){

        if (repositoryInstance == null) {
            mContext=context;
            repositoryInstance=new TopRatedMovieRepository();
        }
        return repositoryInstance;
    }

    public MutableLiveData<List<TopRatedMovieResult>>  getMovieResult(){
        if (mLiveData == null) {
            mLiveData=new MutableLiveData();
        }
        ApiService apiService= RetrofitClient.getRetrofitInstance().create(ApiService.class);
        Call<TopRatedMovieModel> call =apiService.getTopRatedMovieList();
        call.enqueue(new Callback<TopRatedMovieModel>() {
            @Override
            public void onResponse(@NonNull Call<TopRatedMovieModel> call, Response<TopRatedMovieModel> response) {
                    topRatedMovieModel=response.body();
                if (topRatedMovieModel == null) {
                }else{
                    topRatedMovieResult=topRatedMovieModel.getResults();
                    mLiveData.postValue(topRatedMovieResult);
                }
            }
            @Override
            public void onFailure(Call<TopRatedMovieModel> call, Throwable t) {
            }
        });
        return mLiveData;
    }
}
