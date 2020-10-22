window.onload = function() {

	initMaterialize();

	respuestaCrear();
}

function respuestaCrear() {
	var inputRespuesta = document.getElementById('inputRespuesta');
	if(inputRespuesta == null){
		return;
	}

	var information = {
		code : '',
		message : ''
	};

	switch (inputRespuesta.value) {
	case '201':
		information.code = 201;
		information.message = 'Se ha Crea el Modulo correctamente!';
		break;
	default:
		information.code = 0;
		break;
	}

	if(information.code >= 200){		
		showToast(information);
	}
}