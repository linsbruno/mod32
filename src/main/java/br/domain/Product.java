
package main.java.br.domain;


import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "sq_product", initialValue = 1, allocationSize = 1)

    private Long id;

    @Column(name = "PROD_CODE", length = 10, nullable = false, unique = true)
    private String prod_code;

    @Column(name = "PROD_NAME", length = 50, nullable = false)
    private String prod_name;

    @Column(name = "PROD_VALUE", nullable = false)
    private Double prod_value;

    @Column(name = "PROD_UNIT", length = 30, nullable = false)
    private String prod_unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProd_code() {
        return prod_code;
    }

    public void setProd_code(String prod_code) {
        this.prod_code = prod_code;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Double getProd_value() {
        return prod_value;
    }

    public void setProd_value(Double prod_value) {
        this.prod_value = prod_value;
    }

    public String getProd_unit() {
        return prod_unit;
    }

    public void setProd_unit(String prod_unit) {
        this.prod_unit = prod_unit;
    }
}
