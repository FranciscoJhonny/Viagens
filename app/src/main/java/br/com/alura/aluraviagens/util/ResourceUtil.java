package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String drawableEmtexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmtexto
                , DRAWABLE, context.getPackageName());
        Drawable drawableImagemPacote = resources.getDrawable(idDoDrawable);
        return drawableImagemPacote;
    }
}
