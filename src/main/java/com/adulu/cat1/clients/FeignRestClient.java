package com.adulu.cat1.clients;

import com.adulu.cat1.models.requests.RegisterStudentDTO;
import com.adulu.cat1.models.requests.RejectMatchDTO;
import com.adulu.cat1.models.responses.BlindDateMatchDTO;
import com.adulu.cat1.models.responses.RegisterStudentResponse;
import jdk.jshell.EvalException;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "superclient", url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {

    // Register student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    RegisterStudentResponse registerStudent(@RequestBody RegisterStudentDTO registerStudentDTO);

    // Request blind date match
    @RequestMapping(method = RequestMethod.POST, value = "matches")
    BlindDateMatchDTO getMatches(@RequestParam String gender, @RequestParam String studentId );

    @RequestMapping(method = RequestMethod.PATCH, value = "matches/{blindDateId}")
    BlindDateMatchDTO rejectMatch(@PathVariable Long blindDateId, @RequestBody RejectMatchDTO rejectMatchDTO);

    @RequestMapping(method = RequestMethod.PUT, value = "dates/{blindDateId}")
    BlindDateMatchDTO myChoice(@PathVariable Long blindDateId, @RequestParam Long matchId, @RequestParam Long studentId);
}
