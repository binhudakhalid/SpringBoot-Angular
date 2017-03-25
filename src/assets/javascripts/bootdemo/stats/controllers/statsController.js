//= wrapped

(function() {

    angular
        .module("bootdemo.stats")
        .controller("TaskListController", ['statsService',TaskListController])

    function TaskListController(statsService) {}
    function TaskShowController(statsService, taskServiceAdmin, $routeParams,$location){}

    function TaskCreateController(statsService, taskServiceAdmin, $routeParams,$location, $scope){}

}());