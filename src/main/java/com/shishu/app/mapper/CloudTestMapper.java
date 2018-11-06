package com.shishu.app.mapper;

import com.shishu.app.domain.ClouldTestDomain;
import com.shishu.common.config.MyMapper;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
public interface CloudTestMapper extends MyMapper<ClouldTestDomain> {
    List<ClouldTestDomain> findUser();
}
