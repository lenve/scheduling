package org.javaboy.scheduling02.controller;

import org.javaboy.scheduling02.model.SysJob;
import org.javaboy.scheduling02.service.SysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
@RequestMapping("/jobs")
public class SysJobController {
    @Autowired
    SysJobService sysJobService;
    @GetMapping("/")
    public List<SysJob> getAllJobs() {
        return sysJobService.getAllJobs();
    }
}
