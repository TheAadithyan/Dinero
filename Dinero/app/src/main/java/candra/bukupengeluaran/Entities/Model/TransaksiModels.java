package com.trinet.dinero.Entities.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Aadithyan Rajeshon 15/10/2017.
 */

public class TransaksiModels {

    @SerializedName("list")
    ArrayList<TransaksiModel> list = new ArrayList<>();

    public void setList(ArrayList<TransaksiModel> list) {
        this.list = list;
    }

    public ArrayList<TransaksiModel> getList() {
        return list;
    }
}
