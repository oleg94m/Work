package ua.kiev.prog.oauth2.loginviagoogle.dto;

import java.util.Objects;

public class PageCountDTO {
    private final long count;
    private final int pageSize;

    private PageCountDTO(long count, int pageSize) {
        this.count = count;
        this.pageSize = pageSize;
    }

    public static PageCountDTO of(long count, int pageSize) {
        return new PageCountDTO(count, pageSize);
    }

    public long getCount() {
        return count;
    }

    public int getPageSize() {
        return pageSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageCountDTO that = (PageCountDTO) o;
        return count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
