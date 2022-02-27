package com.rs4u.quicknotes.controller;

import com.rs4u.quicknotes.model.NoteTO;
import com.rs4u.quicknotes.service.NotesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("/v1/notes")
@Tag(name = "Notes Management",description = "Endpoints to support notes operations")
public class NotesController {

    @Autowired
    private final NotesService notesService;

    @PostMapping
    @Operation(description = "Create new note")
    public NoteTO create(@RequestBody NoteTO newNote){
        return notesService.create(newNote);
    }

    @PutMapping("/{id}")
    @Operation(description = "Update note by ID")
    public NoteTO update(@PathVariable long id,@RequestBody NoteTO noteToUpdate){
        return notesService.update(id,noteToUpdate);
    }

    @DeleteMapping("/{id}")
    @Operation(description = "Delete note by id")
    public void delete(@PathVariable long id){
        notesService.delete(id);
    }

    @GetMapping("/{id}")
    @Operation(description = "Get Note by ID")
    public NoteTO getById(@PathVariable long id){
        return notesService.getById(id);
    }

    @GetMapping
    @Operation(description = "Get All notes")
    public List<NoteTO> getAll(){
        return notesService.getAll();
    }

}
