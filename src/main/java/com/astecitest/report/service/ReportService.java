package com.astecitest.report.service;

import com.astecitest.report.dto.DeviceDTO;
import com.astecitest.report.dto.OperatorDTO;
import com.astecitest.report.dto.ReportDTO;

import java.util.Date;
import java.util.List;

public interface ReportService {

    ReportDTO getReportById(Long id);

    List<ReportDTO> getReports();

    ReportDTO getReportByDate(Date date);

    ReportDTO getReportByOperator(OperatorDTO operator);

    ReportDTO getReportByDevice(DeviceDTO device);
}
