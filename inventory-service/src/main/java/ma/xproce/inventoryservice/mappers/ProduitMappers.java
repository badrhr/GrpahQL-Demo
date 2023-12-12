package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Produit;
import ma.xproce.inventoryservice.dtos.ProduitDto;
import ma.xproce.inventoryservice.dtos.ProduitDtoInput;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProduitMappers {

    private ModelMapper modelMapper = new ModelMapper();

    public Produit fromProuduitDtoToProduit(ProduitDto produitDto) {
        return this.modelMapper.map(produitDto, Produit.class);
    }

    public ProduitDto fromProuduitToProduitDto(Produit produit) {
        return this.modelMapper.map(produit, ProduitDto.class);
    }

    public ProduitDto fromProuduitDtoInputToProduitDto(ProduitDtoInput produitDtoInput) {
        return this.modelMapper.map(produitDtoInput, ProduitDto.class);
    }

    public ProduitDtoInput fromProuduitDtoToProduitDtoInput(ProduitDto produitDTo) {
        return this.modelMapper.map(produitDTo, ProduitDtoInput.class);
    }

    public Produit fromProuduitDtoInputToProduit(ProduitDtoInput produitDtoInput) {
        return this.modelMapper.map(produitDtoInput, Produit.class);
    }

}
