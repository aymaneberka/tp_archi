package ma.formations.msa;

import ma.formations.msa.entities.Customer;
import ma.formations.msa.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Yassine").email("yassine@test.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("imane@test.com").build());
            customerRepository.save(Customer.builder().name("Aymane").email("aymane@test.com").build());
        };
    }
}
