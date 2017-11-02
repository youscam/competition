package ma.youscam.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youscam.competition.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
