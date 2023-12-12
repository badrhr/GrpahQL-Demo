package ma.xproce.inventoryservice.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProduitDtoInput {

    private String name;
    private Long price ;
}
