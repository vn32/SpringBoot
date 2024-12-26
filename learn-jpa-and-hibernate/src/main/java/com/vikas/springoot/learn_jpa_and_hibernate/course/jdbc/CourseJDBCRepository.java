package com.vikas.springoot.learn_jpa_and_hibernate.course.jdbc;

import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJDBCTemplate;
    private static String INSERT_QUERY =
            """
            INSERT INTO COURSE(ID,NAME,AUTHOR)
            VALUES(?, ?, ?);
            """;
    private static String DELETE_BY_ID_QUERY =
            """
            DELETE FROM COURSE WHERE ID = ? ;
            """;
    private static String SELECT_BY_ID_QUERY =
            """
            SELECT * FROM COURSE WHERE ID = ? ;
            """;
    public void insert(Course course){
        springJDBCTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteById(long id){
        springJDBCTemplate.update(DELETE_BY_ID_QUERY,id);
    }

    public Course findById(long id) {
        //HOW TO MAP THE RESULT INTO SPECIFIC BEAN? BY USING ROW MAPPER
        return springJDBCTemplate.queryForObject(SELECT_BY_ID_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
