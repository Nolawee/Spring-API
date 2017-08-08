package com.nolaweemengist.course;


import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
    Page<Course> findByTitleContaining(@Param("title") String title, Pageable page);

}
