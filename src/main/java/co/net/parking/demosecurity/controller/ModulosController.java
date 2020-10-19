package co.net.parking.demosecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/modulos")
@PreAuthorize("hasAuthority('/modulos')")
public class ModulosController {

	@GetMapping
	public String getAdminRoles() {
		return "modulos/admin-modulos";
	}

	@GetMapping("/list")
	public ResponseEntity<String> getRoles() {
		return ResponseEntity.ok("modulos");
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute("titlePage", "Modulos");
		model.addAttribute("activeModule", "Modulos");
		return model;
	}
}
