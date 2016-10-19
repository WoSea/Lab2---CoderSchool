package com.codepath.android.booksearch.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.android.booksearch.R;
import com.codepath.android.booksearch.model.Book;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Book> mBooks;

    public BookAdapter() {
        this.mBooks = new ArrayList<>();
    }

    public void setBooks(List<Book> books) {
        // TODO: Insert your code here
        mBooks=books;
        notifyDataSetChanged();

    }

    public void addBooks(List<Book> books) {
         int startPosition = getItemCount();
        // TODO: Insert your code here
        mBooks.addAll(books);
        notifyItemRangeChanged(startPosition,books.size());
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO: Insert your code here
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // TODO: Insert your code here
        Book book= mBooks.get(position);
        ViewHolder viewholder= (ViewHolder) holder;
        viewholder.tvTitle.setText("Tadk1");
        Picasso.with(holder.)

    }

    @Override
    public int getItemCount() {
        // TODO: Update this function
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivCover)
        ImageView ivCover;

        @BindView(R.id.tvTitle)
        TextView tvTitle;

        @BindView(R.id.tvAuthor)
        TextView tvAuthor;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
