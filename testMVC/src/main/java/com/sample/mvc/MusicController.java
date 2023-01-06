package com.sample.mvc;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {
	
	@RequestMapping("/rock")// /music/rock
	public void rock(Model model) {//void일때는 uri가 view명이 된다.
		model.addAttribute("msg","we will rock...");
	}
	
	@RequestMapping("/funk")
	public void funk(Model model) {
		model.addAttribute("msg","we will funk...");
	}
	
	@RequestMapping("/jazz")
	public void jazz(Model model) {
		model.addAttribute("msg","we will jazz...");
	}
	
	@RequestMapping("/classic")
	public void classic(Model model) {
		model.addAttribute("msg","we will classic...");
	}
	
	@RequestMapping("/go")
	public void go(Model model) throws IOException, InterruptedException {
		Path path = Paths.get(System.getProperty("user.dir"), "sec/main/resouce/chromdriver.exe");

		System.setProperty("webdriver.chrom.driver", path.toString());



		try {
			Runtime.getRuntime().exec(
					"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");

		} catch (Exception e) {
			Runtime.getRuntime().exec(
					"C:/Program Files/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");
		}
	}
}
