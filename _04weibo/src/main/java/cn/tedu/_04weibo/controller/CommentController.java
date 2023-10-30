package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.pojo.dto.CommentDTO;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/v1/comment/")
public class CommentController {
    @PostMapping("insert")
    public int insertComment(@RequestBody CommentDTO commentDTO, HttpSession session) {
        UserVO userVO=(UserVO) session.getAttribute("user");
        if (userVO==null){
            return 2;
        }
        CommentController
        return 1;
    }
}
