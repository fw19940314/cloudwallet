package com.shishu.app.api;

import com.shishu.app.domain.ClouldTestDomain;
import com.shishu.app.service.CloudTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
@RestController
public class CloudTestApi {

    @Autowired
    private CloudTestService cloudTestService;


    @RequestMapping("/user/page")
    public List<ClouldTestDomain> findUser(){
        return cloudTestService.findUser();
    }

}
