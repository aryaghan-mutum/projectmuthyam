package repository;

import com.projectmuthyam.pojo.Student;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}
