/**
 * 
 */
function sendit() {
	
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpw_re =frm.userpw_re;
	let username = frm.username;
	
	if (userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	
	if (userpw.value == "") {
		alert("패스워드를 입력하세요");
		userpw.focus();
		return false;
		
	}
	if (userpw.value != userpw_re.value) {
		alert("패스워드를 다릅니다");
		userpw.focus();
		return false;
		
	}
	
	if (username.value == "") {
		alert("이름이 다릅니다");
		username.focus();
		return false;
	}
	
	frm.submit();
	//사용할 수 없는 아이디 이면 > 가입완료에서도 걸리게끔
}
function logincheck() {
		//아이디 "", alert
		//비밀번호 "", alert
		let frm = document.frm;
		let userid = frm.userid;
		let userpw = frm.userpw;
		
		if (userid.value == "") {
			alert("아이디 입력 필수입니다");
			userid.focus();
			return false;
		}
		if (userpw.value == "") {
			alert("비밀번호 입력 필수입니다");
			userpw.focus();
			return false;
		}
		
		frm.submit();
}

//id 중복체크
function checkId(userid){
	//alert(userid);
	if(userid ==""){
		alert("아이디를 입력해주세요");
		return false;
	}else {
		//ajax통신
			let xhr = new XMLHttpRequest();
		xhr.open("GET", "idcheck.jsp?userid="+userid, true);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
				if(xhr.responseText.trim() == "ok"){ //ok
					document.getElementById("text").innerHTML ="사용할 수 있는아이디";
				}else { //not
					document.getElementById("text").innerHTML ="사용할 수 없는아이디";
				}
			
			}
		}
	}
}