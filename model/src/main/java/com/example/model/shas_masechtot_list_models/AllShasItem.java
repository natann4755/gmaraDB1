package com.example.model.shas_masechtot_list_models;

import java.io.Serializable;
import java.util.List;

public class AllShasItem implements Serializable {

//    @SerializedName("seder")
    private List<SederItem> seder;

    public List<SederItem> getSeder() {
        return seder;
    }

    public List<SederItem> getSederCollection() {
        return seder;
    }

    public void setSeder(List<SederItem> seder) {
        this.seder = seder;
    }
}
