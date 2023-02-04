package com.sunlit.nacosdemo.Controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.api.naming.pojo.ListView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.View;
import java.util.List;

/**
 * @author YourName
 * @date 2023-02-03 22:25
 **/

@Controller
@RequestMapping("discovery")
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/get")
    @ResponseBody
    public ListView<String> get(@RequestParam String serverName) throws NacosException {
        ListView<String> servicesOfServer = namingService.getServicesOfServer(1, 10);
        System.out.println(servicesOfServer.toString());
        List<String> data = servicesOfServer.getData();
        System.out.println(data);
        return servicesOfServer;
    }
}
