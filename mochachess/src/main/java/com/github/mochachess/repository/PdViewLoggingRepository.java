package com.github.mochachess.repository;

import com.github.mochachess.Entity.PdViewLogging;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdViewLoggingRepository extends CrudRepository<PdViewLogging, Long> {
}
