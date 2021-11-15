package poc.assignment.userdata.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import poc.assignment.userdata.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	//@Query("from User where userName=?1")
	User findUserByUserName(String userName);

	List<User> findAllSorted(Sort sort);

}
