package com.gotech.inventoryservice.controller;

import com.gotech.inventoryservice.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("service for inventory")
@RestController
@Slf4j
@RequestMapping("/inventory")
public class InventoryController {
  @ApiOperation("/get")
  @GetMapping("/get")
  public Response getInventory() {
    return new Response(HttpStatus.OK.toString(), "successfully found.");
  }
}
