package com.zzh.controller;

import com.zzh.entity.Organization;
import com.zzh.entity.Result;
import com.zzh.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Controller
@RequestMapping("organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public Result selectList() {
        List<Organization> organizations = organizationService.selectList();
        return new Result(organizations);
    }

}
