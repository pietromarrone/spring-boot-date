package it.treemd.it;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping
	public ResponseEntity<DateDTO> getDate(){
	  return ResponseEntity.ok(new DateDTO());
	}
	
	public class DateDTO {
	  private LocalDate d = LocalDate.now();
	  private LocalDateTime dt = LocalDateTime.now();
    public LocalDate getD() {
      return d;
    }
    public LocalDateTime getDt() {
      return dt;
    }
	  
	  
	}

}
