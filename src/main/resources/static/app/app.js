(function(angular) {
  angular.module("SpringApp.controllers", []);
  angular.module("SpringApp.services", []);
  angular.module("SpringApp", ["ngRoute","ngResource","SpringApp.controllers","SpringApp.services"]);
}(angular));