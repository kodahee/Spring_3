/**
 * 
 */

// 다 체크가 되어있는 상태에서 체크 하나를 빼면 전체동의 체크해제
// 하나하나 전부 다 체크했을 때 전체동의 자동 체크

function check() {
	alert("check");
	
	let all = document.getElementById("all");
	let ch = document.getElementsByClassName("ch");
	
	let result = true;
	
	
	for(let c of ch) {					// ch 체크 빠진거 없는지 확인
		result = result && c.checked;
	}
	if(result){							// all X, ch 전부 다 체크
		all.checked = true;				// all O
	} else {							// all X, ch 빠진게 있을 때
		for(let c of ch) {
			c.checked = all.checked;	// 체크 전체 해제
		}
	}

}
