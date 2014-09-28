package com.arquitetaweb.ttinder;

import com.arquitetaweb.ttinder.dto.FeiraModel;

/**
 * Created by Marcos on 09/08/2014.
 */

public interface AsyncTaskListener{
    public void onTaskComplete(FeiraModel[] result);
}
