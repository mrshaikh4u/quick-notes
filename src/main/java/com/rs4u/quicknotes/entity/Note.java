package com.rs4u.quicknotes.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Set;

@EqualsAndHashCode
@Builder(toBuilder = true)
public class Note {
    @EqualsAndHashCode.Exclude
    private long id;

    private String title;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private String text;

    private Set<String> tags;

    private String owner;
}
