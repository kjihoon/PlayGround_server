<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<body>

 <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
              <h6 class="w3-opacity">Social Media template by w3.css</h6>
              <p contenteditable="true" class="w3-border w3-padding">Status: Feeling Blue</p>
              <button type="button" class="w3-button w3-theme"><i class="fa fa-pencil"></i>  Post</button> 
            </div>
          </div>
        </div>
      </div>
      
      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
        <img src="../img/1.20180424094638.jpg" alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px">
        <span class="w3-right w3-opacity">1 min</span>
        <h4>John Doe</h4><br>
        <hr class="w3-clear">
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
          <div class="w3-row-padding" style="margin:0 -16px">
            <div class="w3-half">
              <img src="../img/1.20180424094638.jpg" style="width:100%" alt="Northern Lights" class="w3-margin-bottom">
            </div>
            <div class="w3-half">
              <img src="/w3images/nature.jpg" style="width:100%" alt="Nature" class="w3-margin-bottom">
          </div>
        </div>
        <button type="button" class="w3-button w3-theme-d1 w3-margin-bottom"><i class="fa fa-thumbs-up"></i>  Like</button> 
        <button type="button" class="w3-button w3-theme-d2 w3-margin-bottom"><i class="fa fa-comment"></i>  Comment</button> 
      </div>
      
      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
        <img src="/w3images/avatar5.png" alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px">
        <span class="w3-right w3-opacity">16 min</span>
        <h4>Jane Doe</h4><br>
        <hr class="w3-clear">
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        <button type="button" class="w3-button w3-theme-d1 w3-margin-bottom"><i class="fa fa-thumbs-up"></i>  Like</button> 
        <button type="button" class="w3-button w3-theme-d2 w3-margin-bottom"><i class="fa fa-comment"></i>  Comment</button> 
      </div>  

      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
        <img src="/w3images/avatar6.png" alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px">
        <span class="w3-right w3-opacity">32 min</span>
        <h4>Angie Jane</h4><br>
        <hr class="w3-clear">
        <h2 id="mainView"></h2>
        <p>Have you seen this?</p>
        <img src="/w3images/nature.jpg" style="width:100%" class="w3-margin-bottom">
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        <button type="button" class="w3-button w3-theme-d1 w3-margin-bottom"><i class="fa fa-thumbs-up"></i>  Like</button> 
        <button type="button" class="w3-button w3-theme-d2 w3-margin-bottom"><i class="fa fa-comment"></i>  Comment</button> 
      </div> 
     
     
     <div class="include">
	     <!-- <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
	             <img src="/w3images/avatar6.png" alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px">
	             <span class="w3-right w3-opacity">32 min</span>
	             <h4 id="uidx"></h4><br>
	             <hr class="w3-clear">
	             <img id="pidx"  style="width:100%" class="w3-margin-bottom">
	             <p id="cmt"></p>
	             <button type="button" class="w3-button w3-theme-d1 w3-margin-bottom"><i class="fa fa-thumbs-up"></i>  Like</button> 
	             <button type="button" class="w3-button w3-theme-d2 w3-margin-bottom"><i class="fa fa-comment"></i>  Comment</button> 
	     </div> -->
    </div> 
     
    <!-- End Middle Column -->
    </div>

    
    
</body>


<script>
$(document).ready(function () {
    $(document).scroll(function() {
      var maxHeight = $(document).height();
      var currentScroll = $(window).scrollTop() + $(window).height();
      if (maxHeight <= currentScroll +1) {
   	  
        $.ajax({
           url:'../mainView.do',
          success:function(data){
        	 var json = JSON.parse(data);
        		 $('.include').html(
                		 "<div class="+"'w3-container w3-card w3-white w3-round w3-margin'"+"><br>"+
        	             "<img src="+"'/w3images/avatar6.png'"+" alt="+"'Avatar'"+ "class="+"'w3-left w3-circle w3-margin-right'"+ "style="+"'width:60px'>"+
        	             "<span class="+"'w3-right w3-opacity'"+">32 min</span>"+
        	             "<h4></h4><br>"+
        	             "<hr class="+"'w3-clear'"+">"+
        	             "<img style="+"'width:100%'"+ "class="+"'w3-margin-bottom'"+">"+
        	             "<p></p>"+
        	             "<button type="+"'button'"+ "class="+"'w3-button w3-theme-d1 w3-margin-bottom'"+"><i class="+"'fa fa-thumbs-up'"+"></i>  Like</button>"+
        	             "<button type="+"'button'"+ "class="+"'w3-button w3-theme-d2 w3-margin-bottom'"+"><i class="+"'fa fa-comment'"+"></i>  Comment</button>"+ 
        	     "</div>"+	 
        	     
        	             "<div class="+"'w3-container w3-card w3-white w3-round w3-margin'"+"><br>"+
        	             "<img src="+"'/w3images/avatar6.png'"+" alt="+"'Avatar'"+ "class="+"'w3-left w3-circle w3-margin-right'"+ "style="+"'width:60px'>"+
        	             "<span class="+"'w3-right w3-opacity'"+">32 min</span>"+
        	             "<h4></h4><br>"+
        	             "<hr class="+"'w3-clear'"+">"+
        	             "<img style="+"'width:100%'"+ "class="+"'w3-margin-bottom'"+">"+
        	             "<p></p>"+
        	             "<button type="+"'button'"+ "class="+"'w3-button w3-theme-d1 w3-margin-bottom'"+"><i class="+"'fa fa-thumbs-up'"+"></i>  Like</button>"+
        	             "<button type="+"'button'"+ "class="+"'w3-button w3-theme-d2 w3-margin-bottom'"+"><i class="+"'fa fa-comment'"+"></i>  Comment</button>"+ 
        	     "</div>"
                 )
            	 
            	 
            	 
          		 $('.include').find("img").attr("src","../img/"+json[1].pidx+".jpg");
                 $('.include').find('h4').html(json[1].uidx);
                 $('.include').find('p').html(json[1].cmt);

        	 
        	             
         
          
          },
          error:function(){
             alert("fail")
          }      
        })
      }
    })
  });

</script>