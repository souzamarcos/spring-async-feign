package com.marcos.async.gateway;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "httpClient")
public interface HttpClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getPage();

}
