package org.example.request;

import java.util.Objects;

public class IDRequest {
    private long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDRequest idRequest = (IDRequest) o;
        return id == idRequest.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public IDRequest(long id) {
        this.id = id;
    }
}
