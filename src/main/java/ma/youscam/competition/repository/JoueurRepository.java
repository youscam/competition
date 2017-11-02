package ma.youscam.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youscam.competition.model.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {

}
