(function(angular) {
  var AppController = function($scope,Contact) {

   Contact.query(function(response) {
      $scope.contacts = response ? response : [];
    });
    
    $scope.addContact = function(contact) {
      new Contact({
        name: contact.name,
        lastname:contact.lastname,
        address:contact.address,
        phone:contact.phone
      }).$save(function(contact) {
        $scope.contacts.push(contact);
        Contact.query(function(response) {
          $scope.contacts = response ? response : [];
        });

      });
      $scope.newContact = "";
    };
    
    $scope.editContact = function(contact){
    	$scope.existingContact = contact;
    }
    
    $scope.updateContact = function(contact) {
      contact.$update({id:contact.idcontact}, contact)
      .then(
    	//sucess
    		  function(success){
    			$scope.messageS = "Datos guardados";
    			  console.log("Datos guardados");
    		  },
    		  //error
    		  function(error){
    			  $('#btnAlert').attr("data-type","error");
				  $('#btnAlert').attr("data-message","Error al guardar el datos " + error);
    			  $('#btnAlert').click();
    		  }
      	);
    };
    
    $scope.deleteContact = function(contact) {
        swal({
          title: 'Are you sure?',
          text: "You won't be able to revert this!",
          type: 'warning',
          showCancelButton: true,
          confirmButtonColor: '#3085d6',
          cancelButtonColor: '#d33',
          confirmButtonText: 'Yes, delete it!'
        }).then(function () {
            contact.$remove({id:contact.idcontact},function(){
          $scope.contacts.splice($scope.contacts.indexOf(contact), 1);
      });
          swal(
            'Deleted!',
            'Your contact has been deleted.',
            'success'
            )

        })
    };
  };
  
  AppController.$inject = ['$scope', 'Contact'];
  angular.module("SpringApp.controllers").controller("AppController", AppController);



}(angular));
