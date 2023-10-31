package cn.tedu._04mvcboot02.pojo.dto;

import lombok.Data;

@Data
public class UpdateDTO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
}
