package com.example.demo_repository2.repositories;

import com.example.demo_repository2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("descrizione programma linguaggi di programmazione"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}