package com.movieapp.Network;
import com.movieapp.Model.MovieDetails.TopRatedMovieDetails;
import com.movieapp.Model.TopRatedMovieModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
public interface ApiService {
    @GET("movie/top_rated?api_key=c37d3b40004717511adb2c1fbb15eda4&language=en-US&page=5")
    Call<TopRatedMovieModel> getTopRatedMovieList();

//    @GET
//    Call<TopRatedMovieDetails> getTopRatedDetailsList(@Url String url);

}
