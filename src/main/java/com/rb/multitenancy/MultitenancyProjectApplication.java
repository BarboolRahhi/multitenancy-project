package com.rb.multitenancy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rb.multitenancy.config.TenantContext;
import com.rb.multitenancy.post.Post;
import com.rb.multitenancy.post.PostRepository;

@SpringBootApplication
public class MultitenancyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultitenancyProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PostRepository repository) {

		return (args) -> {

			TenantContext.setCurrentTenant("tenant_1");
			Post post = new Post("tenant1", "MultitenancyProjectApplication with 1");
			repository.save(post);

			TenantContext.setCurrentTenant("tenant_2");
			Post post2 = new Post("tenant2", "MultitenancyProjectApplication with 2");
			repository.save(post2);

		};
	}
}
