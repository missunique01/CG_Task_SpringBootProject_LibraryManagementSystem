package com.tnsif.libmngsys.repo;

import org.springframework.data.repository.CrudRepository;

import com.tnsif.libmngsys.entity.Library;

// CrudRepository will perform all the CRUD Operations
// if we are using a Interface in another interface then we use extends keyword
// In the Generic, we are defining Entity class and the primary Key Data type as input

public interface LibRepo extends CrudRepository<Library, Long>{

}
