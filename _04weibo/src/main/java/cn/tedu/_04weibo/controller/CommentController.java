package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.CommentMapper;
import cn.tedu._04weibo.pojo.dto.CommentDTO;
import cn.tedu._04weibo.pojo.entity.Comment;
import cn.tedu._04weibo.pojo.vo.CommentVO;
import cn.tedu._04weibo.pojo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Api(tags = "03.评论模块")
@RestController
@RequestMapping("/v1/comment/")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;

    @ApiOperation(value = "发布评论")
    @PostMapping("insert")
    public int insertComment(@RequestBody CommentDTO commentDTO,@ApiIgnore HttpSession session){
        /*
            1.校验用户登录状态;
            2.调用接口插入数据.
         */
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){ //未登录
            return 2;
        }
        //插入数据
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO, comment);
        comment.setCreated(new Date());
        comment.setUserId(userVO.getId());
        commentMapper.insertComment(comment);
        return 1;
    }

    /**
     * 评论列表功能
     * @param id
     * @return
     */
    @ApiOperation(value = "获取评论")
    @GetMapping("selectByWeiboId")
    public List<CommentVO> selectByWeiboId(int id){
        return commentMapper.selectByWeiboId(id);
    }
}








