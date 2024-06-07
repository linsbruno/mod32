
package java;

import main.java.br.dao.IProductDAO;
import main.java.br.dao.ProductDAO;
import main.java.br.domain.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    private final IProductDAO productDAO = new ProductDAO();

    @Test
    public void register() {
        Product product= new Product();
        product.setProd_code("123");
        product.setProd_name("Lampada Halogena 140W");
        product.setProd_value(23d);
        product.setProd_unit("KIT");

        product = productDAO.register(product);

        Assert.assertNotNull(product);
        Assert.assertNotNull(product.getId());
    }
}
