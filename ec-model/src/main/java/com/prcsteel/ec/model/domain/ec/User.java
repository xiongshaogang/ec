package com.prcsteel.ec.model.domain.ec;

// default package
// Generated April 19, 2016 11:32:10 AM by Hibernate Tools 3.4.0.CR1

import com.prcsteel.ec.model.annotations.Column;
import com.prcsteel.ec.model.annotations.Entity;
import com.prcsteel.ec.model.annotations.KeyColumn;
import com.prcsteel.ec.model.common.DataEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * User generated by hbm2java
 */
@Entity("user")
public class User extends DataEntity<User> {

    private static final long serialVersionUID = 1L;

    @KeyColumn(useGeneratedKeys = true)
    @Column(value = "id")
    private Integer id;

    /**
     * 用户名
     */
    @Column(value = "name")
    private String name;

    /**
     * 用户手机号
     */
    @Column("mobile")
    @Pattern(regexp = "^[1][3,4,5,7,8][0-9]{9}$", message = "手机号码不正确。")
    @NotEmpty(message = "手机号不能为空。")
    private String mobile;

    /**
     * 密码
     */
    @Column(value = "password")
    @Length(min = 6, max = 20, message = "密码长度不能小于6位且不能大于20位。")
    @NotEmpty(message = "密码不能为空。")
    private String password;

    /**
     * 用户来源 : cbms、market、app
     */
    @Column("source")
    private String source;

    /**
     * 状态 : 0 启用，1 禁用
     */
    @Column("status")
    private String status;

    /**
     * 验证码
     */
    private String code;

    public User() {

    }

    public User(Integer id) {
        this.id = id;
    }

    public User(String name, String mobile, String password, String source, String status, String createdBy, String lastCreatedBy) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.source = source;
        this.status = status;
        this.setCreatedBy(createdBy);
        this.setLastUpdatedBy(lastCreatedBy);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
