window.onload = function() {
	initMaterialize();
	validarLogin();
}

function validarLogin() {
	var url = window.location.search;
	if (url.includes('error')) {
		var information = {
				code: httpStatus.badRequest,
				message: 'Usuario o Contraseña no valido.'
		};
		showToast(information);
	}
}
