package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository  extends CrudRepository<User, Integer>{
}
