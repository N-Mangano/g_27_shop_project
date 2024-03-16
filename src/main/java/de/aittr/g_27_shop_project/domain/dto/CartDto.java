package de.aittr.g_27_shop_project.domain.dto;

import de.aittr.g_27_shop_project.domain.jpa.JpaCustomer;
import de.aittr.g_27_shop_project.domain.jpa.JpaProduct;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import java.util.Objects;

public class CartDto {

  private int id;
  private List<ProductDto> products;

  public CartDto(int id, List<ProductDto> products) {
    this.id = id;
    this.products = products;
  }

  public int getId() {
    return id;
  }

  public List<ProductDto> getProducts() {
    return products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CartDto cartDto)) {
      return false;
    }
    return getId() == cartDto.getId() && Objects.equals(getProducts(),
        cartDto.getProducts());
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (products != null ? products.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CartDto{" +
        "id=" + id +
        ", products=" + products +
        '}';
  }
}
