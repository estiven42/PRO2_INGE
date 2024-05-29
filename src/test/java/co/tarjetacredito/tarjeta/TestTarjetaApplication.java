package co.tarjetaCredito.tarjeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import co.tarjetaCredito.TarjetaApplication;

@TestConfiguration(proxyBeanMethods = false)
public class TestTarjetaApplication {

	@Bean
	@ServiceConnection
	PostgreSQLContainer<?> postgresContainer() {
		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
	}

	public static void main(String[] args) {
		SpringApplication.from(TarjetaApplication::main).with(TestTarjetaApplication.class).run(args);
	}

}
