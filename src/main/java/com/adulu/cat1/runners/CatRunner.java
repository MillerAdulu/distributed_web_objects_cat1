package com.adulu.cat1.runners;

import com.adulu.cat1.clients.FeignRestClient;
import com.adulu.cat1.models.requests.RegisterStudentDTO;
import com.adulu.cat1.models.requests.RejectMatchDTO;
import com.adulu.cat1.models.responses.BlindDateMatchDTO;
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
        System.out.println("New Student: " + registerStudentResponse.toString());

        // Find matches
        BlindDateMatchDTO blindDateMatches = awesomeClient.getMatches("FEMALE", registerStudentResponse.getId());
        System.out.println("Zee matches: " + blindDateMatches.toString());

        // Reject match
        BlindDateMatchDTO rejectMatchPapi = awesomeClient.rejectMatch( Integer.toUnsignedLong(21), new RejectMatchDTO(Integer.parseInt(blindDateMatches.getStudent().getId()), "Not my type really"));
        System.out.println("Get that out of here: " + rejectMatchPapi.toString());

        // My Choice
        BlindDateMatchDTO myChoice = awesomeClient.myChoice( Integer.toUnsignedLong(21) , Integer.toUnsignedLong(blindDateMatches.getMatch().getId()), Long.parseLong(registerStudentResponse.getId()));
    }
}
