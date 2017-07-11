# RenderVectorImage
Rendering Vector images in android

How to use?

RenderVectorImages.setImage(context,<your ImageView/ImageButton>,<Drawable resource / image ID>);
> RenderVectorImages.setImage(context,holder.icon,getResources().getDrawable(R.drawable.image));
> RenderVectorImages.setImage(context,holder.icon,R.drawable.image);

RenderVectorImages.setBackgroundImage(context,<your ImageView/ImageButton>,<Drawable resource / image ID>);
> RenderVectorImages.setBackgroundImage(context,mHolder.play,R.drawable.image);
> RenderVectorImages.setBackgroundImage(context,mHolder.play,getResources().getDrawable(R.drawable.image));

