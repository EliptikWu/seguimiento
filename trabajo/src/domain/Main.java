package domain;

import domain.enums.ProductType;
import domain.models.Client;
import domain.models.Order;
import domain.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Client customer = new Client(1L,"Likun", 1);
    Client customer2 = new Client(2L,"John",2);
    Client customer3 = new Client(3L,"Mary",3);

    List<Product> products = new ArrayList<Product>();

    Product product = new Product(1010, "Pepsi", ProductType.DRINK, 2.500);
    Product product2 = new Product(1011, "Coca-Cola", ProductType.DRINK, 3.000);

    Order order = new Order();
    Scanner scanner = new Scanner(System.in);





    }
}