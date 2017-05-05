package de.chiliconunity.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import de.chiliconunity.data.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
