package com.taller.CRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taller.Service.Api.TiendaServiceApi;
import com.taller.entity.Api.Tienda;

@Controller
public class TiendaController {
	
	@Autowired
	private TiendaServiceApi tiendaServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", tiendaServiceApi.getAll());
		//System.out.println(model);
		return "index";
	}
	//Muestra los registros 
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id")long id, Model model) {
		if(id!= 0) {
			model.addAttribute("tienda", tiendaServiceApi.get(id));
		}else {
			model.addAttribute("tienda", new Tienda());
		}
		return "save";
	}
	//Guarda el registro
		@PostMapping("/save")
		public String save(Tienda tienda, Model model) {
			tiendaServiceApi.save(tienda);
			
			return "redirect:/";
		}
		@GetMapping("/delete/{id}")
		public String delete(@PathVariable long id, Model model) {
			tiendaServiceApi.delete(id);
			return "redirect:/";
		}
 }

