package com.moraes.test_predicate;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication(scanBasePackages = { "com.moraes.test_predicate" })
public class TestPredicateApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TestPredicateApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestPredicateApplication.class);
	}

	@Bean
	public LocaleResolver localeResolver() { 
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
}
