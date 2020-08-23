package controller;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.IProductService;
import java.util.List;
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView view = new ModelAndView();
        List<domain.Product> all = productService.findAll();
        System.out.println(all);
        view.addObject("productList",all);
        view.setViewName("product-list");
        return view;
    }
}
