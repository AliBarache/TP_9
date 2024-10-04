package dz.ibnrochd.master14.dao;

import dz.ibnrochd.master14.model.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement, Integer> {
    // TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)

}
