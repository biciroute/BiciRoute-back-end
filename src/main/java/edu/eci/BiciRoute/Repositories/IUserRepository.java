package edu.eci.BiciRoute.Repositories;


import edu.eci.BiciRoute.Models.User;
import java.util.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String> {

    public List<User> findAll();
    public User findByEmail(String email);
    public User findBy_id(String _id);

}
