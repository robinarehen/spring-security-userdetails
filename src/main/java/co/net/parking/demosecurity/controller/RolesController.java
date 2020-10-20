package co.net.parking.demosecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.net.parking.demosecurity.service.RolService;
import co.net.parking.demosecurity.utils.ConstantsUtil;

@Controller
@RequestMapping("/roles")
@PreAuthorize("hasAuthority('/roles')")
public class RolesController {

	private RolService service;

	public RolesController(RolService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public String getAdminRoles(Model model) {

		model.addAttribute(ConstantsUtil.ROL_OBJ_LISTAR, this.service.getAll());

		return ConstantsUtil.ROL_HOME;
	}

	@GetMapping("/crear")
	@PreAuthorize("hasAuthority('/roles/crear')")
	public String getCrearRoles(Model model) {
		model.addAttribute(ConstantsUtil.TITLE_PAGE, ConstantsUtil.ROL_TIT_CREAR);
		return ConstantsUtil.ROL_CREAR;
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute(ConstantsUtil.TITLE_PAGE, ConstantsUtil.ROL_NOMBRE);
		model.addAttribute(ConstantsUtil.ACTIVE_MODULE, ConstantsUtil.ROL_NOMBRE);
		return model;
	}
}
