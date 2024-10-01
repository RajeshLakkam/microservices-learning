package com.rajLernings.bookstore.catalog.domain.Product;

import java.util.List;

public record PagedResults<T>(
        List<T> data,
        long totalElements,
        int pageNumber,
        int totalPages,
        boolean isFirst,
        boolean isLast,
        boolean hasNext,
        boolean hasPrevious) {}
