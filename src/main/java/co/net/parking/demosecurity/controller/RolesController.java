package co.net.parking.demosecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
@PreAuthorize("hasAuthority('/roles')")
public class RolesController {

	@GetMapping
	public String getAdminRoles(Model model) {
		return "roles/admin-roles";
	}

	@GetMapping("/list")
	public ResponseEntity<String> getRoles() {
		return ResponseEntity.ok("roles");
	}

	@GetMapping("/crear")
	@PreAuthorize("hasAuthority('/roles/crear')")
	public String getCrearRoles() {
		return "roles/crear-roles";
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute("titlePage", "Roles");
		model.addAttribute("activeModule", "Servicio Roles");
		return model;
	}
}
