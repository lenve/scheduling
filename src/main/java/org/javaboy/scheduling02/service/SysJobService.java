package org.javaboy.scheduling02.service;

import org.javaboy.scheduling02.dao.SysJobRepository;
import org.javaboy.scheduling02.model.SysJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class SysJobService {

    @Autowired
    SysJobRepository sysJobRepository;

    public List<SysJob> getAllJobs() {
        return sysJobRepository.findAll();
    }
}
