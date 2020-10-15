window.onload = function() {
	console.log('roles js');
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
		}
	};
	xhttp.open("GET", "/roles/list", true);
	xhttp.send();
}
