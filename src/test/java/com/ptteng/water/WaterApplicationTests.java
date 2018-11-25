package com.ptteng.water;

import com.ptteng.water.system.service.DepartmentService;
import com.ptteng.water.system.service.ElementService;
import com.ptteng.water.system.service.GradeService;
import com.ptteng.water.system.service.ManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WaterApplicationTests {
    @Autowired
    ManagerService departmentService;
    @Test
    public void contextLoads() {
        System.out.println(departmentService.getById(1));
    }

}
