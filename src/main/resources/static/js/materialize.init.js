
window.onload = function() {
	init();
}

function init() {
	
	var elems = document.querySelectorAll('.sidenav');
	M.Sidenav.init(elems);
	
	elems = document.querySelectorAll('.tooltipped');
	M.Tooltip.init(elems);

	elems = document.querySelectorAll('select');
	M.FormSelect.init(elems);
	
	elems = document.querySelectorAll('.collapsible');
    M.Collapsible.init(elems);
}

function showToast(information) {

	var className;
	var htmlMessage;

	switch (information.code) {
	case 200:
		className = 'green lighten-1';
		htmlMessage = information.message
		break;
	case 201:
		className = 'green lighten-1';
		htmlMessage = information.message
		break;
	case 400:
		className = 'red lighten-1';
		htmlMessage = information.message
		break;
	case 500:
		className = 'red lighten-1';
		htmlMessage = information.message
		break;
	default:
		className = 'red lighten-1';
		htmlMessage = 'Error Inesperado.'
		break;
	}

	M.toast({
		html : htmlMessage,
		classes : className
	});
}
