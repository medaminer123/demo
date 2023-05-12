package tn.esprit.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo.entities.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}