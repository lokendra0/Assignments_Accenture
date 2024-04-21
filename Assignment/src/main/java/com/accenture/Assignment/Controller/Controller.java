package com.accenture.Assignment.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.Assignment.Model.User;

import jakarta.validation.Valid;

@RestController
public class Controller {

	   @GetMapping("/healthcheck")
	   public ResponseEntity<?> getHealthCheck(@RequestParam(value = "format", defaultValue = "short") String format) {
	       Map<String, Object> response = new HashMap<>();
	       if ("short".equalsIgnoreCase(format)) {
	           response.put("status", "OK");
	       } else if ("full".equalsIgnoreCase(format)) {
	           LocalDateTime currentTime = LocalDateTime.now();
	           String formattedTime = currentTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	           response.put("status", "OK");
	           response.put("currentTime", formattedTime);
	       } else {
	           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid format parameter. Allowed values are 'short' and 'full'.");
	       }
	       return ResponseEntity.ok(response);
	   }


	   @GetMapping("/getUser")
	   public ResponseEntity<?> getUser(@RequestBody @Valid User user, BindingResult br) {
	   if(br.hasErrors()) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("INVALID USER REQUEST");
	   }else {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);

	   }
	   }
	
}
