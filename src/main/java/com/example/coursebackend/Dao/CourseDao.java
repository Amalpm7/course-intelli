package com.example.coursebackend.Dao;

import com.example.coursebackend.Model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<CourseModel,Integer> {
}
