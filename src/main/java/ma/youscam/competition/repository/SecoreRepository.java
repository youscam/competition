package ma.youscam.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youscam.competition.model.Secore;

@Repository
public interface SecoreRepository extends JpaRepository<Secore, Long> {

}
