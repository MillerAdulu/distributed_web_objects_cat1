package com.adulu.cat1.runners;

import com.adulu.cat1.clients.FeignRestClient;
import com.adulu.cat1.models.requests.RegisterStudentDTO;
import com.adulu.cat1.models.responses.RegisterStudentResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CatRunner implements CommandLineRunner {
    private final FeignRestClient awesomeClient;

    public CatRunner(FeignRestClient awesomeClient) {
        this.awesomeClient = awesomeClient;
    }

    @Override
    public void run(String... args) throws Exception {

        // Register student
        RegisterStudentResponse registerStudentResponse = awesomeClient.registerStudent(new RegisterStudentDTO("93983", "Miller"));
        System.out.println(registerStudentResponse.toString());
    }
}
