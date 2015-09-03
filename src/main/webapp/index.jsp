<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Hotelinho</title>
    <link rel="stylesheet" href="css/main.min.css">
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
            <li><a href="#">Login</a></li>
          </ul>
        </div>
      </div>
    </section>
  </body>
</html>
<section class="homepage-main-banner">
  <div class="container">
    <h1 class="font__size--medium font__primary--thin color__text--light">You�re going on holiday and you need a hotel?</h1>
    <h2 class="font__size--xxl font__primary--bold color__secondary--cold">Look no further!</h2>
    <div class="row">
      <p class="col-xs-9 font__size--r color__text--light">Hotelinho.ro offers enormously low prices for up to 10.000 hotels across Romania and the sorrounding areas.<br>Join now and get a<span class="color__secondary--warm"> 10% discount on your reservation!</span></p>
      <div class="col-xs-3"><a href="#" class="browse-all btn btn__l btn__default--light pull-right">Browse all hotels</a></div>
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
    <div class="text-center font__size--m color__text--dark font__primary--light info-map-text">checkout our hotel map below</div><img id="scroll-to-map" src="icons/down-arrow-large.png" class="center-block">
  </div>
</section>
<section class="homepage-map">
  <div class="homepage-map__banner font__primary--light font__size--l color__primary text-center">Find the most vizited hotels in your area of travel</div>
  <div id="map-canvas"></div>
</section>
<section class="hotel-details-popup">
  <div class="container"></div>
  <div class="hotel-details-popup__close">+</div>
</section>
<footer></footer>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAbnb7yFZTA9df-DxSTlVvnmNPkK-kctk&amp;libraries=places"></script>
<script src="js/app.js"></script>