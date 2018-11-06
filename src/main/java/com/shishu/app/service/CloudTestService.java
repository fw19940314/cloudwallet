package com.shishu.app.service;

import com.shishu.app.domain.ClouldTestDomain;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
public interface CloudTestService {
    List<ClouldTestDomain> findUser();
}
