<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SHINee Music</title>
        <style>
    .white-box {
	background: white;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0.5px 0.5px 2px 1px #eee;
    }
        </style>
        <link rel="stylesheet" href="./css/all.css">
        <link rel="stylesheet" href="main.css">
    </head>
    <body>
        <aside>
            <button style="margin-top: 250px;">
                <img src="mypage.png" style="width:85px; padding:0;" alt="myPage Icon">
                <p><strong>My Page</strong></p>
            </button>
            <button style="margin-top: 50px;">
                <img src="lookaround.png" style="width:85px; padding:0;" alt="MyPlaylist Icon">
                <p><strong>My<br>Playlist</strong></p>
            </button>
            <button style="margin-top: 50px;">
                <img src="pixel_search.png" style="width:85px; padding:0;" alt="Search Icon">
                <p><strong>search</strong></p>
            </button>
            
            
        </aside>

        <section>
            <div class="bluetop" style="margin-top:20px; width:1200px;">
                <p style="margin-top:5px;" ><img src="smile.png" style="height: 50px; float: left; margin-top: -17px; "><strong>My Page</strong></p>
            </div>
            <div style="width:1200px; height:30px; background-color: gray;">
                
                <article>
                    <div class="d-flex">
                        <div class="flex-shrink-0">
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                              <img class="profile" src="./img/루피.jpg" style="width: 200px; height: 200px;">    
                          
                        </div>
                        <div class="flex-grow-1 ms-3">
                          <h3>닉네임${user_nickname.user_nickname }</h3>
                          <h4>아이디${user_id.user_id }</h4>
                          <button class="btn btn-primary" onclick="location.href='modifyInfo.jsp'">프로필 수정하기</button>
                        </div>
                        
                      </div> 
                      <br><br>
          <div class="col-md-3">
            <div class="white-box">
              <h2>My Playlist</h2>
              <p>여기는 대표 플레이스트가 보이는 자리입니다.</p>
            </div>
          </div>
          <br><br>
          <div class="col-md-6">
            <div class="white-box">
              <div class="mb-5">
                <h2>Followings</h2>
                <p>
                여기는 팔로잉한 사람들의 프로필이나 플리를 띄우자
                </p>
              </div>
              
            </div>
          </div>





                </article>
            </div>
        </section>
        





        
       
          
          
          
          
    </body>
</html>