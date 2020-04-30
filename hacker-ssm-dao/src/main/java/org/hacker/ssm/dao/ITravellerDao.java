package org.hacker.ssm.dao;

        import org.apache.ibatis.annotations.Select;
        import org.hacker.ssm.domain.Traveller;

        import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-23 22:15
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId);
}
