package com.example.sea;

import com.example.classbox.StudentManagementSystem;
import com.example.classbox.entity.Student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SeaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAddStudent(){
		Student s = new Student(1, "John Carter", 15, "10th");
		StudentManagementSystem sms = new StudentManagementSystem();

        try {
			ByteArrayInputStream byteStream = new ByteArrayInputStream("John Carter\n15\n10th\n".getBytes());
			System.setIn(byteStream);
			Student t = sms.addStudent();
			assertEquals(s.getId(), t.getId());
            assertEquals(s.getName(), t.getName());
			assertEquals(s.getAge(), t.getAge());
			assertEquals(s.getGrade(), t.getGrade());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
