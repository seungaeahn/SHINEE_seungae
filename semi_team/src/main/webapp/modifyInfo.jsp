<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>샤이니 뮤직 홈페이지</title>
        <link rel="stylesheet" type="text/css" href="./css/style_my.css">
        <link rel="stylesheet" href="https://unpkg.com/98.css" />
        
        
    </head>
    <body>
        <div class="pageColor">
            <p id="bluetop"><strong>Modify My Info</strong> 
            
            
            
            <div id="createAccount">
                <div>
                    
                    
                    <br>
                    <div>
                        <div id="profileContainer">
                            <!-- 프로필 사진을 표시할 컨테이너 -->
                            <img id="uploadProfile" style="width: 340px; height: 240px; margin: 0 0 0 6%;">
                        </div>
                        <input type="file" id="profileInput" accept="image/*" style="margin: 0 0 0 6%;">
                        <button id="profileUploadButton">프로필 등록</button>
                    </div>
                   
                </div>
                <br>
                <br>
                <div id="divid">
                    <label for="id">
                        <img src="./img/oldicon/user.png" style="width: 28px;height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="id" type="text" placeholder="아이디" readonly="readonly">
                    
                </div>
                <br>
                
                    <div>
                    
                        <label for="pw">
                            <img src="./img/oldicon/password.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                        </label>
                        <input id="pw" type="password" placeholder="비밀번호">
                        <p id="pm" style="color: red;"></p>
                    </div>
                    <br>
                    <div>
                        <label for="checkpw">
                            <img src="./img/oldicon/passwordcheck.png" style="width: 26px; height: 26px; margin-bottom: -8px;">
                        </label>
                        <input id="checkpw" type="password" placeholder="비밀번호 확인">
                        <input type="submit" value="비밀번호 확인">
                        <p id="checkpm" style="color: red;"></p>
                    </div>
                
                <div>
                    <label for="nickname">
                        <img src="./img/oldicon/profile.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="nickname" type="text" placeholder="닉네임">
                    <input type="submit" id="checkNname" value="닉네임 중복 확인">
                </div>
                <br>
                
                <br>
                <div>
                    <label for="emailid">
                        <img src="./img/oldicon/email.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="emailid" type="text" placeholder="이메일 주소">
                    <strong>@ </strong>
                    <input id="emailLink" type="text" placeholder="naver.com">
                </div>
                <br>
                <div>
                    <label for="phoneNumber2">
                        <img src="./img/oldicon/phone.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="phoneNumber1" type="text" placeholder="010">
                    <strong>-</strong>
                    <input id="phoneNumber2" type="text" placeholder="0000">
                    <strong>-</strong>
                    <input id="phoneNumber3" type="text" placeholder="0000">
                </div>
                <br>
                <br>
                <br>
                <input type="submit" id="checkNname" value="수정 완료">
            </div>
                </div>
                
                

            
        </div>
        <script src="https://code.jquery.com/jquery-3.7.1.js" 
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
        crossorigin="anonymous"></script>
        <script>
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
        </script>
    </body>
</html>
