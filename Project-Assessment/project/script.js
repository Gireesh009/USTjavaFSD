var myApp= angular.module("myList", []);
myApp.controller("myListController", function($scope){
$scope.items=["Angular JS", "React JS","Node JS"];
$scope.newItem=" ";
$scope.pushItem = function(){
    if($scope.newItem !=" "){
    $scope.items.push($scope.newItem);
    $scope.newItem=" ";
    }
    $scope.deleteitem =  function(index){
        $scope.items.splice(index,1);
    }
}
});