package com.job.demo.jobalexa.repository;

import com.job.demo.jobalexa.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCompany extends JpaRepository<Company, Integer> {
}
