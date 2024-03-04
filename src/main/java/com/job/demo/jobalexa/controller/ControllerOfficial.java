package com.job.demo.jobalexa.controller;

import com.job.demo.jobalexa.dto.OfficialDto;
import com.job.demo.jobalexa.entity.Company;
import com.job.demo.jobalexa.entity.Official;
import com.job.demo.jobalexa.repository.RepositoryOfficial;
import com.job.demo.jobalexa.service.ServicoOfficial;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ControllerOfficial {

    private final RepositoryOfficial repositoryOfficial;

    private final ServicoOfficial servicoOfficial;

    public ControllerOfficial(RepositoryOfficial repositoryOfficial, ServicoOfficial servicoOfficial) {
        this.repositoryOfficial = repositoryOfficial;
        this.servicoOfficial = servicoOfficial;
    }


    @GetMapping("/official")
    public List<Official>findAll(){
        return repositoryOfficial.findAll();
    }
    @PostMapping("/official")
    public Official postOfficial( OfficialDto dto) {
        return servicoOfficial.postOfficial(dto);
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
