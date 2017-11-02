package ma.youscam.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youscam.competition.model.Competition;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {

}
