package com.istic.service;

import com.istic.constants.FormNoTypeEnum;

/**
 * Created by hch on 2019/7/24.
 */
public interface FormNoGenerateService {
    String generateFormNo(FormNoTypeEnum formNoTypeEnum);

}
