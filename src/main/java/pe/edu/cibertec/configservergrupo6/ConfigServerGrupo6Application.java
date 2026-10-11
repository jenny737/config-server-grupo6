package pe.edu.cibertec.configservergrupo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo6Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo6Application.class, args);
    }

}
