package com.movieapp.Repository.RemoteServer;
import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import com.movieapp.Model.MovieDetails.TopRatedMovieDetails;
import com.movieapp.Network.ApiService;
import com.movieapp.Network.RetrofitClient;
import com.movieapp.View.Activity.MovieDetailsActivity;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TopRatedMovieDetailsRepo {
//
//    private static TopRatedMovieDetailsRepo repo;
//    private  TopRatedMovieDetails movieDetails;
//    private  List<TopRatedMovieDetails> detailsList;
//    private MutableLiveData mlive;
//    private static Context dcontext;
//    private String url;
//
//    private static int id= MovieDetailsActivity.id;
//
//    public static TopRatedMovieDetailsRepo mDetailsRepo(Context context){
//        if (repo == null) {
//            dcontext=context;
//            repo=new TopRatedMovieDetailsRepo();
//        }
//        return repo;
//    }
//
//    public MutableLiveData<List<TopRatedMovieDetails>> getMovieDetails(){
//
//        if (mlive==null){
//            mlive=new MutableLiveData();
//        }
//        url="movie/"+String.valueOf(id)+"?api_key=c37d3b40004717511adb2c1fbb15eda4&language=en-US";
//        ApiService apiService= RetrofitClient.getRetrofitInstance().create(ApiService.class);
//        Call<TopRatedMovieDetails>  call=apiService.getTopRatedDetailsList(url);
//        call.enqueue(new Callback<TopRatedMovieDetails>() {
//           @Override
//           public void onResponse(Call<TopRatedMovieDetails> call, Response<TopRatedMovieDetails> response) {
//               movieDetails=response.body();
//
//               if (movieDetails == null) {
//                  Toast.makeText(dcontext.getApplicationContext(), "null :", Toast.LENGTH_SHORT).show();
//               }else {
//                  Toast.makeText(dcontext.getApplicationContext(), "mList :"+movieDetails, Toast.LENGTH_SHORT).show();
//                   mlive.postValue(movieDetails);
//               }
//
//           }
//
//           @Override
//           public void onFailure(Call<TopRatedMovieDetails> call, Throwable t) {
//
//           }
//       });
//     return mlive;
//    }

}
