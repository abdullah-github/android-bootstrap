package me.hasham.androidbootstrap.util;

import android.app.Activity;
import android.app.ProgressDialog;

/**
 * Created by Hasham.Tahir on 1/27/2016.
 */
public class Loading {

    private ProgressDialog pd;

    public Loading(Activity context, String msg) {

        pd = new ProgressDialog(context);
        pd.setMessage(msg);
        pd.setIndeterminate(true);
        pd.setCancelable(false);
    }

    public void show() {

        pd.show();
    }

    public void dismiss() {
        try {
            pd.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
