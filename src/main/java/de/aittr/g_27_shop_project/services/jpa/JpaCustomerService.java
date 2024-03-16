package de.aittr.g_27_shop_project.services.jpa;

import de.aittr.g_27_shop_project.domain.dto.CustomerDto;
import de.aittr.g_27_shop_project.domain.jpa.JpaCustomer;
import de.aittr.g_27_shop_project.exeption_handling.exceptions.CustomerNotFoundException;
import de.aittr.g_27_shop_project.repositories.interfaces.CustomerRepository;
import de.aittr.g_27_shop_project.repositories.jpa.JpaCustomerRepository;
import de.aittr.g_27_shop_project.services.interfaces.CustomerService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class JpaCustomerService implements CustomerService {
  private JpaCustomerRepository repository;

  public JpaCustomerService(JpaCustomerRepository repository) {
    this.repository = repository;
  }

  @Override
  public CustomerDto save(CustomerDto customer) {
    return null;
  }

  @Override
  public List<CustomerDto> getAllActiveCustomers() {
    return null;
  }

  @Override
  public CustomerDto getActiveCustomerById(int id) {
    JpaCustomer customer = repository.findById(id).orElse(null);

    if (customer == null || !customer.isActive()) {
      throw new CustomerNotFoundException("Такой покупатель не существует!");
    }
    return null;
  }

  @Override
  public void update(CustomerDto customer) {

  }

  @Override
  public void deleteById(int id) {

  }

  @Override
  public void deleteByName(String name) {

  }

  @Override
  public void restoreById(int id) {

  }

  @Override
  public int getActiveCustomersCount() {
    return 0;
  }

  @Override
  public double getTotalCartPriceById(int customerId) {
    return 0;
  }

  @Override
  public double getAveragePriceById(int customerId) {
    return 0;
  }

  @Override
  public void addProductToCart(int customerId, int productId) {

  }

  @Override
  public void deleteProductFromCart(int customerId, int productId) {

  }

  @Override
  public void clearCartById(int customerId) {

  }
}
