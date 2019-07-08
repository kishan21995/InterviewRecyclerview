package marketplace.jpr.com.interviewrecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import marketplace.jpr.com.interviewrecyclerview.R;
import marketplace.jpr.com.interviewrecyclerview.model.ShowData;

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.MyViewHolder> {
    List<ShowData>showAdapterList;
    Context context;

    public ShowAdapter(List<ShowData> showAdapterList) {
        this.showAdapterList = showAdapterList;
        this.context = context;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_item, viewGroup, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        ShowData movie = showAdapterList.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return showAdapterList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title,genre,year;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
            genre=itemView.findViewById(R.id.genre);
            year=itemView.findViewById(R.id.year);

        }
    }
}
