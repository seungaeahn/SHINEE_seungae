document.getElementById("profileUploadButton").addEventListener("click", function(){
    var fileInput = document.getElementById("profileInput");
    var uploadImage = document.getElementById("uploadProfile");
    var imageContainer = document.getElementById("profileContainer");

    if(fileInput.files.length > 0){
        var file = fileInput.files[0];
        var reader = new FileReader();

        reader.onload = function(e){
            uploadImage.src = e.target.result;
            imageContainer.style.display = "block";
        };

        reader.readAsDataURL(file);
    } else{
        alert("프로필 사진을 넣어야 합니다.");
    };
});

function pwCheck(){
    if($('#pw').val() == $('#checkpw').val()){
        $('#checkpm').text('비밀번호 일치').css('color', 'green');
    }else{
        $('#checkpm').text('비밀번호가 불일치').css('color', 'red');
    };
};

function closeButton(){

    if(confirm("정보 수정을 취소하시겠습니까?.")){
        alert("회원 정보수정이 취소되었습니다.")
        var pageMove = "https://music.apple.com/kr/browse";
        location.href=pageMove; 
    };
};

function CreateUser(){
    var userid = document.getElementById("id").value;
    var username = document.getElementById("name").value; 
    var password = document.getElementById("pw").value;
    var passwordCheck = document.getElementById("checkpw").value;
    var userNickname = document.getElementById("nickname").value;
    var userEmail = document.getElementById("emailid").value;
    var userPhone = document.getElementById("phoneNumber").value;
    


    
    var idPattarn =  /^[A-za-z0-9]{6,12}$/;
    var namePattarn = /^[가-힣]{1,15}$/;
    var passwordPattarn = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,20}$/;
    var nicknamePattarn =  /^[가-힣A-za-z0-9]{1,20}$/;
    var emailPattarn =  /^[A-za-z0-9]{1,80}$/;
    var phonePattarn = /^[0-1]{1,3}[0-9]{4,11}$/;

    if(!userid.match(idPattarn)){
        alert("아이디는 6 ~ 12 자의 숫자,영어 로만 구성되어야합니다");
        return false;
    }
    if(!username.match(namePattarn)){
        alert("이름은 15자 이하의 한글로만 구성되어야 합니다.");
        return false;
    }
    if(!password.match(passwordPattarn)){
        alert("비밀번호는 8 ~ 32자의 영문, 대문자, 소문자, 특수문자, 숫자를 포함해야합니다.");
        return false;
    }
    if(password !== passwordCheck){
        alert("비밀번호가 일치하지 않습니다.");
        return false;
    }
    if(!userNickname.match(nicknamePattarn)){
        alert("닉네임은 20자 이하의 영어,숫자,한글로만 구성되어야 합니다.");
        return false;
    }
    if(!userEmail.match(emailPattarn)){
        alert("이메일은 80자 이하의 영어, 숫자로만 구성되어야 합니다.")
        return false;
    }
    if(!userPhone.match(phonePattarn)){
        alert("올바른 번호가 아닙니다.");
        return false;
    }
    alert("정보수정이 정상적으로 완료되었습니다!.");
    var pageMove = "https://music.apple.com/kr/browse";
    location.href=pageMove;     // ( 현재 페이지에서 이동 )
    
    // window.open(사이트링크) ( 새창 열기 )



}