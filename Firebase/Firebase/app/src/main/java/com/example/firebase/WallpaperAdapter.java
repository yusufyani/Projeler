package com.example.firebase;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.WallpaperViewHolder> {
    private List<Wallpaper> wallpaperList;
    private Context context;

    public WallpaperAdapter(List<Wallpaper> wallpaperList, Context context) {
        this.wallpaperList = wallpaperList;
        this.context = context;
    }

    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.wallpaper_item, parent, false);
        return new WallpaperViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperViewHolder holder, int position) {
        Wallpaper wallpaper = wallpaperList.get(position);
        holder.textViewTitle.setText(wallpaper.getTitle());
        Picasso.get().load(wallpaper.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return wallpaperList.size();
    }

    class WallpaperViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        ImageView imageView;

        WallpaperViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
