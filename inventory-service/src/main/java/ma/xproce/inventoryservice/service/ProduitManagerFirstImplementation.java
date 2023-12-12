package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Produit;
import ma.xproce.inventoryservice.dao.repositories.ProduitRepository;
import ma.xproce.inventoryservice.dtos.ProduitDto;
import ma.xproce.inventoryservice.dtos.ProduitDtoInput;
import ma.xproce.inventoryservice.mappers.ProduitMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProduitManagerFirstImplementation {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private ProduitMappers produitMappers;

    public ProduitDto getProduitByID(Long id) {
        return produitMappers.fromProuduitToProduitDto(produitRepository.findById(id).get());
    }

    public ProduitDto saveProduit(ProduitDtoInput produitDtoInput) {
        Produit produit = produitMappers.fromProuduitDtoInputToProduit(produitDtoInput);
        produit = produitRepository.save(produit);
        return produitMappers.fromProuduitToProduitDto(produit);
    }
}
