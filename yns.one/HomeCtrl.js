'use strict';
app.controller('HomeCtrl', function ( $scope, $location, $http ) {
  console.log("Home Controller reporting for duty.");
  
  var i = getURLParameter("i");

   $location.url("/"+i);
  
  function getURLParameter(name) {
  return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search)||[,""])[1].replace(/\+/g, '%20'))||null
   }
  
});