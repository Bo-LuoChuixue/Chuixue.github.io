package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    @Autowired
    @Qualifier(value = "AAAA")
    private Cache cache;
}
