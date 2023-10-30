package cn.tedu.egmybatis4.mapper;

import cn.tedu.egmybatis4.pojo.entity.Orders;
import cn.tedu.egmybatis4.pojo.vo.OrdersVO;
import java.util.List;

public interface OrdersMapper {
    int insertOrders(Orders orders);

    List<Orders> selectAll();

    OrdersVO selectOne(int id);

    int deleteById(int id);

    int deleteMany(List<Integer> ids);

    int dynamicUpdate(Orders orders);

    int selectCount();
}
