package com.acme.center.platform.learning.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record AcmeStudentRecordId(String studentRecordId) {

    //REGLAS DE NEGOCIO
    public AcmeStudentRecordId{
     if (studentRecordId == null || studentRecordId.isBlank()){
         throw new IllegalArgumentException("Student record id cannot be null or empty.");
     }
    }

    public AcmeStudentRecordId(){
        this(UUID.randomUUID().toString());
    }
}
