package com.toufik.di.HttpServices;

import com.toufik.di.model.Root;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ApiCallTest {

  ApiCall apiCall;
  RestTemplate restTemplate;

  @BeforeEach
  void setUp() {
      String URL = "https://statsapi.web.nhl.com/api/v1/teams";
      restTemplate = new RestTemplate();
      apiCall = new ApiCall(restTemplate);
  }

  @Test
  void rootGEtCall() {
    Root root = apiCall.rootGEtCall();
    System.out.println(root);
  }
}