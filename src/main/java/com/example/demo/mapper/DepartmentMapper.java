package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DepartmentMapper {

    @Select("select * from department")
    public Department getAllDepartment();

    @Select("select * from department where id=#{id}")
    public Department selectDepartmentById(Integer id);

    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDepartmentById(Integer id);

    @Delete("delete department where id=#{id}")
    public int deleteDepartmentById(Integer id);

}
