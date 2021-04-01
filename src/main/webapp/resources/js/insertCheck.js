/**
 * 
 */

function insertCheck() {
	
	alert("Insert Check");
	
	// name, title 비어있는지 확인
	// 둘다 있으면 alert OK
	// 둘 중 하나라도 없으면 alert NO
	
	let name = document.getElementById("name");
	let title = document.getElementById("title");
	
	if(name.value != null && title.value != null) {
		alert("OK");
	} else {
		alert("NO");
	}
	
	
	return false;
	
}