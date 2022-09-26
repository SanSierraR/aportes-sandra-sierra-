package com.surtidomintic2022.mvcprojetsystem.repositories;


import com.surtidomintic2022.mvcprojetsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
