package com.movieapp.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TopRatedMovieModel {
    @SerializedName("page")
    private Integer page;
    @SerializedName("results")
    private List<TopRatedMovieResult> results;
    @SerializedName("total_pages")
    private Integer total_pages;
    @SerializedName("total_results")
    private Integer total_results;

    public TopRatedMovieModel(Integer page, List<TopRatedMovieResult> results, Integer total_pages, Integer total_results) {
        this.page = page;
        this.results = results;
        this.total_pages = total_pages;
        this.total_results = total_results;
    }

    public TopRatedMovieModel() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<TopRatedMovieResult> getResults() {
        return results;
    }

    public void setResults(List<TopRatedMovieResult> results) {
        this.results = results;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public Integer getTotal_results() {
        return total_results;
    }

    public void setTotal_results(Integer total_results) {
        this.total_results = total_results;
    }
}
