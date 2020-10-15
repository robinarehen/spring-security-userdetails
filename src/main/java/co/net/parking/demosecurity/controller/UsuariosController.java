package co.net.parking.demosecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
@PreAuthorize("hasAuthority('/usuarios')")
public class UsuariosController {

	@GetMapping
	public String getAdminRoles() {
		return "usuarios/admin-usuarios";
	}
	
	@GetMapping("/list")
	public ResponseEntity<String> getRoles() {
		return ResponseEntity.ok("usuarios");
	}
	
	@GetMapping("/crear")
	@PreAuthorize("hasAuthority('/usuarios/crear')")
	public String getCrearRoles() {
		return "usuarios/crear-usuarios";
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute("titlePage", "Usuarios");
		model.addAttribute("activeModule", "Servicio Usuarios");
		return model;
	}
}
