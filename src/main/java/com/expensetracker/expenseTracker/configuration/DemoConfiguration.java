package com.expensetracker.expenseTracker.configuration;

import com.expensetracker.expenseTracker.model.DemoEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.expensetracker.expenseTracker.repository.DemoRepository;

@Configuration
public class DemoConfiguration {
    @Bean
    CommandLineRunner loadData(DemoRepository demoRepository) {
        return args -> {

            if (demoRepository.count() == 0) {
                DemoEntity demoEntity = new DemoEntity();
                demoEntity.setName("Ritesh");
                demoEntity.setAge("25");
                demoRepository.save(demoEntity);
                System.out.println("Demo data inserted");
            } else {
                System.out.println("Demo data already exists");
            }
        };
    }
}
