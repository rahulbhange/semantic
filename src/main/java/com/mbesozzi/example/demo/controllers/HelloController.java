package com.mbesozzi.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController
{
    @GetMapping(value = {"/",""})
	public String index(){
		return "Helloooooooo world welcome to semantic demo....ughfoqihofihqoifhoqihfoihqfohcbjlm;mlmhkuahfkahugfg
		m;lms;l;fl;l,al,fpok[aok[okfpom,pl,sk...";
	}

	@GetMapping(value = {"/test"})
	public String test(){
		return "test";
	}
	
	@GetMapping(value = {"/test2"})
	public String test2(){
		return "test2";
	}

	@GetMapping(value = {"/version"})
	public String version(){
		return "v1";
	}
}


