package co.net.parking.demosecurity.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.net.parking.demosecurity.model.PaginaModuloModel;
import co.net.parking.demosecurity.model.UsuarioModel;
import co.net.parking.demosecurity.service.UsuarioModelService;

@Controller
public class HomeController {

	private UsuarioModelService modelService;

	public HomeController(UsuarioModelService modelService) {
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

		return "redirect:/login";
	}

	@RequestMapping("/dashboard")
	public String dashboard(Principal principal, Model model, HttpSession session) {

		if (session != null && session.getAttribute("menuPaginas") != null) {
			return "dashboard";
		}

		UsuarioModel usuarioModel = this.modelService.getFindByUserName(principal.getName());

		List<PaginaModuloModel> paginasModulo = new ArrayList<>();

		Map<String, List<PaginaModuloModel>> menuPaginas = new HashMap<>();

		usuarioModel.getRolUsuarioModels().forEach(rol -> {
			rol.getRolModel().getPaginaRolModels().forEach(paginas -> {
				String key = paginas.getPaginaModuloModel().getModuloModel().getLabel();
				menuPaginas.put(key, null);
				paginasModulo.add(paginas.getPaginaModuloModel());
			});
		});

		menuPaginas.entrySet().forEach(data -> {
			Predicate<PaginaModuloModel> predicate = (pagina) -> {
				return pagina.getModuloModel().getLabel().equals(data.getKey());
			};
			data.setValue(paginasModulo.stream().filter(predicate).collect(Collectors.toList()));
		});

		session.setAttribute("menuPaginas", menuPaginas);

		return "dashboard";
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute("titlePage", "Dashboard");
		return model;
	}
}
