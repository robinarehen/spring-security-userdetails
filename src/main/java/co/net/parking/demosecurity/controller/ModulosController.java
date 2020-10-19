package co.net.parking.demosecurity.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.net.parking.demosecurity.model.ModuloModel;
import co.net.parking.demosecurity.service.ModuloService;
import co.net.parking.demosecurity.utils.ConstantsUtil;

@Controller
@RequestMapping("/modulos")
@PreAuthorize("hasAuthority('/modulos')")
public class ModulosController {

	private ModuloService service;

	public ModulosController(ModuloService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public String getAdminModulos(Model model) {
		
		model.addAttribute(ConstantsUtil.MODULO_OBJ_LISTA, this.service.getAll());

		return ConstantsUtil.MODULO_HOME;
	}

	@GetMapping("/list")
	@PreAuthorize("hasAuthority('/modulos/list')")
	public ResponseEntity<List<ModuloModel>> getModulos() {
		return ResponseEntity.ok(this.service.getAll());
	}

	@GetMapping("/crear")
	@PreAuthorize("hasAuthority('/modulos/crear')")
	public String getCrearModulo(Model model) {

		model.addAttribute(ConstantsUtil.MODULO_OBJ_CREAR, new ModuloModel());
		model.addAttribute(ConstantsUtil.TITLE_PAGE, "Crear Modulos");
		
		return ConstantsUtil.MODULO_CREAR;
	}

	@PostMapping("/crear")
	@PreAuthorize("hasAuthority('/modulos/crear')")
	public String postCrearModulo(Model model, @ModelAttribute(ConstantsUtil.MODULO_OBJ_CREAR) ModuloModel moduloModel) {

		ModuloModel moduloCreado = this.service.create(moduloModel);

		model.addAttribute(ConstantsUtil.MODULO_OBJ_CREAR, moduloCreado);

		return ConstantsUtil.MODULO_CREAR;
	}

	@ModelAttribute
	public Model setAttribute(Model model) {
		model.addAttribute(ConstantsUtil.TITLE_PAGE, ConstantsUtil.MODULO_NOMBRE);
		model.addAttribute(ConstantsUtil.ACTIVE_MODULE, ConstantsUtil.MODULO_NOMBRE);
		return model;
	}
}
