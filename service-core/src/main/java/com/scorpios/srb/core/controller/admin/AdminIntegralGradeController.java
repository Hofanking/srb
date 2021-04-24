package com.scorpios.srb.core.controller.admin;

import com.scorpios.srb.core.entity.IntegralGrade;
import com.scorpios.srb.core.service.IntegralGradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author scorpios
 * @since 2021-04-24
 */
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    public List<IntegralGrade> listAll(){
        return integralGradeService.list();
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Long id){
        return integralGradeService.removeById(id);
    }

}