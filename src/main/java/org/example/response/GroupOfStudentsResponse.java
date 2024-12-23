package org.example.response;

import java.util.Objects;

public class GroupOfStudentsResponse {
    private long id;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupOfStudentsResponse that = (GroupOfStudentsResponse) o;
        return id == that.id && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GroupOfStudentsResponse(long id, String title) {
        this.id = id;
        this.title = title;
    }
}
