package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.vo.AddDepart;
import com.istic.entity.vo.UpdateDepart;

/**
 * Created by hch on 2019/7/25.
 */
public interface DepartMentService {
    Result addDepart(AddDepart addDepart);

    Result updateDepart(UpdateDepart updateDepart);

    Result selectDepartsByName(String departName);
}
