package com.rs4u.quicknotes.service;

import com.rs4u.quicknotes.model.NoteTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class NotesServiceImpl implements NotesService{

    @Override
    public NoteTO create(NoteTO newNote) {
        return null;
    }

    @Override
    public NoteTO update(long id, NoteTO noteToUpdate) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public NoteTO getById(long id) {
        return null;
    }

    @Override
    public List<NoteTO> getAll() {
        return null;
    }
}
