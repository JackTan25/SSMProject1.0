package dao;
import domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface IProductDao {
    /**
     * /查询所有的产品信息
     * @return
     */
    @Select("select * from product")
    List<Product> findAll();
}
