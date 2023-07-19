package mapping.mappers;

import domain.models.Client;
import mapping.dtos.ClientDto;

public class ClientMapper {

    public static ClientDto mapFrom(Client source){
        return new ClientDto(source.getId(),
                source.getName(),
                source.getTier());
}
}
