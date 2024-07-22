package com.example.demo_repository2.controller;

import com.example.demo_repository2.entities.ProgrammingLanguage;
import com.example.demo_repository2.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ProgrammingLanguage")
public class ProgrammingLanguageController {

    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    @PostMapping("/Create")
    public ProgrammingLanguage create (@RequestBody ProgrammingLanguage programmingLanguage){
        ProgrammingLanguage programmingLanguageSaved = programmingLanguageRepository.saveAndFlush(programmingLanguage);
        return programmingLanguageSaved;
    }

    @GetMapping("/read")
    public List<ProgrammingLanguage> getProgrammingLanguages() {
        List programmingLanguagesList = programmingLanguageRepository.findAll();
        return programmingLanguagesList;
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<ProgrammingLanguage> getProgrammingLanguage(@PathVariable Integer id) {
        if(programmingLanguageRepository.existsById(id)){
            return ResponseEntity.ok(programmingLanguageRepository.getReferenceById(id));
        } else {
            return ResponseEntity.ok(new ProgrammingLanguage());
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ProgrammingLanguage> updatePrgrammingLanguage(@PathVariable Integer id, @RequestBody ProgrammingLanguage programmingLanguage){
        ProgrammingLanguage programmingLanguageUpdate = programmingLanguageRepository.saveAndFlush(programmingLanguage);
        return ResponseEntity.ok(programmingLanguageRepository.save(programmingLanguageUpdate));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProgrammingLanguage(@PathVariable Integer id) {
        if(programmingLanguageRepository.existsById(id)){
            programmingLanguageRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @DeleteMapping("/deleteall")
    public ResponseEntity<Void> deleteAllProgrammingLanguages(){
        programmingLanguageRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
