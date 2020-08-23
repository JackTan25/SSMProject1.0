package service.Impl;
import dao.IProductDao;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IProductService;
import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
