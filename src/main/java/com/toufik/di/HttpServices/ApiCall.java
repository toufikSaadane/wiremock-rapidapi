package com.toufik.di.HttpServices;

import com.toufik.di.model.Root;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class ApiCall {
  private RestTemplate restTemplate;
  public static String URL = "https://statsapi.web.nhl.com/api/v1/teams";

  public ApiCall(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public Root rootGEtCall() {
    return restTemplate.getForEntity(URL, Root.class).getBody();
  }


}
