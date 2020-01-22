package com.yj.anonymous.repository;

import com.yj.anonymous.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends JpaRepository<Book, Long> {
}
