package io.fullstackwebapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.fullstackwebapp.model.User;
@Repository
public interface userRepository extends JpaRepository<User, Long>{

}
