package com.docker_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsApplication.class, args);
    }

    @RestController
    static class BootLoader{

        @GetMapping("/{name}")
        public ResponseEntity<String> askQuestion(@PathVariable String name){
            return ResponseEntity.ok("Hey " + name + " Welcome to CI-CD pipeline from Git-GitHub-Jenkins-Maven-Docker, from author Omar, btw do you like pudding?");
        }
    }

}
