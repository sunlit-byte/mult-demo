package com.sunlit.nacosdemo.Controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YourName
 * @date 2023-02-03 21:43
 **/
@Controller
@RequestMapping("config")
public class nacosController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @ResponseBody
    @GetMapping("/get")
    public boolean get(){
        System.out.println(useLocalCache);
        return useLocalCache;
    }
}
