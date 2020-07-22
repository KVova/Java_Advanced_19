package volodymyr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import volodymyr.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}