package com.adulu.cat1.clients;

import com.adulu.cat1.models.requests.RegisterStudentDTO;
import com.adulu.cat1.models.responses.RegisterStudentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "superclient", url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    RegisterStudentResponse registerStudent(@RequestBody RegisterStudentDTO registerStudentDTO);

}
