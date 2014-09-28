package com.arquitetaweb.ttinder;

import com.arquitetaweb.ttinder.dto.MatchModel;

/**
 * Created by Marcos on 09/08/2014.
 */

public interface AsyncTaskListener{
    public void onTaskComplete(MatchModel[] result);
}
