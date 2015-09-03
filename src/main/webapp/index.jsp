<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Hotelinho</title>
    <link rel="stylesheet" href="css/main.css">
  </head>
  <body>
    <section class="top-header">
      <div class="container">
        <div class="row">
          <div class="col-xs-6">
            <h1 class="top-header__logo">Hotelinho.ro</h1>
          </div>
          <ul class="top-header__account-area col-xs-6">
            <li><a href="#">My Account</a></li>
            <li><a href="#" data-toggle=".top-header__login-popup">Login</a>
              <div class="top-header__login-popup">
                <form method="post" action="http://localhost:8090/hotelinhoServices/users/login">
                  <div class="form-group">
                    <label for="username" class="font__secondary font__size--xs">Email address</label>
                    <input id="username" name="username" type="email" placeholder="Email address" class="form-control">
                  </div>
                  <div class="form-group">
                    <label for="password" class="font__secondary font__size--xs">Password</label>
                    <input id="password" name="password" type="password" placeholder="Password" class="form-control">
                  </div><a href="#" class="pull-left font__size--xs">Forgot password?</a>
                  <button type="submit" class="btn btn__primary pull-right">Login</button><a href="#" class="pull-left font__size--xs clear--l">Create account...</a>
                </form>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </section>
  </body>
</html>
<section class="homepage-main-banner">
  <div class="container">
    <h1 class="font__size--medium font__primary--thin color__text--light">You're going on holiday and you need a hotel?</h1>
    <h2 class="font__size--xxl font__primary--bold color__secondary--cold">Look no further!</h2>
    <div class="row">
      <p class="col-xs-9 font__size--r color__text--light">Hotelinho.ro offers enormously low prices for up to 10.000 hotels across Romania and the sorrounding areas.<br>Join now and get a<span class="color__secondary--warm"> 10% discount on your reservation!</span></p>
      <div class="col-xs-3"><a href="#" class="browse-all btn btn--l btn__default--light pull-right">Browse all hotels</a></div>
    </div>
    <div class="text-center font__size--s color__text--dark info-search-text">or search for your favourite ones below</div>
  </div>
  <div class="homepage-main-banner__search-banner">
    <div class="container">
      <form action="#" method="GET">
        <input type="text" placeholder="Search through hundreds of hotels" name="search" class="search-input font__primary--thin color__text--dark font__size--xxl">
        <input type="submit" value="" class="search-submit">
      </form>
    </div>
  </div>
  <div class="container">
    <div class="text-center font__size--m color__text--dark font__primary--light info-map-text">checkout our hotel map below</div><img id="scroll-to-map" src="
    icons/down-arrow-large.png" class="center-block">
  </div>
</section>
<section class="homepage-map">
  <div class="homepage-map__banner font__primary--light font__size--l color__primary text-center">Find the most vizited hotels in your area of travel</div>
  <div id="map-canvas"></div>
</section>
<section class="hotel-details-popup">
  <div class="hotel-details-popup__close">+</div>
  <div class="container">
    <div class="row">
      <div class="hotel-details__marker col-xs-1"><img src="icons/hotel-marker-large.png" title="Dummy title"></div>
      <div class="hotel-details__header col-xs-11">
        <h1 class="hotel-details__title color__primary font__primary--thin font__size--xxl">Dummy title</h1>
        <div class="stars--large pull-left"></div>
        <h2 class="hotel-details__address font__primary--light font__size--v">Dummy address, Cluj-Napoca</h2>
      </div>
    </div>
    <div class="row">
      <div class="hotel-details__image col-xs-12"></div>
    </div>
    <div class="row">
      <div class="hotel-details__description col-xs-12"></div>
    </div>
    <div class="row">
      <div class="hotel-details__facilities col-xs-12"></div>
    </div>
    <div class="row">
      <div class="hotel-details__travel-dates col-xs-12">
        <h3 class="font__primary--light color__primary font__size--l">Select your travel dates</h3>
        <form action="#" method="GET" class="form-inline">
          <input type="hidden" name="hotelId" value="mock">
          <div class="form-group">
            <label for="startDate">From</label>
            <input id="startDate" name="startDate" type="date" placeholder="Starting date" required class="input--l">
          </div>
          <div class="form-group">
            <label for="endDate">To</label>
            <input id="endDate" name="endDate" type="date" placeholder="Ending date" required class="input--l">
          </div>
          <button type="submit" class="btn btn--l btn__primary">Get available rooms</button>
        </form>
      </div>
    </div>
  </div>
  <div class="hotel-details__rooms">
    <div class="container">
      <h3 class="font__primary--light color__primary font__size--l">See the available rooms for your dates</h3>
      <p class="error font__secondary"><span class="glyphicon glyphicon-alert"></span>You have to select your travel dates before you can see the available rooms for this hotel</p>
    </div>
  </div>
</section>
<footer>
  <p class="text-center font__primary--medium font__size--s">Coded with&nbsp;<span class="glyphicon glyphicon-heart color__error"></span>&nbsp;from Cluj-Napoca, UBB, 2015</p>
</footer>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAbnb7yFZTA9df-DxSTlVvnmNPkK-kctk&amp;libraries=places"></script>
<script src="js/app.js"></script>