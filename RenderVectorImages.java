import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * Created by bhargav on 29/8/16.
 */
public class RenderVectorImages {


  private static Resources res;
  private static Drawable drawable;

    public static void setImage(Context context,ImageView imageView, int drawableRes){
        res = context.getResources();
        drawable = res.getDrawable(drawableRes);
        renderImage(imageView,drawable);
    }
    public static void setImage(Context context,ImageButton imageButton, int drawableRes){
        res = context.getResources();
        drawable = res.getDrawable(drawableRes);
        renderImage(imageButton,drawable);
    }

    public static void setImage(Context context,ImageView imageView, Drawable drawableRes){
        renderImage(imageView,drawableRes);
    }
    public static void setImage(Context context,ImageButton imageButton, Drawable drawableRes){
        renderImage(imageButton,drawableRes);
    }

    // set background
    public static void setBackgroundImage(Context context,ImageView imageView, int drawableRes){
        renderBackgroundImage(imageView,drawableRes);
    }
    public static void setBackgroundImage(Context context,ImageButton imageButton, int drawableRes){
        renderBackgroundImage(imageButton,drawableRes);
    }

    private static void renderBackgroundImage(ImageView imageView,int drawableRes){
        imageView.setBackgroundResource(drawableRes);
    }

    private static void renderBackgroundImage(ImageButton imageButton,int drawableRes){
        imageButton.setBackgroundResource(drawableRes);
    }

    private static void renderImage(ImageView imageView,Drawable drawable){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            VectorDrawable vectorDrawable =  (VectorDrawable) drawable;
            imageView.setImageDrawable(vectorDrawable);
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    private static void renderImage(ImageButton imageButton,Drawable drawable){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            VectorDrawable vectorDrawable =  (VectorDrawable) drawable;
            imageButton.setImageDrawable(vectorDrawable);
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            imageButton.setImageDrawable(bitmapDrawable);
        }
    }

}
