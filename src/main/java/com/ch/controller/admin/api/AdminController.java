package com.ch.controller.admin.api;


import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import com.ch.service.admin.AdminService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    public AuthToken auth(@RequestBody UserLoginParam loginParam) {
        return adminService.authCheck(loginParam);
    }

    @PostMapping("logout")
    public void logout() {
        adminService.clearToken();
    }

    public void sendResetCode(@RequestBody ResetPasswordParam param) {
        adminService.sendResetPassword(param);
    }
    
}
