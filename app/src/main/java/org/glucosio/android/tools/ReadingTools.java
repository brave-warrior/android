package org.glucosio.android.tools;

import android.content.Context;

import org.glucosio.android.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadingTools {
    Context mContext;

    public ReadingTools(Context mContext) {
        this.mContext = mContext;
    }

    public String convertDate(String date) {
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        DateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date parsed = null;
        try {
            parsed = inputFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return outputFormat.format(parsed);
    }

    public String typeToString(int typeInt){
        String typeString = "";
        if (typeInt == 0) {
            typeString = mContext.getString(R.string.dialog_add_type_1);

        } else if (typeInt == 1) {
            typeString = mContext.getString(R.string.dialog_add_type_2);

        } else if (typeInt == 2) {
            typeString = mContext.getString(R.string.dialog_add_type_3);

        } else if (typeInt == 3) {
            typeString = mContext.getString(R.string.dialog_add_type_4);

        } else if (typeInt == 4) {
            typeString = mContext.getString(R.string.dialog_add_type_5);

        } else if (typeInt == 5) {
            typeString = mContext.getString(R.string.dialog_add_type_6);
        }
        return  typeString;
    }
}
