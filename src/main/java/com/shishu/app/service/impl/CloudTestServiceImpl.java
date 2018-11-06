package com.shishu.app.service.impl;

import com.shishu.app.domain.ClouldTestDomain;
import com.shishu.app.mapper.CloudTestMapper;
import com.shishu.app.service.CloudTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
@Service
public class CloudTestServiceImpl implements CloudTestService {
    @Autowired
    private CloudTestMapper cloudTestMapper;

    @Override
    public List<ClouldTestDomain> findUser() {
        return cloudTestMapper.findUser();
    }
}
