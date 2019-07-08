package marketplace.jpr.com.interviewrecyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import marketplace.jpr.com.interviewrecyclerview.R;
import marketplace.jpr.com.interviewrecyclerview.adapter.ShowAdapter;
import marketplace.jpr.com.interviewrecyclerview.model.ShowData;





        public class MainActivity extends AppCompatActivity {
            private List<ShowData>movieList = new ArrayList<>();
            private RecyclerView recyclerView;
            private ShowAdapter mShowAdapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                //setSupportActionBar(toolbar);

                recyclerView = (RecyclerView) findViewById(R.id.recycler);

                mShowAdapter = new ShowAdapter(movieList);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mShowAdapter);

                prepareMovieData();
            }

            private void prepareMovieData() {
                ShowData movie = new ShowData("Mad Max: Fury Road", "Action & Adventure", "2015");
                movieList.add(movie);

                movie = new ShowData("Inside Out", "Animation, Kids & Family", "2015");
                movieList.add(movie);

                movie = new ShowData("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
                movieList.add(movie);

                movie = new ShowData("Shaun the Sheep", "Animation", "2015");
                movieList.add(movie);

                movie = new ShowData("The Martian", "Science Fiction & Fantasy", "2015");
                movieList.add(movie);

                movie = new ShowData("Mission: Impossible Rogue Nation", "Action", "2015");
                movieList.add(movie);

                movie = new ShowData("Up", "Animation", "2009");
                movieList.add(movie);

                movie = new ShowData("Star Trek", "Science Fiction", "2009");
                movieList.add(movie);

                movie = new ShowData("The LEGO Movie", "Animation", "2014");
                movieList.add(movie);

                movie = new ShowData("Iron Man", "Action & Adventure", "2008");
                movieList.add(movie);

                movie = new ShowData("Aliens", "Science Fiction", "1986");
                movieList.add(movie);

                movie = new ShowData("Chicken Run", "Animation", "2000");
                movieList.add(movie);

                movie = new ShowData("Back to the Future", "Science Fiction", "1985");
                movieList.add(movie);

                movie = new ShowData("Raiders of the Lost Ark", "Action & Adventure", "1981");
                movieList.add(movie);

                movie = new ShowData("Goldfinger", "Action & Adventure", "1965");
                movieList.add(movie);

                movie = new ShowData("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
                movieList.add(movie);

              // movieList.notifyDataSetChanged();
            }
        }




