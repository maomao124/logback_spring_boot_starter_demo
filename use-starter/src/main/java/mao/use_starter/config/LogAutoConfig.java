package mao.use_starter.config;

import mao.tools_log.entity.OptLogDTO;
import mao.tools_log.event.SysLogListener;
import mao.use_starter.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project name(项目名称)：logback_spring_boot_starter_demo
 * Package(包名): mao.use_starter.config
 * Class(类名): LogAutoConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 22:38
 * Version(版本): 1.0
 * Description(描述)： 日志配置类
 */


@Configuration
public class LogAutoConfig
{

    private static final Logger log = LoggerFactory.getLogger(LogAutoConfig.class);

    //自动配置日志监听器组件
    @Bean
    @ConditionalOnMissingBean
    public SysLogListener sysLogListener(LogService logService)
    {
        return new SysLogListener(logService::saveLog);
    }
}
