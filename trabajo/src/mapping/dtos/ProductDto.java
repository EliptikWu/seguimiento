package mapping.dtos;

public record ProductDto(Long id,
                         String name,
                         domain.enums.ProductType category,
                         Double price) {
}
