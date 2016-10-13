'use strict';
app.config(['$routeProvider','$locationProvider', function ($routeProvider,$locationProvider) {
 
	
  $routeProvider
    // Home
    .when("/", {templateUrl: "SurveyTemplates/home.html", controller: "HomeCtrl"})
    // Pages
    //with params
    
    
	 /* Template for Customer Type 4 WeCare */ 
	.when("/U/:SmsCustomerID", {templateUrl: "SurveyTemplates/unsub.html", controller: "UnsubCtrl"})
	.when("/T/C4E", {templateUrl: "SurveyTemplates/YN_WC4ETY.html", controller: "HomeCtrl"})
	.when("/T/C4M", {templateUrl: "SurveyTemplates/YN_WC4ETY.html", controller: "HomeCtrl"})
	.when("/T/C4C", {templateUrl: "SurveyTemplates/YN_WC4ETY.html", controller: "HomeCtrl"})
    .when("/C4E/:SmsCustomerID", {templateUrl: "SurveyTemplates/YN_WC4E.html", controller: "SurveyCtrl"})	
	.when("/C4M/:SmsCustomerID", {templateUrl: "SurveyTemplates/YN_WC4M.html", controller: "SurveyCtrl"})
	.when("/C4C/:SmsCustomerID", {templateUrl: "SurveyTemplates/YN_WC4C.html", controller: "SurveyCtrl"})
    
	.when("/:param", {templateUrl: "SurveyTemplates/YN_WC4E.html", controller: "PageCtrl"})
	
	//.when("/cType2M/:custID", {templateUrl: "SurveyTemplates/YN_C2M.html", controller: "SurveyCtrl"})
    .otherwise("/404", {templateUrl: "SurveyTemplates/YN_S1C2E.html", controller: "PageCtrl"});
  
   $locationProvider.html5Mode(true);
	
}]);