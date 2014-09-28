package com.arquitetaweb.ttinder.dto;

import com.arquitetaweb.ttinder.enummodel.StatusEnum;

import java.io.Serializable;
import java.util.List;


/**
 * Created by publisoft on 31/07/2014.
 */
public class MatchModel implements Serializable {

    private static final long serialVersionUID = -4908902672708160542L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String id;

    private String name;

    private String bio;

    private String birth_date;

    private String ping_time;

    private String[] photos;

    private String[] common_friends;

    private StatusEnum status;

//    private PeriodEnum period;
//
//    private Boolean confirmed;
//
//    private Boolean ads;
//
//    private List<DayWeekEnum> days;
}
