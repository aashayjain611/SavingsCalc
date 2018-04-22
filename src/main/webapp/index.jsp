<!DOCTYPE html>
<html lang="en">
<head>

  <title>Savings Calculation</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="keywords" content="Savings, Income, I want to save, How to save">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
      font-family: Arial, Helvetica, sans-serif;
  }

  /* Full-width input fields
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

/* Extra styles for the cancel button
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

/* Center the image and position the close button
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* The Modal (background) */

/*.modal {
    display: none; /* Hidden by default
    position: fixed; /* Stay in place
    z-index: 1; /* Sit on top
    left: 0;
    top: 0;
    width: 100%; /* Full width
    height: 100%; /* Full height
    overflow: auto; /* Enable scroll if needed
    background-color: rgb(0,0,0); /* Fallback color
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity
    padding-top: 60px;
}

/* Modal Content/Box
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered
    border: 1px solid #888;
    width: 80%; /* Could be more or less, depending on screen size
}

/* The Close Button (x)
.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}

/* Add Zoom Animation
.animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)}
    to {-webkit-transform: scale(1)}
}

@keyframes animatezoom {
    from {transform: scale(0)}
    to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}*/

  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }


  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(90%); /* make all photos black and white */
      width: 100%;
      height: 40%;
      /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;

  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
      /*position: fixed;*/
  }
  .navbar li a, .navbar .navbar-brand {
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;

  }
  .dropdown-menu li a:hover {
      background-color: red !important;

  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #f5f5f5;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <!--<a class="navbar-brand" href="#myPage">Login</a>-->
      <!--<a class="navbar-brand" href="#" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Sign in</a> -->
      <button class="btn" id="signOut">Sign Out</button>
    </div>

 <!--<div id="id01" class="modal">

  <form class="modal-content animate" action="/action_page.php">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="img_avatar2.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>

      <button type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>-->
<!--<div class="navbar navbar-inverse navbar-fixed-top" id="myNavbar">-->
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right" style="margin-bottom:5%">
        <li><a href="#myPage">HOME</a></li>
        <li><a href="#about">ABOUT</a></li>
        <li><a href="#profile">PROFILE</a></li>
        <li><a href="#income">INCOME</a></li>
        <li><a href="#expenses">EXPENSES</a></li>

        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">GOALS
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#STG">Short Term Goals</a></li>
            <li><a href="#LTG">Long Term Goals</a></li>
          </ul>
        </li>
        <!-- <li><a href="#contact">CONTACT</a></li> -->
        <li><a href="#investment">INVESTMENT</a></li>
      </ul>
    </div>
  </div>
</nav>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="savings.jpg" alt="Savings" width="1200" height="700">
        <div class="carousel-caption">
          <h2 style="font-size:60px;">Savings</h3>
          <p style="font-size:160%;">It's not about how much money you make but how you save it.</p>
        </div>
      </div>

      <div class="item">
        <img src="/images/Invest_Savings-e1474541012438.png" alt="Goals" width="1200" height="700">
        <div class="carousel-caption">
          <h2 style="font-size:60px;">Set Goals</h3>
          <p style="font-size:140%;">The safe way to double your money is to fold it over once and put it in your pocket.</p>
        </div>
      </div>

      <div class="item">
        <img src="savingsjars.jpg" alt="Track of Expenses" width="1200" height="700">
        <div class="carousel-caption">
          <h2 style="font-size:60px;">Expenses</h3>
          <p style="font-size:160%;">Keep track of your expenses in order to save for emergency</p>
        </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>


<!-- Container (The About Section) -->
<div id="about" class="container text-center">
  <h3>Savings Database Calculation</h3>
  <p><em>If money saving is wrong then I don't want to be right!</em></p>
  <p>We have created a Savings Calculation website. The objective of the website is to calculate your savings on the basis of your income and keep track of your savings. It also helps in storing of personal details which can be accessed by the financial
advisor. You can use it to set Long term and Short term goals. The user friendly website helps in keeping a track of income, expenses and goals and helps you save money and PLAY BIG! </p>
  <br>
  <div class="row">
    <hr style="margin-left:10px;" />
    <div class="col-sm-4">
      <p class="text-center"><strong>Aashay Jain</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="aashay.jpg" class="img-circle person" alt="Aashay Jain" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>SE-IT </p>
        <p>Roll No. 19</p>
        <p>Born in 1998</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>Anukrit Jain</strong></p><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="anukrit.jpeg" class="img-circle person" alt="Anukrit Jain" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>SE-IT</p>
        <p>Roll No. 20</p>
        <p>Born in 1998</p>
      </div>
    </div>

    <div class="col-sm-4">
      <p class="text-center"><strong>S.P.I.T</strong></p><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="spit.jpg" class="img-circle person" alt="SPIT " width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>Best College</p>
        <p>Best Project</p>
        <p>Best Engineers since 2005</p>
      </div>
    </div>
  </div>
</div>

<!-- Container (Profile Section) -->
<div id="profile" class="bg-1">
  <div class="container">
    <fieldset>
    <legend><h3 class="text-center">My Profile</h3></legend>
    <p class="text-center">I have decided to save some money.</p>
    <ul class="list-group">
      <li class="list-group-item" id="name">Name</li>
      <li class="list-group-item" id="DOB">Date of Birth</li>
      <li class="list-group-item" id="age">Age</li>
      <li class="list-group-item" id="gender">Gender</li>
      <li class="list-group-item" id="category">Category</li>
      <li class="list-group-item" id="occupation">Occupation</li>

    </ul>
  </fieldset>

  <!--  <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="paris.jpg" alt="Paris" width="400" height="300">
          <p><strong>Paris</strong></p>
          <p>Friday 27 November 2015</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">Buy Tickets</button>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="newyork.jpg" alt="New York" width="400" height="300">
          <p><strong>New York</strong></p>
          <p>Saturday 28 November 2015</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">Buy Tickets</button>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="sanfran.jpg" alt="San Francisco" width="400" height="300">
          <p><strong>San Francisco</strong></p>
          <p>Sunday 29 November 2015</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">Buy Tickets</button>
        </div>
      </div>
    </div>-->
  </div>


<!-- Container (Income Section) -->
<div id="income" class="bg-1">
  <fieldset>
    <div class="container">

      <legend style="border-color:white;color:white"><h3 class="text-center" onclick="getIncome()">Income Details</h3></legend>
      <!--<p class="text-center">I have decided to save some money.</p>-->
      <div class="modal-body">
        <form role="form">
          <div class="form-group">
            <label for="userId"> User Id </label>
            <input type="number" class="form-control" id="userId" placeholder="Enter User Id">
          </div>

          <div class="form-group">
            <label for="sourcefIncome"> Source Of Income </label>
            <input type="text" class="form-control" id="sourcefIncome" placeholder="Enter Source of Income">
          </div>

          <div class="form-group">
            <label for="income">Income</label>
            <input type="number" class="form-control" id="income" placeholder="Enter Income">
          </div>

          <div class="form-group">
            <label for="tax">Tax</label>
            <input type="number" class="form-control" id="tax" placeholder="Enter Tax in %">
          </div>

        <!--<div class="form-group">
            <label for="inHand">In-Hand Amount</label>
            <input type="number" class="form-control" id="inHand" placeholder="Get From database">
          </div>-->
          <br/>
            <button onclick="getLatestApi()" class="btn btn-round btn-primary" style="background-color:blue;color:white;margin-left:40%">Submit
            </button>
        </form>
        <br/><br/>
        <table width="100%" border="1" cell-padding="10px" style="border-color:white;" >
          <thead class="text-center" id="incomeTable">
            <tr>

			<th style="text-align:center;">UserID</th>
            <th style="text-align:center;">Source of Income</th>
            <th style="text-align:center;">Income</th>
            <th style="text-align:center;">Tax (in %)</th>
            <th style="text-align:center;">In-Hand Cash</th>
          </tr>
          </thead>
          <tbody>

          </tbody>
        </table>
      </div>

</div>
</fieldset>
</div>

<!-- Container (Expenses Section) -->
<div id="expenses" class="bg-1">
    <fieldset>
    <div class="container">
      <legend style="border-color:white;color:white"><h3 class="text-center" onclick="getExpense()">My Expenses</h3></legend>
      <br/><br/>
      <div class="modal-body">
      <form role="form">
        <div class="form-group">
          <label for="userId"> User Id </label>
          <input type="number" class="form-control" id="userId" placeholder="Enter User Id">
        </div>
        <div class="form-group">
          <label for="product"> Product </label>
          <input type="text" class="form-control" id="product" placeholder="Enter the Product Name">
        </div>

        <div class="form-group">
          <label for="price">Price</label>
          <input type="number" class="form-control" id="price" placeholder="Enter Price of the Product">
        </div>

        <div class="form-group">
          <label for="quantity">Quantity</label>
          <input type="number" class="form-control" id="quantity" placeholder="Enter Quantity">
        </div>

      <!--<div class="form-group">
          <label for="inHand">In-Hand Amount</label>
          <input type="number" class="form-control" id="inHand" placeholder="Get From database">
        </div>-->
        <br/>
          <button type="submit" class="btn btn-round btn-primary" style="background-color:blue;color:white;margin-left:40%">Submit
          </button>
      </form>
      <br/><br/>
      <table width="100%" border="1" cell-padding="10px" style="border-color:white;">
        <thead class="text-center" id="expenseTable">
          <tr>
          <th style="text-align:center;">User ID</th>
          <th style="text-align:center;">Date</th>
          <th style="text-align:center;">Product</th>
          <th style="text-align:center;">Price</th>
          <th style="text-align:center;">Quantity</th>
          <th style="text-align:center;">Total Amount</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
    </div>
      <!--<p class="text-center">I have decided to save some money.</p>-->

</div>
</fieldset>
</div>

<!-- Container (Long term goals Section) -->
<div id="LTG" class="bg-1">
    <fieldset>
    <div class="container">
      <legend style="border-color:white;color:white"><h3 class="text-center" onclick="getLongTerm()">Long Term Goals</h3></legend>
      <p class="text-center">Do not leave yourself or your family unprotected against financial storms... Build up savings. </p>
      <p class="text-center">Save now, Enjoy later. </p>
      <br/><br/>
      <table width="100%" border="1" cell-padding="10px" style="border-color:white;">
        <thead class="text-center" id="longTermTable">
          <tr>
            <th style="text-align:center;">User ID</th>
          <th style="text-align:center;">Month</th>
          <th style="text-align:center;">Purpose</th>
          <th style="text-align:center;">Percentage of Income</th>
          <th style="text-align:center;">Amount required</th>
          <th style="text-align:center;">Amount saved</th>
          <th style="text-align:center;">Savings Deficit</th>
        </tr>
        <tr>
        <td>erYdWHAJ</td>
        <td>April, 2018</td>
        <td>Retirement</td>
        <td>10</td>
        <td>1738</td>
        <td>1738</td>
        <td>0</td>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
      <!--<p class="text-center">I have decided to save some money.</p>-->

</div>
</fieldset>
</div>

<!-- Container (Short term goals Section) -->
<div id="STG" class="bg-1">
    <fieldset>
    <div class="container">
      <legend style="border-color:white;color:white"><h3 class="text-center">Short Term Goals</h3></legend>
      <p class="text-center">Set goals that you plan to achieve within a year. </p>
      <p class="text-center">A goal without a plan is just a wish. </p>
      <br/><br/>
      <div class="modal-body">
      <form role="form">
        <div class="form-group">
          <label for="userId"> User Id </label>
          <input type="number" class="form-control" id="userId" placeholder="Enter User Id">
        </div>
        <div class="form-group">
          <label for="goal"> Goal </label>
          <input type="text" class="form-control" id="goal" placeholder="Enter your Goal (Ex:Product you want to buy, events you want to save for,etc)">
        </div>

        <div class="form-group">
          <label for="amountRequired">Amount Required</label>
          <input type="number" class="form-control" id="amountRequired" placeholder="Enter Amount Required for the Goal">
        </div>

        <div class="form-group">
          <label for="quantity">Goal fulfillment period</label>
          <input type="number" class="form-control" id="quantity" placeholder="Enter the number of months in which you need to achieve the goal">
        </div>

      <!--<div class="form-group">
          <label for="inHand">In-Hand Amount</label>
          <input type="number" class="form-control" id="inHand" placeholder="Get From database">
        </div>-->
        <br/>
          <button type="submit" class="btn btn-round btn-primary" style="background-color:blue;color:white;margin-left:40%">Submit
          </button>
      </form>
      <br/><br/>
      <table width="100%" border="1" cell-padding="10px" style="border-color:white;">
        <thead class="text-center">
          <tr>

          <th style="text-align:center;">Month</th>
          <th style="text-align:center;">Goal</th>
          <th style="text-align:center;">Amount </br>Required</th>
          <th style="text-align:center;">Goal Fulfillment</br> Period</th>
          <th style="text-align:center;">Estimate </br>Savings(monthly)</th>
          <th style="text-align:center;">Your savings</th>
          <th style="text-align:center;">Savings Deficit</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
      <!--<p class="text-center">I have decided to save some money.</p>-->
    </div>
</div>
</fieldset>
</div>

<!-- Container (Short term goals Section) -->
<div id="investment" class="bg-1">
    <fieldset>
    <div class="container">
      <legend style="border-color:white;color:white"><h3 class="text-center">Investments</h3></legend>
      <p class="text-center">Never depend on a single income. Make investment to create a second source. </p>

      <br/><br/>
      <table width="100%" border="1" cell-padding="10px" style="border-color:white;">
        <thead class="text-center">
          <tr>
            <th style="text-align:center;">User ID</th>
          <th style="text-align:center;">Month</th>
          <th style="text-align:center;">Amount left</th>
          <th style="text-align:center;">Estimate amount in Mutual funds</th>
          <th style="text-align:center;">Estimate amount in Stocks</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
      <!--<p class="text-center">I have decided to save some money.</p>-->

</div>

</fieldset>
</div>

<!-- Container (Contact Section)
<div id="contact" class="container">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>We love our fans!</em></p>

  <div class="row">
    <div class="col-md-4">
      <p>Fan? Drop a note.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Chicago, US</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +00 1515151515</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: mail@mail.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  <br>
  <h3 class="text-center">From The Blog</h3>
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Mike</a></li>
    <li><a data-toggle="tab" href="#menu1">Chandler</a></li>
    <li><a data-toggle="tab" href="#menu2">Peter</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h2>Mike Ross, Manager</h2>
      <p>Man, we've been on the road for some time now. Looking forward to lorem ipsum.</p>
    </div>
    <div id="menu1" class="tab-pane fade">
      <h2>Chandler Bing, Guitarist</h2>
      <p>Always a pleasure people! Hope you enjoyed it as much as I did. Could I BE.. any more pleased?</p>
    </div>
    <div id="menu2" class="tab-pane fade">
      <h2>Peter Griffin, Bass player</h2>
      <p>I mean, sometimes I enjoy the show, but other times I enjoy other things.</p>
    </div>
  </div>
</div>-->

<!-- Add Google Maps
<div id="googleMap"></div>
<script>
function myMap() {
var myCenter = new google.maps.LatLng(41.878114, -87.629798);
var mapProp = {center:myCenter, zoom:12, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({position:myCenter});
marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>-->
<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
  <p>Website Made By Anukrit and Aashay</p>
</footer>

<script>

// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

$(document).ready(function(){
  // Initialize Tooltip
  $('[data-toggle="tooltip"]').tooltip();

  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {

      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){

        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
})
</script>
<script type="text/javascript">
    function getIncome()
    {
     fetch("http://localhost:8080/SavingsCalc/webapi/user/erYdWHAJ/income").then(function(res){
        return res.json();
      }).then(function(data) {
        getIncomeTable(data);
      });
    }
    function getExpense()
    {
     fetch("http://localhost:8080/SavingsCalc/webapi/user/erYdWHAJ/expense").then(function(res){
        return res.json();
      }).then(function(data) {
        getExpenseTable(data);
      });
    }
    function getLongTerm()
    {
    	var x="";
    	x+="<tr><td>"+erYdWHAJ+"</td>";
    	x+="<td>"+April+"</td>";
    	x+="<td>"+Retirement+"</td>";
    	x+="<td>"+10+"</td>";
    	x+="<td>"+488+"</td>";
    	x+="<td>"+488+"</td>";
    	x+="<td>"+0+"</td></tr>";
    	document.getElementById("longTermTable").innerHTML+=x;
    }
    function getIncomeTable(data)
    {
      console.log(data);
      var x="";
      for(i in data)
      {
    	x+="<tr><td>"+data[i].uid+"</td>";
        x+="<td>"+data[i].source+"</td>";
        x+="<td>"+data[i].income+"</td>";
        x+="<td>"+data[i].tax+"</td>";
        x+="<td>"+data[i].inHand+"</td></tr>";
      }
      document.getElementById("incomeTable").innerHTML+=x;
      
    }
    function getExpenseTable(data)
    {
      console.log(data);
      var x="";
      for(i in data)
      {
        x+="<tr><td>"+data[i].uid+"</td>";
        x+="<td>"+data[i].date+"</td>";
        x+="<td>"+data[i].product+"</td>";
        x+="<td>"+data[i].price+"</td>";
        x+="<td>"+data[i].quantity+"</td>";
        x+="<td>"+data[i].amount+"</td></tr>";
      }
      document.getElementById("expenseTable").innerHTML+=x;
      
    }
    
    </script>

</body>
</html>
