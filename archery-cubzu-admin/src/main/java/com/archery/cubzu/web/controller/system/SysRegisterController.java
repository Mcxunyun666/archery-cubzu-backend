package com.archery.cubzu.web.controller.system;

import com.archery.cubzu.framework.web.service.SysRegisterService;
import com.archery.cubzu.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.archery.cubzu.common.core.controller.BaseController;
import com.archery.cubzu.common.core.domain.AjaxResult;
import com.archery.cubzu.common.core.domain.model.RegisterBody;
import com.archery.cubzu.common.utils.StringUtils;

/**
 * 注册验证
 * 
 * @author archery-cubzu
 */
@RestController
public class SysRegisterController extends BaseController
{
    @Autowired
    private SysRegisterService registerService;

    @Autowired
    private ISysConfigService configService;

    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody user)
    {
        if (!("true".equals(configService.selectConfigByKey("sys.account.registerUser"))))
        {
            return error("当前系统没有开启注册功能！");
        }
        String msg = registerService.register(user);
        return StringUtils.isEmpty(msg) ? success() : error(msg);
    }
}
