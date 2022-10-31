package mao.use_starter.service;

import mao.tools_log.entity.OptLogDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：logback_spring_boot_starter_demo
 * Package(包名): mao.use_starter.service
 * Class(类名): LogService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 22:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class LogService
{

    private static final Logger log = LoggerFactory.getLogger(LogService.class);


    /**
     * 将日志信息保存
     *
     * @param optLogDTO OptLogDTO对象
     */
    public void saveLog(OptLogDTO optLogDTO)
    {
        //此处只是将日志信息进行输出，实际项目中可以将日志信息保存到数据库
        log.info("保存日志信息：" + optLogDTO);
    }
}
