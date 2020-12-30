package com.astecitest.report.service.impl;

import com.astecitest.report.dto.DeviceDTO;
import com.astecitest.report.dto.OperatorDTO;
import com.astecitest.report.dto.ReportDTO;
import com.astecitest.report.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Override
    public ReportDTO getReportById(Long id) {
        return null;
    }

    @Override
    public List<ReportDTO> getReports() {
        return null;
    }

    @Override
    public ReportDTO getReportByDate(Date date) {
        return null;
    }

    @Override
    public ReportDTO getReportByOperator(OperatorDTO operator) {
        return null;
    }

    @Override
    public ReportDTO getReportByDevice(DeviceDTO device) {
        return null;
    }
}
