<!DOCTYPE HTML>
<%@page import="com.amc.main.entity.JobEntity"%>
<html>
<head>
<title>Novus Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Basic Forms :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Novus Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- font CSS -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
 <!-- js-->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
<!--//webfonts--> 
<!--animate-->
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="js/wow.min.js"></script>
	<script>
		 new WOW().init();
	</script>
<!--//end-animate-->
<!-- Metis Menu -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<link href="css/custom.css" rel="stylesheet">
<!--//Metis Menu -->
</head> 
<body class="cbp-spmenu-push">
<%

JobEntity entity = (JobEntity)request.getAttribute("job_value");

%>

	<div class="main-content">
		<!--left-fixed -navigation-->
		<%@ include file="side.jsp" %>
		
		<!-- <div class=" sidebar" role="navigation">
            <div class="navbar-collapse">
				<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
					<ul class="nav" id="side-menu">
						<li>
							<a href="index.html"><i class="fa fa-home nav_icon"></i>Dashboard</a>
						</li>
						<li>
							<a href="#"><i class="fa fa-cogs nav_icon"></i>Components <span class="nav-badge">12</span> <span class="fa arrow"></span></a>
							<ul class="nav nav-second-level collapse">
								<li>
									<a href="grids.html">Grid System</a>
								</li>
								<li>
									<a href="media.html">Media Objects</a>
								</li>
							</ul>
							/nav-second-level
						</li>
						<li class="">
							<a href="#"><i class="fa fa-book nav_icon"></i>UI Elements <span class="fa arrow"></span></a>
							<ul class="nav nav-second-level collapse">
								<li>
									<a href="general.html">General<span class="nav-badge-btm">08</span></a>
								</li>
								<li>
									<a href="typography.html">Typography</a>
								</li>
							</ul>
							/nav-second-level
						</li>
						<li>
							<a href="widgets.html"><i class="fa fa-th-large nav_icon"></i>Widgets <span class="nav-badge-btm">08</span></a>
						</li>
						<li>
							<a href="#"><i class="fa fa-envelope nav_icon"></i>Mailbox<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level collapse">
								<li>
									<a href="inbox.html">Inbox <span class="nav-badge-btm">05</span></a>
								</li>
								<li>
									<a href="compose.html">Compose email</a>
								</li>
							</ul>
							//nav-second-level
						</li>
						<li>
							<a href="tables.html"><i class="fa fa-table nav_icon"></i>Tables <span class="nav-badge">05</span></a>
						</li>
						<li>
							<a href="#"><i class="fa fa-check-square-o nav_icon"></i>Forms<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level collapse">
								<li>
									<a href="forms.html">Basic Forms <span class="nav-badge-btm">07</span></a>
								</li>
								<li>
									<a href="validation.html">Validation</a>
								</li>
							</ul>
							//nav-second-level
						</li>
						<li>
							<a href="#"><i class="fa fa-file-text-o nav_icon"></i>Pages<span class="nav-badge-btm">02</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level collapse">
								<li>
									<a href="login.html">Login</a>
								</li>
								<li>
									<a href="signup.html">SignUp</a>
								</li>
								<li>
									<a href="blank-page.html">Blank Page</a>
								</li>
							</ul>
							//nav-second-level
						</li>
						<li>
							<a href="charts.html" class="chart-nav"><i class="fa fa-bar-chart nav_icon"></i>Charts <span class="nav-badge-btm pull-right">new</span></a>
						</li>
					</ul>
					<div class="clearfix"> </div>
					//sidebar-collapse
				</nav>
			</div>
		</div> -->
		<!--left-fixed -navigation-->
		<!-- header-starts -->
		
		<%@include file="header.jsp" %>
		
		
		<!-- <div class="sticky-header header-section ">
			<div class="header-left">
				toggle button start
				<button id="showLeftPush"><i class="fa fa-bars"></i></button>
				toggle button end
				logo
				<div class="logo">
					<a href="index.html">
						<h1>NOVUS</h1>
						<span>AdminPanel</span>
					</a>
				</div>
				//logo
				search-box
				<div class="search-box">
					<form class="input">
						<input class="sb-search-input input__field--madoka" placeholder="Search..." type="search" id="input-31" />
						<label class="input__label" for="input-31">
							<svg class="graphic" width="100%" height="100%" viewBox="0 0 404 77" preserveAspectRatio="none">
								<path d="m0,0l404,0l0,77l-404,0l0,-77z"/>
							</svg>
						</label>
					</form>
				</div>//end-search-box
				<div class="clearfix"> </div>
			</div>
			<div class="header-right">
				<div class="profile_details_left">notifications of menu start
					<ul class="nofitications-dropdown">
						<li class="dropdown head-dpdn">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope"></i><span class="badge">3</span></a>
							<ul class="dropdown-menu">
								<li>
									<div class="notification_header">
										<h3>You have 3 new messages</h3>
									</div>
								</li>
								<li><a href="#">
								   <div class="user_img"><img src="images/1.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p><span>1 hour ago</span></p>
									</div>
								   <div class="clearfix"></div>	
								</a></li>
								<li class="odd"><a href="#">
									<div class="user_img"><img src="images/2.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet </p>
									<p><span>1 hour ago</span></p>
									</div>
								  <div class="clearfix"></div>	
								</a></li>
								<li><a href="#">
								   <div class="user_img"><img src="images/3.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet </p>
									<p><span>1 hour ago</span></p>
									</div>
								   <div class="clearfix"></div>	
								</a></li>
								<li>
									<div class="notification_bottom">
										<a href="#">See all messages</a>
									</div> 
								</li>
							</ul>
						</li>
						<li class="dropdown head-dpdn">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-bell"></i><span class="badge blue">3</span></a>
							<ul class="dropdown-menu">
								<li>
									<div class="notification_header">
										<h3>You have 3 new notification</h3>
									</div>
								</li>
								<li><a href="#">
									<div class="user_img"><img src="images/2.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p><span>1 hour ago</span></p>
									</div>
								  <div class="clearfix"></div>	
								 </a></li>
								 <li class="odd"><a href="#">
									<div class="user_img"><img src="images/1.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet </p>
									<p><span>1 hour ago</span></p>
									</div>
								   <div class="clearfix"></div>	
								 </a></li>
								 <li><a href="#">
									<div class="user_img"><img src="images/3.png" alt=""></div>
								   <div class="notification_desc">
									<p>Lorem ipsum dolor amet </p>
									<p><span>1 hour ago</span></p>
									</div>
								   <div class="clearfix"></div>	
								 </a></li>
								 <li>
									<div class="notification_bottom">
										<a href="#">See all notifications</a>
									</div> 
								</li>
							</ul>
						</li>	
						<li class="dropdown head-dpdn">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i><span class="badge blue1">15</span></a>
							<ul class="dropdown-menu">
								<li>
									<div class="notification_header">
										<h3>You have 8 pending task</h3>
									</div>
								</li>
								<li><a href="#">
									<div class="task-info">
										<span class="task-desc">Database update</span><span class="percentage">40%</span>
										<div class="clearfix"></div>	
									</div>
									<div class="progress progress-striped active">
										<div class="bar yellow" style="width:40%;"></div>
									</div>
								</a></li>
								<li><a href="#">
									<div class="task-info">
										<span class="task-desc">Dashboard done</span><span class="percentage">90%</span>
									   <div class="clearfix"></div>	
									</div>
									<div class="progress progress-striped active">
										 <div class="bar green" style="width:90%;"></div>
									</div>
								</a></li>
								<li><a href="#">
									<div class="task-info">
										<span class="task-desc">Mobile App</span><span class="percentage">33%</span>
										<div class="clearfix"></div>	
									</div>
								   <div class="progress progress-striped active">
										 <div class="bar red" style="width: 33%;"></div>
									</div>
								</a></li>
								<li><a href="#">
									<div class="task-info">
										<span class="task-desc">Issues fixed</span><span class="percentage">80%</span>
									   <div class="clearfix"></div>	
									</div>
									<div class="progress progress-striped active">
										 <div class="bar  blue" style="width: 80%;"></div>
									</div>
								</a></li>
								<li>
									<div class="notification_bottom">
										<a href="#">See all pending tasks</a>
									</div> 
								</li>
							</ul>
						</li>	
					</ul>
					<div class="clearfix"> </div>
				</div>
				notification menu end
				<div class="profile_details">		
					<ul>
						<li class="dropdown profile_details_drop">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
								<div class="profile_img">	
									<span class="prfil-img"><img src="images/a.png" alt=""> </span> 
									<div class="user-name">
										<p>Wikolia</p>
										<span>Administrator</span>
									</div>
									<i class="fa fa-angle-down lnr"></i>
									<i class="fa fa-angle-up lnr"></i>
									<div class="clearfix"></div>	
								</div>	
							</a>
							<ul class="dropdown-menu drp-mnu">
								<li> <a href="#"><i class="fa fa-cog"></i> Settings</a> </li> 
								<li> <a href="#"><i class="fa fa-user"></i> Profile</a> </li> 
								<li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
							</ul>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>	
			</div>
			<div class="clearfix"> </div>	
		</div> -->
		<!-- //header-ends -->
		<!-- main content start-->
		<div id="page-wrapper">
			<div class="main-page">
				<div class="forms">
					<h3 class="title1">Job Details</h3>
					<div class="form-grids row widget-shadow" data-example-id="basic-forms"> 
						<div class="form-title">
							<h4>Update Job :</h4>
							<h3 class="title1">${message}</h3>
							<%
							session.setAttribute("message", "");
							%>
						</div>
						<div class="form-body">
							<form action="UpdateJob" method="post">
									<div class="form-group"> <label for="exampleInputEmail1">Job Id</label> 
									<input  type="text" disabled="disabled" name="job_view" class="form-control" id="job_view" value="<%=entity.getJob_id()%>"> 
									<input  type="hidden" name="job_id" class="form-control" id="job_id" value="<%=entity.getJob_id()%>"> 
									
									</div> 
									<div class="form-group"> <label for="exampleInputEmail1">Job Name</label> <input required="required" type="text" name="job_name" class="form-control" value="<%=entity.getJob_name() %>" id="exampleInputEmail1" placeholder="Email"> </div> 
									<div class="form-group"> <label for="exampleInputEmail1">Job Description</label> <input required="required" type="text" name="job_description" class="form-control" value="<%=entity.getJob_description() %>" id="exampleInputEmail1" placeholder="Email"> </div> 
									<div class="form-group"> <label for="exampleInputEmail1">Job Name</label> <input required="required" type="text" name="job_start_date" class="form-control" value="<%=entity.getJob_start_date() %>" id="exampleInputEmail1" placeholder="Email"> </div> 
									<div class="form-group"> <label for="exampleInputEmail1">Job Name</label> <input required="required" type="text" name="job_end_date" class="form-control" value="<%=entity.getJob_end_date() %>" id="exampleInputEmail1" placeholder="Email"> </div> 
									<div class="form-group"> <label for="exampleInputEmail1">Job Status</label> <select name="job_status" id="selector1" class="form-control1">
												<option value="Open">Open</option>
												</select> </div>
									  
									  <button type="submit" class="btn btn-default">Update</button> 
									  </form> 
						</div>
					</div>
					<!-- <div class=" form-grids row form-grids-right">
						<div class="widget-shadow " data-example-id="basic-forms"> 
							<div class="form-title">
								<h4>Horizontal form :</h4>
							</div>
							<div class="form-body">
								<form class="form-horizontal"> <div class="form-group"> <label for="inputEmail3" class="col-sm-2 control-label">Email</label> <div class="col-sm-9"> <input type="email" class="form-control" id="inputEmail3" placeholder="Email"> </div> </div> <div class="form-group"> <label for="inputPassword3" class="col-sm-2 control-label">Password</label> <div class="col-sm-9"> <input type="password" class="form-control" id="inputPassword3" placeholder="Password"> </div> </div> <div class="form-group"> <div class="col-sm-offset-2 col-sm-10"> <div class="checkbox"> <label> <input type="checkbox"> Remember me </label> </div> </div> </div> <div class="col-sm-offset-2"> <button type="submit" class="btn btn-default">Sign in</button> </div> </form> 
							</div>
						</div>
					</div> -->
					<!-- <div class="inline-form widget-shadow">
						<div class="form-title">
							<h4>Inline form Example 1 :</h4>
						</div>
						<div class="form-body">
							<div data-example-id="simple-form-inline"> <form class="form-inline"> <div class="form-group"> <input type="email" class="form-control" id="exampleInputEmail3" placeholder="Email"> </div> <div class="form-group"> <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password"> </div> <div class="checkbox"> <label> <input type="checkbox"> Remember me </label> </div> <button type="submit" class="btn btn-default">Sign in</button> </form> </div>
						</div>
					</div> -->
					<!-- <div class="form-two widget-shadow">
						<div class="form-title">
							<h4>Inline form Example 2 :</h4>
						</div>
						<div class="form-body" data-example-id="simple-form-inline">
							<form class="form-inline"> <div class="form-group"> <label for="exampleInputName2">Name</label> <input type="text" class="form-control" id="exampleInputName2" placeholder="Your name"> </div> <div class="form-group"> <label for="exampleInputEmail2">Email</label> <input type="email" class="form-control" id="exampleInputEmail2" placeholder="mail.abc@example.com"> </div> <button type="submit" class="btn btn-default">Send invitation</button> </form> 
						</div>
					</div> -->
					<!-- <div class="row">
						<h3 class="title1">General Form :</h3>
						<div class="form-three widget-shadow">
							<form class="form-horizontal">
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Focused Input</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" id="focusedinput" placeholder="Default Input">
									</div>
									<div class="col-sm-2">
										<p class="help-block">Your help text!</p>
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">Disabled Input</label>
									<div class="col-sm-8">
										<input disabled="" type="text" class="form-control1" id="disabledinput" placeholder="Disabled Input">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">Password</label>
									<div class="col-sm-8">
										<input type="password" class="form-control1" id="inputPassword" placeholder="Password">
									</div>
								</div>
								<div class="form-group">
									<label for="checkbox" class="col-sm-2 control-label">Checkbox</label>
									<div class="col-sm-8">
										<div class="checkbox-inline1"><label><input type="checkbox"> Unchecked</label></div>
										<div class="checkbox-inline1"><label><input type="checkbox" checked=""> Checked</label></div>
										<div class="checkbox-inline1"><label><input type="checkbox" disabled=""> Disabled Unchecked</label></div>
										<div class="checkbox-inline1"><label><input type="checkbox" disabled="" checked=""> Disabled Checked</label></div>
									</div>
								</div>
								<div class="form-group">
									<label for="checkbox" class="col-sm-2 control-label">Checkbox Inline</label>
									<div class="col-sm-8">
										<div class="checkbox-inline"><label><input type="checkbox"> Unchecked</label></div>
										<div class="checkbox-inline"><label><input type="checkbox" checked=""> Checked</label></div>
										<div class="checkbox-inline"><label><input type="checkbox" disabled=""> Disabled Unchecked</label></div>
										<div class="checkbox-inline"><label><input type="checkbox" disabled="" checked=""> Disabled Checked</label></div>
									</div>
								</div>
								<div class="form-group">
									<label for="selector1" class="col-sm-2 control-label">Dropdown Select</label>
									<div class="col-sm-8"><select name="selector1" id="selector1" class="form-control1">
										<option>Lorem ipsum dolor sit amet.</option>
										<option>Dolore, ab unde modi est!</option>
										<option>Illum, fuga minus sit eaque.</option>
										<option>Consequatur ducimus maiores voluptatum minima.</option>
									</select></div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">Multiple Select</label>
									<div class="col-sm-8">
										<select multiple="" class="form-control1">
											<option>Option 1</option>
											<option>Option 2</option>
											<option>Option 3</option>
											<option>Option 4</option>
											<option>Option 5</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="txtarea1" class="col-sm-2 control-label">Textarea</label>
									<div class="col-sm-8"><textarea name="txtarea1" id="txtarea1" cols="50" rows="4" class="form-control1"></textarea></div>
								</div>
								<div class="form-group">
									<label for="radio" class="col-sm-2 control-label">Radio</label>
									<div class="col-sm-8">
										<div class="radio block"><label><input type="radio"> Unchecked</label></div>
										<div class="radio block"><label><input type="radio" checked=""> Checked</label></div>
										<div class="radio block"><label><input type="radio" disabled=""> Disabled Unchecked</label></div>
										<div class="radio block"><label><input type="radio" disabled="" checked=""> Disabled Checked</label></div>
									</div>
								</div>
								<div class="form-group">
									<label for="radio" class="col-sm-2 control-label">Radio Inline</label>
									<div class="col-sm-8">
										<div class="radio-inline"><label><input type="radio"> Unchecked</label></div>
										<div class="radio-inline"><label><input type="radio" checked=""> Checked</label></div>
										<div class="radio-inline"><label><input type="radio" disabled=""> Disabled Unchecked</label></div>
										<div class="radio-inline"><label><input type="radio" disabled="" checked=""> Disabled Checked</label></div>
									</div>
								</div>
								<div class="form-group">
									<label for="smallinput" class="col-sm-2 control-label label-input-sm">Small Input</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1 input-sm" id="smallinput" placeholder="Small Input">
									</div>
								</div>
								<div class="form-group">
									<label for="mediuminput" class="col-sm-2 control-label">Medium Input</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" id="mediuminput" placeholder="Medium Input">
									</div>
								</div>
								<div class="form-group mb-n">
									<label for="largeinput" class="col-sm-2 control-label label-input-lg">Large Input</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1 input-lg" id="largeinput" placeholder="Large Input">
									</div>
								</div>
							</form>
						</div>
					</div> -->
					<!-- <div class="row">
						<h3 class="title1">Variable Forms :</h3>
						<div class="form-three widget-shadow">
							<div data-example-id="form-validation-states-with-icons"> <form> <div class="form-group has-success has-feedback"> <label class="control-label" for="inputSuccess2">Input with success</label> <input type="text" class="form-control" id="inputSuccess2" aria-describedby="inputSuccess2Status"> <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span> <span id="inputSuccess2Status" class="sr-only">(success)</span> </div> <div class="form-group has-warning has-feedback"> <label class="control-label" for="inputWarning2">Input with warning</label> <input type="text" class="form-control" id="inputWarning2" aria-describedby="inputWarning2Status"> <span class="glyphicon glyphicon-warning-sign form-control-feedback" aria-hidden="true"></span> <span id="inputWarning2Status" class="sr-only">(warning)</span> </div> <div class="form-group has-error has-feedback"> <label class="control-label" for="inputError2">Input with error</label> <input type="text" class="form-control" id="inputError2" aria-describedby="inputError2Status"> <span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span> <span id="inputError2Status" class="sr-only">(error)</span> </div> <div class="form-group has-success has-feedback"> <label class="control-label" for="inputGroupSuccess1">Input group with success</label> <div class="input-group"> <span class="input-group-addon">@</span> <input type="text" class="form-control" id="inputGroupSuccess1" aria-describedby="inputGroupSuccess1Status"> </div> <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span> <span id="inputGroupSuccess1Status" class="sr-only">(success)</span> </div> </form> </div>
						</div>
						<div class="form-three widget-shadow">
							<div class=" panel-body-inputin">
								<form class="form-horizontal">
									<div class="form-group">
										<label class="col-md-2 control-label">Email Address</label>
										<div class="col-md-8">
											<div class="input-group">							
												<span class="input-group-addon">
													<i class="fa fa-envelope-o"></i>
												</span>
												<input type="text" class="form-control1" placeholder="Email Address">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Password</label>
										<div class="col-md-8">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="fa fa-key"></i>
												</span>
												<input type="password" class="form-control1" id="exampleInputPassword1" placeholder="Password">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Email Address</label>
										<div class="col-md-8">
											<div class="input-group input-icon right">
												<span class="input-group-addon">
													<i class="fa fa-envelope-o"></i>
												</span>
												<input id="email" class="form-control1" type="text" placeholder="Email Address">
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">With tooltip</p>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Password</label>
										<div class="col-md-8">
											<div class="input-group input-icon right">
												<span class="input-group-addon">
													<i class="fa fa-key"></i>
												</span>
												<input type="password" class="form-control1" placeholder="Password">
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">With tooltip</p>
										</div>
									</div>
									<div class="form-group has-success">
										<label class="col-md-2 control-label">Input Addon Success</label>
										<div class="col-md-8">
											<div class="input-group input-icon right">
												<span class="input-group-addon">
													<i class="fa fa-envelope-o"></i>
												</span>
												<input id="email" class="form-control1" type="text" placeholder="Email Address">
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">Email is valid!</p>
										</div>
									</div>
									<div class="form-group has-error">
										<label class="col-md-2 control-label">Input Addon Error</label>
										<div class="col-md-8">
											<div class="input-group input-icon right">
												<span class="input-group-addon">
													<i class="fa fa-key"></i>
												</span>
												<input type="password" class="form-control1" placeholder="Password">
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">Error!</p>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Checkbox Addon</label>
										<div class="col-md-8">
											<div class="input-group">
												<div class="input-group-addon"><input type="checkbox"></div>
												<input type="text" class="form-control1">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Checkbox Addon</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" class="form-control1">
												<div class="input-group-addon"><input type="checkbox"></div>
												
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">Checkbox on right</p>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Radio Addon</label>
										<div class="col-md-8">
											<div class="input-group">
												<div class="input-group-addon"><input type="radio"></div>
												<input type="text" class="form-control1">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Radio Addon</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" class="form-control1">
												<div class="input-group-addon"><input type="radio"></div>
												
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">Radio on right</p>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Input Processing</label>
										<div class="col-md-8">
											<div class="input-icon right spinner">
												<i class="fa fa-fw fa-spin fa-spinner"></i>
												<input id="email" class="form-control1" type="text" placeholder="Processing...">
											</div>
										</div>
										<div class="col-sm-2">
											<p class="help-block">Processing right</p>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-2 control-label">Static Paragraph</label>
										<div class="col-md-8">
											<p class="form-control1 m-n">email@example.com</p>
										</div>
									</div>
									<div class="form-group mb-n">
										<label class="col-md-2 control-label">Readonly</label>
										<div class="col-md-8">
											<input type="text" class="form-control1" placeholder="Readonly" readonly="">
										</div>
									</div>
								</form>
							</div>
						</div>
					</div> -->
				</div>
			</div>
		</div>
		<!--footer-->
		<%@include file="footer.jsp" %>
		
		<!-- <div class="footer">
		   <p>&copy; 2016 Novus Admin Panel. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">w3layouts</a></p>
		</div> -->
        <!--//footer-->
	</div>
	<!-- Classie -->
		<script src="js/classie.js"></script>
		<script>
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' ),
				showLeftPush = document.getElementById( 'showLeftPush' ),
				body = document.body;
				
			showLeftPush.onclick = function() {
				classie.toggle( this, 'active' );
				classie.toggle( body, 'cbp-spmenu-push-toright' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeftPush' );
			};
			
			function disableOther( button ) {
				if( button !== 'showLeftPush' ) {
					classie.toggle( showLeftPush, 'disabled' );
				}
			}
		</script>
	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.js"> </script>
</body>
</html>