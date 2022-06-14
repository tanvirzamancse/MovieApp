package com.movieapp.View.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.movieapp.Model.TopRatedMovieResult;
import com.movieapp.R;
import com.movieapp.View.Activity.MovieDetailsActivity;
import java.util.List;

public class TopRatedMovieAdapter extends RecyclerView.Adapter<TopRatedMovieAdapter.myViewHolder> {
    private Context mContext;
    private List<TopRatedMovieResult> mList;

    public TopRatedMovieAdapter(Context mContext, List<TopRatedMovieResult> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public TopRatedMovieAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(mContext).inflate(R.layout.movie_row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopRatedMovieAdapter.myViewHolder holder,int position) {

       int pos=position;

        Glide.with(holder.itemView.getContext()).load("https://image.tmdb.org/t/p/original"+mList.get(position)
        .getPoster_path()).into(holder.imageView);


        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MovieDetailsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("id",mList.get(pos).getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        if (this.mList!=null){
            return mList.size();
        }else {
            return 0;
        }
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
        }
    }
}
