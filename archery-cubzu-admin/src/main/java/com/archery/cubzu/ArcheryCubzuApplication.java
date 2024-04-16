package com.archery.cubzu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author archery-cubzu
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ArcheryCubzuApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ArcheryCubzuApplication.class, args);
        System.out.println("                   __                    ______      __               \n" +
                "  ____ ___________/ /_  ___  _______  __/ ____/_  __/ /_  ____  __  __\n" +
                " / __ `/ ___/ ___/ __ \\/ _ \\/ ___/ / / / /   / / / / __ \\/_  / / / / /\n" +
                "/ /_/ / /  / /__/ / / /  __/ /  / /_/ / /___/ /_/ / /_/ / / /_/ /_/ / \n" +
                "\\__,_/_/   \\___/_/ /_/\\___/_/   \\__, /\\____/\\__,_/_.___/ /___/\\__,_/  \n" +
                ">>>---------------------->     /____/ H e l l o , N e w  C u b z u !\n" +
                "后端服务启动成功~！");
    }
}
