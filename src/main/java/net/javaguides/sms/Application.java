package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		
//		Student student3 = new Student((long) '2',"Sanjay","Jadhav","sanjayh@gmail.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student((long) '3',"Tony","Stark","tony@gmail.com");
//		studentRepository.save(student4);
//		
//		Student student5 = new Student((long) '5',"Manoj","Shetty","manu@gmail.com");
//		studentRepository.save(student5);
//		
//		
//	Student student6 = new Student((long) '6',"Pllavi","Gowda","pallu@gmail.com");
//		studentRepository.save(student6);

	}
	  
}