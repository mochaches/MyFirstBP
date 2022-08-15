package com.github.mochachess.dao;

import com.github.mochachess.Entity.PdViewLogging;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PdViewLoggingDao {

    PdViewLogging findById(long id);

    @Query("SELECT pd FROM PdViewLogging pd WHERE pd.id = :id")
    PdViewLogging retrieveByName(@Param("id") Long id);

    @Query("INSERT INTO PdViewLogging (id,details,userName,visitingType) VALUES(5,'client','tester','2022-08-15 00:46:22.000000')")
    PdViewLogging addLog();
}
