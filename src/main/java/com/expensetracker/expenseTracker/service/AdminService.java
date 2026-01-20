package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.model.Admin;

public interface AdminService {

    public AdminDto getAdminById(Long adminId);

    public boolean save(AdminDto adminDto) throws Exception;

    public boolean update(AdminDto adminDto);

    public boolean delete(AdminDto adminDto);
}
