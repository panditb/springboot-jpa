package com.example.springbackend.repository;


import com.example.springbackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository  extends CrudRepository<User, Integer>{
}
