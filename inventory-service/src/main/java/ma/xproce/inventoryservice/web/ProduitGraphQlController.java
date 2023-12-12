package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.ProduitDto;
import ma.xproce.inventoryservice.dtos.ProduitDtoInput;
import ma.xproce.inventoryservice.service.ProduitManagerFirstImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProduitGraphQlController {

    @Autowired
    private ProduitManagerFirstImplementation produitManager;
    /*
    getProduitById(id: Float) : Produit
    getProduitByName(name: String): Produit
    getAllProduits: [Produit]

        saveProduit(produitDtoInput: ProduitDtoInput): ProduitDto


    * */

    @QueryMapping
    public ProduitDto getProduitById(@Argument Long id) {
        return produitManager.getProduitByID(id);
    }

    public  ProduitDto saveProduit(ProduitDtoInput produitDtoInput){
        produitManager.saveProduit(produitDtoInput);
        return null;
    }

}