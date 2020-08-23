package service;
import domain.Product;
import java.util.List;

public interface IProductService {
    /**
     * /查询所有的产品信息
     * @return
     */
    public List<Product> findAll();
}
