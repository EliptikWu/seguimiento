package mapping.mappers;

import domain.models.Product;
import mapping.dtos.ProductDto;

public class ProductMapper {
    public static ProductDto mapFrom(Product source){
        return new  ProductDto(source.getId(),
                source.getName(),
                source.getCategory(),
                source.getPrice());
    }
}
