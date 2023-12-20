package eng.cristian.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TBPROD")
public class ProductModel implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProd;
    private String name;
    private BigDecimal vlrProd;

    public UUID getIdProd() {
        return idProd;
    }

    public void setIdProd(UUID idProd) {
        this.idProd = idProd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getVlrProd() {
        return vlrProd;
    }

    public void setVlrProd(BigDecimal vlrProd) {
        this.vlrProd = vlrProd;
    }
}
