package mapping.mappers;

import domain.models.Client;
import domain.models.Order;
import domain.models.Product;
import mapping.dtos.OrderDto;

import java.time.LocalDate;
import java.util.List;

public class OrderMapper {
    public OrderMapper(long id, String status, LocalDate orderDate, List<Product> products, Client client) {
    }

    public static OrderMapper mapFrom (Order source){
        return new OrderMapper(source.getId(),
                source.getStatus(),
                source.getOrderDate(),
                source.getProducts(),
                source.getClient());
    }
}
