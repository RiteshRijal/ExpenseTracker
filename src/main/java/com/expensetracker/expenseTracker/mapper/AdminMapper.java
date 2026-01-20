package com.expensetracker.expenseTracker.mapper;

import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.model.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminMapper {

    public static AdminDto convertToDto(Admin admin){
        AdminDto adminDto=new AdminDto();
        adminDto.setId(admin.getId());
        adminDto.setAdminId(admin.getAdminId()); // IAuto create Later
        adminDto.setFirstName(admin.getFirstName());
        adminDto.setLastName(admin.getLastName());
        adminDto.setFullName(admin.getFullName());
        adminDto.setMiddleName(admin.getMiddleName());
        adminDto.setAge(admin.getAge());
        admin.setPhoneNo(admin.getPhoneNo());
        adminDto.setFullName(admin.getFullName());
        adminDto.setEmail(admin.getEmail());
        return adminDto;
    }

    public static List<AdminDto> convertToDtos(List<Admin> admins) {
        List<AdminDto> adminDtos = new ArrayList<>();
        for(Admin admin: admins){
            adminDtos.add(convertToDto(admin));
        }
        return adminDtos;
    }
}
