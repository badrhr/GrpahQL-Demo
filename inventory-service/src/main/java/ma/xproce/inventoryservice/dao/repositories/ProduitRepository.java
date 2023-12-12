package ma.xproce.inventoryservice.dao.repositories;

import ma.xproce.inventoryservice.dao.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
