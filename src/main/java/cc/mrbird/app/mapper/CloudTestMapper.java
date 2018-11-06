package cc.mrbird.app.mapper;

import cc.mrbird.app.domain.ClouldTestDomain;
import cc.mrbird.common.config.MyMapper;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
public interface CloudTestMapper extends MyMapper<ClouldTestDomain> {
    List<ClouldTestDomain> findUser();
}
