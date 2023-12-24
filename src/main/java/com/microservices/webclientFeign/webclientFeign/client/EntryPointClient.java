package com.microservices.webclientFeign.webclientFeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="ENTRYENDPOINT")
@Component
public interface EntryPointClient {
    @RequestMapping("/root")
    public String getRoot();
}
