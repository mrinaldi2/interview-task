package com.interview.play.interview.controller;

import com.interview.play.interview.model.ResponsePojo;
import com.interview.play.interview.model.response.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${app.endpoint.api}", produces = APPLICATION_JSON_VALUE)
public class DataController {

    @CrossOrigin(origins = "${app.allowed.origin.localhost}")
    @GetMapping("${app.endpoint.get.data}")
    @ResponseStatus(HttpStatus.OK)
    public RestResponse<ResponsePojo> getDataFromFiles() {
        //implementation
    }
}
