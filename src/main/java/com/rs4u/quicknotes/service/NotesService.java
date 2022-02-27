package com.rs4u.quicknotes.service;

import com.rs4u.quicknotes.model.NoteTO;

import java.util.List;

public interface NotesService {
    NoteTO create(NoteTO newNote);
    NoteTO update(long id,NoteTO noteToUpdate);
    void delete(long id);
    NoteTO getById(long id);
    List<NoteTO> getAll();
}
