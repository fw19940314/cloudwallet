package cc.mrbird.app.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: jerry.feng
 * @Date: 2018/11/1
 * @Description: API测试
 */
@Data
public class ClouldTestDomain {

    private Long userId;


    private String username;


    private String password;


    private Long deptId;


    private String deptName;


    private String email;


    private String mobile;


    private String status;


    private Date crateTime;


    private Date modifyTime;


    private Date lastLoginTime;


    private String ssex;

    private String theme;

    private String avatar;

    private String description;

    private String roleName;
}
