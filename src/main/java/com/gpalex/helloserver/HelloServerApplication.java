package com.gpalex.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@SpringBootApplication
@RestController
public class HelloServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloServerApplication.class, args);
  }


  @Operation(summary = "Retrieve user and password")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the credentials", content = @Content),
      @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
      @ApiResponse(responseCode = "404", description = "Book not found", content = @Content) }) // @formatter:on

  @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
  public String whoami() {
    System.out.println("Hello world in logs");
    return String.format("Hello World");
  }

}
