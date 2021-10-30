package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside saveOrder method if Order controller");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    //@Cacheable("department")
    public Department findDepartmentId(@PathVariable("id") Long deparmentId){
        log.info("inside find OrderById method if Order controller!");
        return departmentService.findDepartmentId(deparmentId);
    }

//    @Value("${welcome}")
//    String a;

    @GetMapping
    public String helloWorld(){
        return "Hửu thái department";
    }
}
