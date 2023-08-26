package model;

import java.time.LocalDateTime;

import java.util.Objects;


public class Notepad {
    private long id;
    private LocalDateTime timeNote;
    private String label;
    private String note;

    public Notepad(){

    }

    public Notepad(long id, LocalDateTime timeNote, String label, String note) {
        this.id = id;
        this.timeNote = timeNote;
        this.label = label;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTimeNote() {
        return timeNote;
    }

    public void setTimeNote(LocalDateTime timeNote) {
        this.timeNote = timeNote;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notepad notepad = (Notepad) o;
        return id == notepad.id && Objects.equals(timeNote, notepad.timeNote) && Objects.equals(label, notepad.label) && Objects.equals(note, notepad.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeNote, label, note);
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "id=" + id +
                ", timeNote=" + timeNote +
                ", label='" + label + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
