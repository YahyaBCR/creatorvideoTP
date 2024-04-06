package ma.xproce.inventoryserviceyahya;

import ma.xproce.inventoryserviceyahya.entities.Creator;
import ma.xproce.inventoryserviceyahya.entities.Video;
import ma.xproce.inventoryserviceyahya.repositories.CreatorRepository;
import ma.xproce.inventoryserviceyahya.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InventoryServiceyahyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceyahyaApplication.class, args);
	}


	@Bean
	public CommandLineRunner inventoryserviceyahyaData(CreatorRepository creatorRepository, VideoRepository videoRepository) {
		return args -> {
			// Create a Creator
			Creator creator1 = new Creator(null, "Bouachra Yahya", "Yahya.bcr@gmail.com", null);
			creator1 = creatorRepository.save(creator1);
			Video video1 = new Video(null, "JEE tutorial", "https://example.com/springboot", "JEE tuto 101", new Date(), creator1);
			videoRepository.save(video1);
		};
	}
}
