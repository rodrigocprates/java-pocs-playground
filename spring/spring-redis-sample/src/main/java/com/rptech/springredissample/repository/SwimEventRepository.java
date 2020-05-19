package com.rptech.springredissample.repository;

import com.rptech.springredissample.entity.SwimEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwimEventRepository extends CrudRepository<SwimEvent, Long> {
}
