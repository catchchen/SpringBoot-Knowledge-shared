package com.ch.service.admin.impl;

import com.ch.pojo.entity.User;
import com.ch.service.admin.AdminService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public Optional<User> getByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public void updateAdminAssets() {

    }

    @Override
    public String getLogFiles(Long lines) {
        return null;
    }
}
