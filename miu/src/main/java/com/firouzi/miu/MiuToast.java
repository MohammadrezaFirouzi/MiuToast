package com.firouzi.miu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MiuToast extends Toast {


    public static int INFO_TYPE = 1;
    public static final int ERROR_TYPE = 2;
    public static final int SUCCESS_TYPE = 3;
    public static final int WARNING_TYPE = 4;
    public static final int CUSTOM_IMAGE_TYPE = 5;




    private static String text = null;
    public MiuToast(Context context) {
        super(context);
    }


    public static Toast miu(Context context, CharSequence message, int duration, int type, boolean  icon, Integer image) {

        Toast toast = new Toast(context);
        toast.setDuration(duration);


        View view = LayoutInflater.from(context).inflate(R.layout.custom_toast, null, false);

        TextView textView = view.findViewById(R.id.toast_text);
        ImageView imageView = view.findViewById(R.id.image_icon);
        LinearLayout linearLayout = view.findViewById(R.id.l_layout);

        textView.setText(message);

        if (icon) {
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.back_normal);
                imageView.setImageResource(R.drawable.info);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.back_error);
                imageView.setImageResource(R.drawable.error);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.back_success);
                imageView.setImageResource(R.drawable.success);
                break;

            case 4:
                linearLayout.setBackgroundResource(R.drawable.back_warning);
                imageView.setImageResource(R.drawable.warning);
                break;

            case 5:

                linearLayout.setBackgroundResource(R.drawable.back_normal);
                imageView.setImageResource(image);
                break;

        }

        toast.setView(view);
        return toast;

        
    }



}
