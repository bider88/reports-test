package com.astecitest.report.web;

import com.astecitest.report.dto.ReportDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class Report {

    @GetMapping
    public ResponseEntity<ReportDTO> getReport() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
