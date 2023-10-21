package cn.tedu.spring.eg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentMapper {
    @Autowired
    private Mapper mapper;
}
