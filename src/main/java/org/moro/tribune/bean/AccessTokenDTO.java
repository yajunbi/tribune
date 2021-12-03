package org.moro.tribune.bean;

/*
*
* 登录传输信息模型
* */

import lombok.Data;

@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_url;
    private String state;
}
