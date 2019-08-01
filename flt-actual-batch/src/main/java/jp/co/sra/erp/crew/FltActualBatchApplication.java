package jp.co.sra.erp.crew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import jp.co.sra.erp.crew.dto.JsonInfo;

@SpringBootApplication
public class FltActualBatchApplication {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		SpringApplication.run(FltActualBatchApplication.class, args);
		String url = "http://localhost:5002/ope_reg/"+"test";

		System.out.println("It is starting....");
		System.out.println("The URL is " + url);

		restTemplate.getForObject(url, JsonInfo.class);
	}

}
