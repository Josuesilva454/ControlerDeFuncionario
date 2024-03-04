package com.job.demo.jobalexa.service;

import com.job.demo.jobalexa.dto.OfficialDto;
import com.job.demo.jobalexa.entity.Company;
import com.job.demo.jobalexa.entity.Official;
import com.job.demo.jobalexa.repository.RepositoryOfficial;
import org.springframework.stereotype.Service;

@Service
public class ServicoOfficial {

    private final RepositoryOfficial repositoryOfficial;


    public ServicoOfficial( RepositoryOfficial repositoryOfficial) {
        this.repositoryOfficial = repositoryOfficial;

    }

    public Official postOfficial(OfficialDto dto) {
        Official official = toOfficial(dto);

        return repositoryOfficial.save(official);
    }
    private Official toOfficial(OfficialDto dto) {
        Official official = new Official();
        official.setFirstName(dto.firstName());
        official.setLastName(dto.lastName());
        official.setAge(dto.age());
        official.setEmail(dto.email());

        Company company = new Company();
        // Definir a ID da empresa no DTO
        company.setId(dto.companyId());

        // Definir a empresa no trabalho
        official.setCompany(company);

        return official;
    }
}

