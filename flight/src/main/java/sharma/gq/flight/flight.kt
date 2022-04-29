package sharma.gq.flight

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import java.net.URL
import java.nio.file.Path

object flight {
    fun listen(context : Context, string: String, imageView : ImageView){
        Glide.with(context).load(string).into(imageView);
    }
    fun default(state: Boolean,context: Context, string: String, imageView : ImageView){
        if(!state){
            Glide.with(context).load("https://cdn-icons-png.flaticon.com/512/984/984233.png").into(imageView);
        }else{
            Glide.with(context).load(string).into(imageView);
        }
    }
   

    fun fragmentRunner(fragment : Fragment, url: URL, drawable: Drawable, imageView: ImageView){
        Glide
            .with(fragment)
            .load(url)
            .centerCrop()
            .placeholder(drawable)
            . into (imageView);
    }
}


