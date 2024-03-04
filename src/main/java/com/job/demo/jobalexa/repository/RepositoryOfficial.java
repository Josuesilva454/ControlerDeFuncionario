package com.job.demo.jobalexa.repository;

import com.job.demo.jobalexa.entity.Official;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOfficial extends JpaRepository<Official, Integer> {
}
