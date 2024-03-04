package com.job.demo.jobalexa.dto;

public record OfficialDto(
        String firstName,
        String lastName,
        String email,
        int age,
        Integer companyId
) {
    // Pode adicionar métodos adicionais, se necessário
}