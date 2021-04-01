/**
 * 
 */

// 다 체크가 되어있는 상태에서 체크 하나를 빼면 전체동의 체크해제
// 하나하나 전부 다 체크했을 때 전체동의 자동 체크

let all = document.getElementById("all");
let ch = document.getElementsByClassName("ch");

all.addEventListener("click", function() {
	for(let c of ch) {
		c.checked = all.checked;
	}
});

for(let c of ch) {
	c.addEventListener("click", function() {
		
		let result = true;
		for(let c1 of ch) {
			if(!c1.checked) {
				result = false;
				break;
			}
		}
		all.checked = result;
	});
}

function check() {
	alert("check");
	
	/*let check = document.getElementsByClassName("check");
	let all = document.getElementById("all");

	let result = true;

	for(ch of check){
		if(!ch.checked){
			result=false;
			break;
		}
	}
	console.log(result);
	all.checked=result;*/

}
