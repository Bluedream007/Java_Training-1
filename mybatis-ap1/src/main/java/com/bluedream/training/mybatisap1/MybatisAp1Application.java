package com.bluedream.training.mybatisap1;

import com.bluedream.training.mybatisap1.model.Student;
import com.bluedream.training.mybatisap1.repository.StudentMyBatisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class MybatisAp1Application implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentMyBatisRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MybatisAp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Student id 10001 -> {}", repository.findById(10001L));

		logger.info("Inserting -> {}", repository.insert(new Student(10010L, "John", "A1234657")));

		logger.info("Update 10003 -> {}", repository.update(new Student(10001L, "Name-Updated", "New-Passport")));

		repository.deleteById(10002L);

		logger.info("All users -> {}", repository.findAll());
	}

}
