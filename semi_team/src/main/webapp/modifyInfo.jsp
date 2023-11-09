<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>SHINee Music회원정보 페이지</title>
        <link rel="stylesheet" type="text/css" href="CreateAccountPage.css">
    </head>
    <body>
        <div class="pageColor">
            <div class="TabColor"><img src="images/mypage.png" class="TabiconImage"><strong class="TabTextStyle">회원 가입</strong> 
                <button id="pageCloseButton" class="pageCloseButton" onclick="closeButton()"><Strong class="pageCloseButtonText">X</Strong></button>
            </div>           
                <div id="createAccount">
                <div id="divid">
                    <label for="id">
                        <img class="iconImg" src="images/user.png">
                    </label>
                    <input id="id" type="text" value="${userinfo.getUserNickname }" readonly="readonly">
                   
                    <p id="ruleid"></p>
                </div>
                <div>
                    <label for="name">
                        <img class="iconImg" src="images/name.png">
                    </label>
                    <input id="name" type="text" placeholder="이름">
                    <p id="rulename"></p>
                </div>
                <div>
                    <label for="pw">
                        <img class="iconImg" src="images/password.png">
                    </label>
                    <input id="pw" type="password" value="${userinfo.getUserNickname }" oninput="pwCheck()"  placeholder="비밀번호">
                    <p id="rulepm"></p>
                </div>
                <div>
                    <label for="checkpw">
                       <img class="iconImg" src="images/passwordcheck.png">
                    </label>
                    <input id="checkpw" type="password" oninput="pwCheck()" placeholder="비밀번호 확인">
                    <span id="checkpm"></span>
                </div>
                <br>
                <div>
                    <label for="nickname">
                        <img class="iconImg" src="images/profile.png">
                    </label>
                    <input id="nickname" type="text" placeholder="닉네임">
                    <p id="rulenickname"></p>
                </div>
                
                <div>
                    <div id="profileContainer">
                        <!-- 프로필 사진을 표시할 컨테이너 -->
                        <img id="uploadProfile">
                    </div>
                    <input type="file" id="profileInput" accept="image/*" style="margin: 0 0 0 6%;">
                    <button id="profileUploadButton">프로필 등록</button>
                </div>
                <br>
                <div>
                    <label for="emailid">
                        <img class="iconImg" src="images/email.png">
                    </label>
                    <input id="emailid" type="text" placeholder="myemail">
                    <strong>@</strong>
                    <input id="emailLink" type="text" placeholder="naver.com">
                    <p id="ruleemail"></p>
                </div>
                
                <div>
                    <label for="phoneNumber">
                        <img class="iconImg" src="images/phone.png">
                    </label>
                    <input id="phoneNumber" type="text" placeholder="01012345678">
                    <p id="rulephoneNumber"></p>
                </div>
                <button id="createUserButton" onclick="CreateUser()">정보수정</button>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.7.1.js" 
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
        crossorigin="anonymous"></script>
        <script src="js/CreateAccountPage.js">

        </script>
    </body>
</html>