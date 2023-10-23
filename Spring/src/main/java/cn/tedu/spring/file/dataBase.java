package cn.tedu.spring.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = "classpath:application.properties")
@Component
public class dataBase {
    @Value("${dburl}")
    private String dbUrl;
    @Value("${uname}")
    private String uname;
    @Value("${password}")
    private String pwd;

    @Override
    public String toString() {
        return "dataBase{" +
                "dbUrl='" + dbUrl + '\'' +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
