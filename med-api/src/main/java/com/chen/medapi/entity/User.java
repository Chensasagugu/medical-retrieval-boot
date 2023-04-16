package com.chen.medapi.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author aaashuai
 * @since 2023-04-08
 */
@ApiModel(value = "User对象", description = "")
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer userId;

    private String username;

    private String password;

    private String email;

    private LocalDateTime createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId = " + userId +
        ", username = " + username +
        ", password = " + password +
        ", email = " + email +
        ", createTime = " + createTime +
        "}";
    }
}
