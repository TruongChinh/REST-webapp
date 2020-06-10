/**
 * 
 */
package com.wst.demo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TruongChinh
 *
 */
@RestController
@RequestMapping("/")
public class Controller {
	@GetMapping("/hello")
	public String sayHello () {
		return "Hello, The system time now is " + LocalDateTime.now();
	}
}
