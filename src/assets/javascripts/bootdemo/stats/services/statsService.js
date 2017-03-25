
(function() {

    angular
        .module("bootdemo.stats")
        .factory("statsService", taskService)
        .factory("taskServiceAdmin", taskServiceAdmin);

    function statsService(DomainServiceFactory) {}
    
    function taskServiceAdmin(DomainServiceFactory) {}

}());