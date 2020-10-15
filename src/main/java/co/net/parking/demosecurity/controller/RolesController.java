package co.net.parking.demosecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
@PreAuthorize("hasAuthority('/roles')")
public class RolesController {

	@GetMapping
	public String getAdminRoles() {
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
}
