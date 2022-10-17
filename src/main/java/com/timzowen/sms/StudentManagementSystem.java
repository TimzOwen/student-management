package com.timzowen.sms;

import com.timzowen.sms.entity.Student;
import com.timzowen.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystem  implements CommandLineRunner {
	public static void main(String[] args)  {
		SpringApplication.run(StudentManagementSystem.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//
//		Student student = new Student("Timothy","Owen","timz@gmail.com");
//		studentRepository.save(student);
//		Student student1 = new Student("Kevin","too","too@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Owino","James","james@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Babu","Orengo","orengo@gmail.com");
//		studentRepository.save(student3);

	}
}
