package co.net.parking.demosecurity.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.net.parking.demosecurity.model.PaginaModuloModel;
import co.net.parking.demosecurity.model.UsuarioModel;
import co.net.parking.demosecurity.service.UsuarioModelService;

@Controller
public class WebController {

	private UsuarioModelService modelService;

	public WebController(UsuarioModelService modelService) {
		super();
		this.modelService = modelService;
	}

	@RequestMapping({ "/", "/index", "/login" })
	public String login(Model model) {

		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {

		SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();

		logoutHandler.logout(request, null, null);

		return "login";
	}

	@RequestMapping("/dashboard")
	public String dashboard(Principal principal, Model model) {

		UsuarioModel usuarioModel = this.modelService.getFindByUserName(principal.getName());
		
		List<PaginaModuloModel> menu = new ArrayList<>();
		Map<String, List<PaginaModuloModel>> mapTest = new HashMap<>();
		usuarioModel.getRolUsuarioModels().forEach( rol -> {
			rol.getRolModel().getPaginaRolModels().forEach( paginas -> {
				String nombre = paginas.getPaginaModuloModel().getModuloModel().getNombre();
				if(!menu.contains(paginas.getPaginaModuloModel())) {
					menu.add(paginas.getPaginaModuloModel());
				}
				mapTest.put(nombre, menu);
			});
		});
		mapTest.entrySet().forEach( value ->{
			System.out.println(value.getKey());
			value.getValue().forEach( data -> {
				System.out.println(data.getLabel());
			});
		});
		
		model.addAttribute("menu", menu);

		return "dashboard";
	}

	@RequestMapping("/admin/admin-alone")
	@PreAuthorize("hasAuthority('/admin/admin-alone')")
	public String adminAlone() {

		return "admin-alone";
	}

	@RequestMapping("/admin/admin-user")
	@PreAuthorize("hasAuthority('/admin/admin-user')")
	public String adminAndUser() {

		return "admin-user";
	}
}
