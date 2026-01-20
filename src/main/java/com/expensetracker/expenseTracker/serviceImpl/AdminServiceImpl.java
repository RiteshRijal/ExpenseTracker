package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.mapper.AdminMapper;
import com.expensetracker.expenseTracker.model.Admin;
import com.expensetracker.expenseTracker.repository.AdminRepository;
import com.expensetracker.expenseTracker.service.AdminService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    private static final String SECRET_KEY = "Ritesh1234";

    @Override
    public boolean save(AdminDto adminDto) throws Exception {
        Admin admin = new Admin();
        admin.setAdminId("admin"); // IAuto create Later
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setFullName(adminDto.getFullName());
        admin.setMiddleName(adminDto.getMiddleName());
        admin.setAge(adminDto.getAge());
        admin.setPassword(encryptPassword(adminDto.getPassword()));
        admin.setPhoneNo("975360078");
        admin.setFullName("admin");
        admin.setEmail("rijalritesh32@gmail.com");
        admin.setNoOfAttempts(0L);
        admin.setOldPassword("");
        adminRepository.save(admin);
        return true;
    }


    // Encrypt plain password
    public static String encryptPassword(String plainPassword) throws Exception {
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainPassword.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Decrypt encrypted password
    public static String decrypt(String encryptedPassword) throws Exception {
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }

    @Override
    public boolean delete(AdminDto adminDto) {
        return true;
    }

    @Override
    public boolean update(AdminDto expenseDto) {
        return true;
    }

    public AdminDto getAdminById(Long id) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Admin not found"));

        return AdminMapper.convertToDto(admin);
    }


}
