package com.zzh.controller;

import com.zzh.entity.Result;
import com.zzh.entity.dto.ReportResponse;
import com.zzh.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by zhenghua.zhang on 2018/1/31.
 */
@Controller
@RequestMapping("report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/countprice", method = RequestMethod.GET)
    @ResponseBody
    public Result findCountAndPrice() {
        ReportResponse result = reportService.reportData();
        return new Result(result);
    }

}
