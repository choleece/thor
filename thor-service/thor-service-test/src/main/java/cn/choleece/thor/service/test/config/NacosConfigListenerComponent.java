package cn.choleece.thor.service.test.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import org.springframework.stereotype.Component;

/**
 * @author choleece
 * @Description: TODO
 * @Date 2019-12-21 11:33
 **/
@Component
public class NacosConfigListenerComponent {

    @NacosConfigListener(dataId = "nacos-config-example")
    public void onMessage(String config) {
        System.out.println("config changed: " + config);
    }
}
