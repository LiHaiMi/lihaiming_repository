package cn.jy.controller;

import cn.jy.pojo.Dept;
import cn.jy.pojo.Emp;
import cn.jy.service.DeptService;
import cn.jy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private EmpService empService;
    @Value("${file.upload.path}")
    private  String filePath;

    @GetMapping("hello")
    @ResponseBody
    public  String test(){
        return  "hello word";
    }

    @GetMapping("toAddEmp")
    public  String toAddEmp(Model model){
        List<Dept> depts = deptService.findAll();
        model.addAttribute("depts",depts);
        return  "addEmp";
    }

    @PostMapping ("addEmp")
    public  String addEmp(@ModelAttribute(value = "emp") Emp emp,
                          @RequestParam(value="file") MultipartFile file ) throws IOException {

        //获取文件铭
        String filename = file.getOriginalFilename();
        System.out.println(filename);
       // String s = UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf("."));
        File photoFile1 = new File(filePath, filename);
        //判断当前系统是否存在上次路径
        if (!photoFile1.getParentFile().exists()){
            photoFile1.getParentFile().mkdirs();
        }

        file.transferTo(new File(filePath+File.separator+filename));
        emp.setPhoto("/photo/"+filename);
        empService.addEmp(emp);
        return  "redirect:/emp/findAll";
    }
    @GetMapping("findAll")
    public  String findAll(Model model){
        List<Emp> emps= empService.findAll();
        model.addAttribute("emps",emps);
        return "empList";
    }

    //修改回显
    @GetMapping("toUpdate")
    public  String toUpdate(Model model,@ModelAttribute(value = "eid") Integer eid){
        List<Dept> depts = deptService.findAll();
        model.addAttribute("depts",depts);

        //回显
        Emp empList=empService.findEmp(eid);
        model.addAttribute("empList",empList);
        return  "update";
    }


    @PostMapping ("Update")
    public  String Update(@ModelAttribute(value = "emp") Emp emp,
                          @RequestParam(value="file") MultipartFile file ) throws IOException {

        //获取文件铭
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        File photoFile1 = new File(filePath, filename);
        //判断当前系统是否存在上次路径
        if (!photoFile1.getParentFile().exists()){
            photoFile1.getParentFile().mkdirs();
        }

        file.transferTo(new File(filePath+File.separator+filename));
        emp.setPhoto("E:\\photo\\"+filename);
        empService.Update(emp);
        return  "redirect:/emp/findAll";
    }

}
