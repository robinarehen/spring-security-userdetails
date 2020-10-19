function ajax(method, url, data) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			ajaxResponse(this.responseText);
		} else {
			ajaxError(this.status, this.responseText);
		}
	};
	xhttp.open(method, url, true);
	xhttp.send();
}

function ajaxResponse() {

}

function ajaxError(statusCode, error) {

}