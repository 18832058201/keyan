function showCheck(a){
	var c = document.getElementById("myCanvas");
  // var ctx = c.getContext("2d");
	// ctx.clearRect(0,0,1000,1000);
	// ctx.font = "80px 'Microsoft Yahei'";
	// ctx.fillText(a,0,100);
	// ctx.fillStyle = "white";
    c.innerHTML = a;
}
var code ;    
function createCode(){       
    code = "";      
    var codeLength = 4;
    // var selectChar = new Array(1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z');
    var selectChar = [0,1,2,3,4,5,6,7,8,9];
    for(var i=0;i<codeLength;i++) {
       var charIndex = Math.floor(Math.random()*9);
      code +=selectChar[charIndex];
    }      
    if(code.length !== codeLength){
      createCode();      
    }
    showCheck(code);
}
          
function validate () {
    var inputCode = document.getElementById("codeText").value;
    if(inputCode.length <=0) {
      // alert("请输入验证码！");
      document.getElementById("codeText").setAttribute("placeholder","输入验证码");
      createCode();
      return true;   //这里返回true为了开发时方便登录，发布时改为false
    }else if(inputCode !== code ){
        // alert("验证码错误,请重新输入验证码！");
      document.getElementById("codeText").value="";
      document.getElementById("codeText").setAttribute("placeholder","验证码错误");
      createCode();
      return true;  //这里返回true为了开发时方便登录，发布时改为false
    }else {
        return true;
    }
}