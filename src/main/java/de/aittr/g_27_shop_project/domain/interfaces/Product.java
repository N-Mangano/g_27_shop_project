package de.aittr.g_27_shop_project.domain.interfaces;

public interface Product {

  int getId();

  boolean isActive();

  String getName();

  void setName(String name);

  double getPrice();

  void setId(int id);

  void setActive(boolean isActive);
  void SetName(String name);

  void setPrice(double price);
}