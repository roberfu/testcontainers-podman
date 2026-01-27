package cl.stringmachine.application;

import org.springframework.boot.SpringApplication;

public class TestTestcontainersPodmanApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestcontainersPodmanApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
