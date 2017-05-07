(function(angular) {
  var ContactFactory = function($resource) {
    return $resource('/contacts/:id', {id: '@id'}, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  ContactFactory.$inject = ['$resource'];
  angular.module("SpringApp.services").factory("Contact", ContactFactory);
}(angular));

