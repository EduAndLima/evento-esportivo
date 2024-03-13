package br.com.eventoesportivo;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EventoEsportivoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EventoEsportivoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		var now = Instant.now();
        
        Logger log = null;
		log.info("Default Timezone: " + ZoneId.systemDefault() + " OffsetDateTime:" + OffsetDateTime.now());
        log.info("UTC Time: " + ZonedDateTime.ofInstant(now, ZoneId.of("UTC")));
        log.info("São Paulo: " + ZonedDateTime.ofInstant(now, ZoneId.of("America/Sao_Paulo")));
        log.info("Java-Name:{}" + System.getProperty("java.specification.name"));
        log.info("Java-Vendor:{}" + System.getProperty("java.specification.vendor"));
        log.info("Java-Version:{}" + System.getProperty("java.specification.version"));
        log.info("Java-Runtime-Version:{}" + System.getProperty("java.runtime.version")); 
        		
		log.info("----------> Started on " + ZonedDateTime.ofInstant(now, ZoneId.systemDefault())
        .toOffsetDateTime());
	}

}
