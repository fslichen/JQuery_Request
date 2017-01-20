package evolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import evolution.dto.RequestDto;
import evolution.dto.ResponseDto;

@SpringBootApplication
@RestController
public class Application {
	@RequestMapping(value = "/0", method = RequestMethod.POST)
	public ResponseDto anyMethod(@RequestBody RequestDto anyDto) {
		String message = "My name is " + anyDto.getName();
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage(message);
		System.out.println(message);
		return responseDto;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
