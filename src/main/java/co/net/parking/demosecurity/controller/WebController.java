package co.net.parking.demosecurity.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.net.parking.demosecurity.model.ModuloModel;
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
	public String dashboard(Principal principal) {

		UsuarioModel usuarioModel = this.modelService.getFindByUserName(principal.getName());

		List<ModuloModel> moduloModels = new ArrayList<>();

		usuarioModel.getRolUsuarioModels().stream().forEach((rolUsuario) -> {

			rolUsuario.getRolModel().getPaginaRolModels().stream().forEach((paginaRol) -> {

				ModuloModel moduloModel = paginaRol.getPaginaModuloModel().getModuloModel();

				if (!moduloModels.contains(moduloModel)) {

					String modulo = String.format("id:%s - labe: %s", moduloModel.getIdModulo(),
							moduloModel.getLabel());

					System.out.println(modulo);

					moduloModels.add(moduloModel);
				}

			});
		});

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
