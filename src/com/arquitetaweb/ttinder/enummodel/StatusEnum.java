package com.arquitetaweb.ttinder.enummodel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by publisoft on 31/07/2014.
 */
public enum StatusEnum {
    @SerializedName("liked")
    LIKED,
    @SerializedName("nope")
    NOPE,
    @SerializedName("ignored")
    IGNORED
}
