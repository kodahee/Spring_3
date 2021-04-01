/**
 * 
 */

let id = document.getElementById("id");
let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");

id.addEventListener("blur", function() {
	
	// id
	let message = "6글자 미만입니다.";
	let c = "r1";

	if(id.value.length > 5) {
		message = "6글자 이상입니다.";
		c = "r2";
	}
	
	let idResult = document.getElementById("idResult");
	idResult.innerHTML = message;
	idResult.setAttribute("class", c);

});

pw.addEventListener("blur", function() {
	
		
	// pw
	let message = "8글자 미만입니다."
	let c = "r1";
	
	if(pw.value.length>7) {
		message = "8글자 이상입니다.";
		c = "r2";
	}
	
	let pwResult = document.getElementById("pwResult");
	pwResult.innerHTML = message;
	pwResult.setAttribute("class", c);
	
});

pw2.addEventListener("blur", function() {

	// 메세지 출력 후 칸 비움
	let message = "비밀번호가 일치하지 않습니다."
		
	if(pw.value != pw2.value) {
		pw2.value = "";
	}
	
	let pwResult2 = document.getElementById("pwResult2");
	pwResult2.innerHTML = message;
	
})